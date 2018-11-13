package com.example.demo.Controller;

import com.example.demo.model.User;
import com.example.demo.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Login {

    @Autowired
    private IUserService userService;

    @ResponseBody
    @RequestMapping("/login")
    public User login(){
        return  userService.login();
    }

    @ResponseBody
    @RequestMapping(value = "/showUsers/{pageNum}/{pageSize}")
    public List<User> showUserList(@PathVariable("pageNum") int pageNum, @PathVariable("pageSize") int pageSize){
        return userService.showUsers(pageNum,pageSize);
    }


}
