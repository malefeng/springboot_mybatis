package com.example.demo.service;

import com.example.demo.model.User;

import java.util.List;

public interface IUserService {
    public User login();

    public List<User> showUsers(int pageNum, int pageSize);
}
