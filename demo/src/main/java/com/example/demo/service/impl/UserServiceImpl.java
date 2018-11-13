package com.example.demo.service.impl;

import com.example.demo.mapper.UserMapper;
import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements IUserService {

    @Autowired
    private UserMapper userMapper;

    @Override
    public User login() {
        return userMapper.selectOne();
    }

    @Override
    public List<User> showUsers(int pageNum, int pageSize) {

        PageHelper.startPage(pageNum,pageSize);
        return userMapper.selectAllUser();
    }


}
