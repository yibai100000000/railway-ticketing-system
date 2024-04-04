package cn.yb100.payservice.handler.base;


import cn.yb100.payservice.dto.base.RefundRequest;
import cn.yb100.payservice.dto.base.RefundResponse;

/**
 * 抽象退款组件
 */
public abstract class AbstractRefundHandler {

    /**
     * 支付退款接口
     *
     * @param payRequest 退款请求参数
     * @return 退款响应参数
     */
    public abstract RefundResponse refund(RefundRequest payRequest);
}
