package cn.yb100.ticketservice.service.handler.ticket.filter.query;

import cn.yb100.ticketservice.common.enums.TicketChainMarkEnum;
import cn.yb100.ticketservice.dto.req.TicketPageQueryReqDTO;
import org.opengoofy.index12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * 列车车票查询过滤器
 */
public interface TrainTicketQueryChainFilter<T extends TicketPageQueryReqDTO> extends AbstractChainHandler<TicketPageQueryReqDTO> {

    @Override
    default String mark() {
        return TicketChainMarkEnum.TRAIN_QUERY_FILTER.name();
    }
}
