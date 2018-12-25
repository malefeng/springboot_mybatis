package com.fengji.smdemo.controller;

import com.fengji.smdemo.entity.User;
import com.fengji.smdemo.service.IUserInfoService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
//import java.util.List;

@RestController()
@RequestMapping("/test")
public class TestBootController {

    @Resource
    private IUserInfoService userInfoService;

    @RequestMapping(value="showUserInfo")
    @ResponseBody
    public List<User> test(){
        return userInfoService.listUser();
    }

    @RequestMapping("findUser")
    @ResponseBody
    public User findUser(@RequestParam  int id){
        return userInfoService.findUser(id);
    }
}
