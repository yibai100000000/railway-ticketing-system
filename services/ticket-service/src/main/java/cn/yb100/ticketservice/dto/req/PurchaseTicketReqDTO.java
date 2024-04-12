package cn.yb100.ticketservice.dto.req;

import cn.yb100.ticketservice.dto.domain.PurchaseTicketPassengerDetailDTO;
import lombok.Data;
import java.util.List;

/**
 * 购票请求入参
 */
@Data
public class PurchaseTicketReqDTO {

    /**
     * 车次 ID
     */
    private String trainId;

    /**
     * 乘车人
     */
    private List<PurchaseTicketPassengerDetailDTO> passengers;

    /**
     * 选择座位
     */
    private List<String> chooseSeats;

    /**
     * 出发站点
     */
    private String departure;

    /**
     * 到达站点
     */
    private String arrival;
}
