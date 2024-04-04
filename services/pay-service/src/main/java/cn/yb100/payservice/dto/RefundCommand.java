package cn.yb100.payservice.dto;

import cn.yb100.payservice.dto.base.AbstractRefundRequest;
import lombok.Data;


import java.math.BigDecimal;

/**
 * 退款请求命令
 */
@Data
public final class RefundCommand extends AbstractRefundRequest {

    /**
     * 支付金额
     */
    private BigDecimal payAmount;

    /**
     * 交易凭证号
     */
    private String tradeNo;
}
