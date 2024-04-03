/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package cn.yb100.orderservice.service.orderid;

/**
 * 全局唯一订单号生成器
 */
public class DistributedIdGenerator {

    private static final long EPOCH = 1609459200000L;
    private static final int NODE_BITS = 5;
    private static final int SEQUENCE_BITS = 7;

    private final long nodeID;
    private long lastTimestamp = -1L;
    private long sequence = 0L;

    //接受一个节点ID作为参数，初始化节点ID。
    public DistributedIdGenerator(long nodeID) {
        this.nodeID = nodeID;
    }

    public synchronized long generateId() {
        //获取当前时间戳，减去起始时间得到时间戳的偏移量。
        long timestamp = System.currentTimeMillis() - EPOCH;
        //如果当前时间戳小于上一个时间戳，则抛出异常，防止时钟回拨。
        if (timestamp < lastTimestamp) {
            throw new RuntimeException("Clock moved backwards. Refusing to generate ID.");
        }
        //如果当前时间戳等于上一个时间戳，则递增序列号，如果序列号达到最大值，则等待下一个时间戳。
        //如果当前时间戳大于上一个时间戳，则重置序列号为0。
        if (timestamp == lastTimestamp) {
            sequence = (sequence + 1) & ((1 << SEQUENCE_BITS) - 1);
            if (sequence == 0) {
                timestamp = tilNextMillis(lastTimestamp);
            }
        } else {
            sequence = 0L;
        }
        //更新上一个时间戳为当前时间戳。
        //将时间戳左移NODE_BITS + SEQUENCE_BITS位，节点ID左移SEQUENCE_BITS位，序列号与时间戳和节点ID进行位或操作，生成最终的ID。
        lastTimestamp = timestamp;
        return (timestamp << (NODE_BITS + SEQUENCE_BITS)) | (nodeID << SEQUENCE_BITS) | sequence;
    }

    //等待直到下一个时间戳，解决时间戳重复的问题。
    //获取当前时间戳，减去起始时间得到时间戳的偏移量。
    //在当前时间戳小于等于上一个时间戳的情况下，持续获取新的时间戳，直到大于上一个时间戳为止。
    //返回更新后的时间戳。
    private long tilNextMillis(long lastTimestamp) {
        long timestamp = System.currentTimeMillis() - EPOCH;
        while (timestamp <= lastTimestamp) {
            timestamp = System.currentTimeMillis() - EPOCH;
        }
        return timestamp;
    }
}
