package com.fengji.smdemo.service;

import com.fengji.smdemo.entity.UserDO;

import java.util.List;

public interface IUserInfoService {
    List<UserDO> listUser();

    UserDO findUser(int id);
}
