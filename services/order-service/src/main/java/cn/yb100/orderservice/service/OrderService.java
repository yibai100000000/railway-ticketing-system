package cn.yb100.orderservice.service;


import cn.yb100.orderservice.dto.domain.OrderStatusReversalDTO;
import cn.yb100.orderservice.dto.req.CancelTicketOrderReqDTO;
import cn.yb100.orderservice.dto.req.TicketOrderCreateReqDTO;
import cn.yb100.orderservice.dto.req.TicketOrderPageQueryReqDTO;
import cn.yb100.orderservice.dto.req.TicketOrderSelfPageQueryReqDTO;
import cn.yb100.orderservice.dto.resp.TicketOrderDetailRespDTO;
import cn.yb100.orderservice.dto.resp.TicketOrderDetailSelfRespDTO;
import cn.yb100.orderservice.mq.event.PayResultCallbackOrderEvent;
import org.opengoofy.index12306.framework.starter.convention.page.PageResponse;

/**
 * 订单接口层
 */
public interface OrderService {

    /**
     * 跟据订单号查询车票订单
     *
     * @param orderSn 订单号
     * @return 订单详情
     */
    TicketOrderDetailRespDTO queryTicketOrderByOrderSn(String orderSn);

    /**
     * 跟据用户名分页查询车票订单
     *
     * @param requestParam 跟据用户 ID 分页查询对象
     * @return 订单分页详情
     */
    PageResponse<TicketOrderDetailRespDTO> pageTicketOrder(TicketOrderPageQueryReqDTO requestParam);

    /**
     * 创建火车票订单
     *
     * @param requestParam 商品订单入参
     * @return 订单号
     */
    String createTicketOrder(TicketOrderCreateReqDTO requestParam);

    /**
     * 关闭火车票订单
     *
     * @param requestParam 关闭火车票订单入参
     */
    boolean closeTickOrder(CancelTicketOrderReqDTO requestParam);

    /**
     * 取消火车票订单
     *
     * @param requestParam 取消火车票订单入参
     */
    boolean cancelTickOrder(CancelTicketOrderReqDTO requestParam);

    /**
     * 订单状态反转
     *
     * @param requestParam 请求参数
     */
    void statusReversal(OrderStatusReversalDTO requestParam);

    /**
     * 支付结果回调订单
     *
     * @param requestParam 请求参数
     */
    void payCallbackOrder(PayResultCallbackOrderEvent requestParam);

    /**
     * 查询本人车票订单
     *
     * @param requestParam 请求参数
     * @return 本人车票订单集合
     */
    PageResponse<TicketOrderDetailSelfRespDTO> pageSelfTicketOrder(TicketOrderSelfPageQueryReqDTO requestParam);
}
