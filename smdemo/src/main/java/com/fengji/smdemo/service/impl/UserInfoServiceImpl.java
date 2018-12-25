package com.fengji.smdemo.service.impl;

import com.fengji.smdemo.dao.UserMapper;
import com.fengji.smdemo.entity.User;
import com.fengji.smdemo.service.IUserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserMapper userDao;
    @Override
    public List<User> listUser() {
        return userDao.listUserInfo();
    }

    @Override
    public User findUser(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
