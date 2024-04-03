package cn.yb100.orderservice.service.impl;

import cn.yb100.orderservice.dao.entity.OrderItemPassengerDO;
import cn.yb100.orderservice.dao.mapper.OrderItemPassengerMapper;
import cn.yb100.orderservice.service.OrderPassengerRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

import org.springframework.stereotype.Service;

/**
 * 乘车人订单关系接口层实现
 */
@Service
public class OrderPassengerRelationServiceImpl extends ServiceImpl<OrderItemPassengerMapper, OrderItemPassengerDO> implements OrderPassengerRelationService {
}
