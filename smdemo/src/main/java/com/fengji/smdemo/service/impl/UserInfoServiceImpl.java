package com.fengji.smdemo.service.impl;

import com.fengji.smdemo.dao.UserMapper;
import com.fengji.smdemo.entity.UserDO;
import com.fengji.smdemo.service.IUserInfoService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoServiceImpl implements IUserInfoService {

    @Resource
    private UserMapper userDao;

    @Override
    @Transactional(propagation = Propagation.REQUIRED, readOnly = false,rollbackFor = Exception.class)
    public List<UserDO> listUser() {
        userDao.insert(new UserDO(100001,"小明","123","123321123"));
        int a = 1/0;
        userDao.insert(new UserDO(400001,"小明","123","123321123"));
        return userDao.listUserInfo();
    }

    @Override
    public UserDO findUser(int id) {
        return userDao.selectByPrimaryKey(id);
    }
}
