package com.ricardo.nova.controller;

import com.ricardo.nova.core.JsonData;
import com.ricardo.nova.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService userService;

    @CrossOrigin
    @RequestMapping("/userList")
    public JsonData userList(){
        JsonData result=new JsonData();
        return result.buildSuccessResult(userService.getAllUser());
    }
}
