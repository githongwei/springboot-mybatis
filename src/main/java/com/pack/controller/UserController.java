package com.pack.controller;

import com.pack.po.User;
import com.pack.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;
import java.util.List;

/**
 * @ClassName UserController
 * @Description TODO
 * @Author zhaohongwei
 * @Date 2018/8/7 14:35
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;

    @ResponseBody
    @RequestMapping(value = "/index")
    public String indexUser(){
        List<User> users = userService.queryUser();
        return users.get(0).getName();
    }

}
