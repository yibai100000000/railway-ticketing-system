package cn.yb100.userservice.service.handler.filter.user;

import cn.yb100.userservice.common.enums.UserRegisterErrorCodeEnum;
import cn.yb100.userservice.dto.req.UserRegisterReqDTO;
import cn.yb100.userservice.service.UserLoginService;
import lombok.RequiredArgsConstructor;
import org.opengoofy.index12306.framework.starter.convention.exception.ClientException;
import org.springframework.stereotype.Component;

/**
 * 用户注册用户名唯一检验
 */
@Component
@RequiredArgsConstructor
public final class UserRegisterHasUsernameChainHandler implements UserRegisterCreateChainFilter<UserRegisterReqDTO> {

    private final UserLoginService userLoginService;

    @Override
    public void handler(UserRegisterReqDTO requestParam) {
        if (!userLoginService.hasUsername(requestParam.getUsername())) {
            throw new ClientException(UserRegisterErrorCodeEnum.HAS_USERNAME_NOTNULL);
        }
    }

    @Override
    public int getOrder() {
        return 1;
    }
}