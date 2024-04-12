package cn.yb100.ticketservice.dto.req;

import lombok.Data;

import java.util.List;

/**
 * 车票子订单查询
 */
@Data
public class TicketOrderItemQueryReqDTO {

    /**
     * 订单号
     */
    private String orderSn;

    /**
     * 子订单记录id
     */
    private List<String> orderItemRecordIds;
}
