package cn.yb100.payservice.dto;

import cn.yb100.payservice.remote.dto.TicketOrderPassengerDetailRespDTO;
import lombok.Data;
import java.util.List;

/**
 * 退款创建入参数实体
 */
@Data
public class RefundCreateDTO {

    /**
     * 支付流水号
     */
    private String paySn;

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 退款类型
     */
    private Integer type;

    /**
     * 部分退款车票详情集合
     */
    private List<TicketOrderPassengerDetailRespDTO> refundDetailReqDTOList;
}
