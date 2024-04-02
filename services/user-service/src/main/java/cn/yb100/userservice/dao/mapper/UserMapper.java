package cn.yb100.userservice.dao.mapper;

import cn.yb100.userservice.dao.entity.UserDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 用户信息持久层
 */
public interface UserMapper extends BaseMapper<UserDO> {

    /**
     * 注销用户
     *
     * @param userDO 注销用户入参
     */
    void deletionUser(UserDO userDO);
}
