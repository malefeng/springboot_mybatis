package com.fengji.smdemo.dao;


import com.fengji.smdemo.entity.UserDO;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    public int insert(UserDO record);

    int insertSelective(UserDO record);

    UserDO selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    List<UserDO> listUserInfo();
}