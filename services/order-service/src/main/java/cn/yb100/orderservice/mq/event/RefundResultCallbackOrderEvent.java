package cn.yb100.orderservice.mq.event;

import cn.yb100.orderservice.common.enums.RefundTypeEnum;
import cn.yb100.orderservice.dto.resp.TicketOrderPassengerDetailRespDTO;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * 退款结果回调订单服务事件
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public final class RefundResultCallbackOrderEvent {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型枚举
     */
    private RefundTypeEnum refundTypeEnum;

    /**
     * 部分退款车票详情
     */
    private List<TicketOrderPassengerDetailRespDTO> partialRefundTicketDetailList;
}
