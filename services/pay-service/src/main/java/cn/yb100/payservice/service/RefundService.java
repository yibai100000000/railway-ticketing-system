package cn.yb100.payservice.service;

import cn.yb100.payservice.dto.RefundReqDTO;
import cn.yb100.payservice.dto.RefundRespDTO;

/**
 * 退款接口层
 */
public interface RefundService {

    /**
     * 公共退款接口
     *
     * @param requestParam 退款请求参数
     * @return 退款返回详情
     */
    RefundRespDTO commonRefund(RefundReqDTO requestParam);
}
