package cn.yb100.ticketservice.service.handler.ticket.filter.purchase;

import cn.yb100.ticketservice.dto.req.PurchaseTicketReqDTO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * 购票流程过滤器之验证乘客是否重复购买
 */
@Component
@RequiredArgsConstructor
public class TrainPurchaseTicketRepeatChainHandler implements TrainPurchaseTicketChainFilter<PurchaseTicketReqDTO> {

    @Override
    public void handler(PurchaseTicketReqDTO requestParam) {
        // TODO 重复购买验证后续实现
    }

    @Override
    public int getOrder() {
        return 30;
    }
}
