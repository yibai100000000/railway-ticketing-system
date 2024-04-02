package cn.yb100.userservice.service.handler.filter.user;

import cn.yb100.userservice.common.enums.UserChainMarkEnum;
import cn.yb100.userservice.dto.req.UserRegisterReqDTO;
import org.opengoofy.index12306.framework.starter.designpattern.chain.AbstractChainHandler;

/**
 * 用户注册责任链过滤器
 */
public interface UserRegisterCreateChainFilter<T extends UserRegisterReqDTO> extends AbstractChainHandler<UserRegisterReqDTO> {

    @Override
    default String mark() {
        return UserChainMarkEnum.USER_REGISTER_FILTER.name();
    }
}
