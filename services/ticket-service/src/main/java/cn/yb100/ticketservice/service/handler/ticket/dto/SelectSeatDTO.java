package cn.yb100.ticketservice.service.handler.ticket.dto;

import cn.yb100.ticketservice.dto.domain.PurchaseTicketPassengerDetailDTO;
import cn.yb100.ticketservice.dto.req.PurchaseTicketReqDTO;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

/**
 * 选择座位实体
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public final class SelectSeatDTO {

    /**
     * 座位类型
     */
    private Integer seatType;

    /**
     * 座位对应的乘车人集合
     */
    private List<PurchaseTicketPassengerDetailDTO> passengerSeatDetails;

    /**
     * 购票原始入参
     */
    private PurchaseTicketReqDTO requestParam;
}
