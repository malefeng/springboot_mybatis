package com.fengji.smdemo.service;

import com.fengji.smdemo.entity.User;

import java.util.List;

public interface IUserInfoService {
    List<User> listUser();

    User findUser(int id);
}
