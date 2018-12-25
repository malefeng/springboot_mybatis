package com.fengji.smdemo.dao;


import com.fengji.smdemo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public interface UserMapper {
    int deleteByPrimaryKey(Integer userId);

    int insert(User record);

    int insertSelective(User record);

    User selectByPrimaryKey(Integer userId);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    List<User> listUserInfo();
}