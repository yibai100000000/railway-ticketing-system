package cn.yb100.payservice.handler.base;

import cn.yb100.payservice.dto.base.PayRequest;
import cn.yb100.payservice.dto.base.PayResponse;

/**
 * 抽象支付组件
 */
public abstract class AbstractPayHandler {

    /**
     * 支付抽象接口
     *
     * @param payRequest 支付请求参数
     * @return 支付响应参数
     */
    public abstract PayResponse pay(PayRequest payRequest);
}
