package cn.yb100.userservice.dao.mapper;

import cn.yb100.userservice.dao.entity.UserMailDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 用户邮箱表持久层
 */
public interface UserMailMapper extends BaseMapper<UserMailDO> {

    /**
     * 注销用户
     *
     * @param userMailDO 注销用户入参
     */
    void deletionUser(UserMailDO userMailDO);
}
