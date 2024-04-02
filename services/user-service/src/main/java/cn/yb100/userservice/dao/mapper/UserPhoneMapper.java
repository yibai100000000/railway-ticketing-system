package cn.yb100.userservice.dao.mapper;

import cn.yb100.userservice.dao.entity.UserPhoneDO;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;


/**
 * 用户手机号持久层
 */
public interface UserPhoneMapper extends BaseMapper<UserPhoneDO> {

    /**
     * 注销用户
     *
     * @param userPhoneDO 注销用户入参
     */
    void deletionUser(UserPhoneDO userPhoneDO);
}
