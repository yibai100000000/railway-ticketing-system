package cn.yb100.payservice.convert;


import cn.yb100.payservice.common.enums.PayChannelEnum;
import cn.yb100.payservice.dto.RefundCommand;
import cn.yb100.payservice.dto.base.AliRefundRequest;
import cn.yb100.payservice.dto.base.RefundRequest;
import org.opengoofy.index12306.framework.starter.common.toolkit.BeanUtil;
import java.util.Objects;

/**
 * 退款请求入参转换器
 */
public final class RefundRequestConvert {

    /**
     * {@link RefundCommand} to {@link RefundRequest}
     *
     * @param refundCommand 退款请求参数
     * @return {@link RefundRequest}
     */
    public static RefundRequest command2RefundRequest(RefundCommand refundCommand) {
        RefundRequest refundRequest = null;
        if (Objects.equals(refundCommand.getChannel(), PayChannelEnum.ALI_PAY.getCode())) {
            refundRequest = BeanUtil.convert(refundCommand, AliRefundRequest.class);
        }
        return refundRequest;
    }
}
