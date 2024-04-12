package cn.yb100.ticketservice.service.handler.ticket.filter.refund;


import cn.yb100.ticketservice.common.enums.TicketChainMarkEnum;
import cn.yb100.ticketservice.dto.req.RefundTicketReqDTO;
import org.opengoofy.index12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * 列车车票退款过滤器
 */
public interface TrainRefundTicketChainFilter<T extends RefundTicketReqDTO> extends AbstractChainHandler<RefundTicketReqDTO> {

    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_REFUND_TICKET_FILTER.name();
    }
}
