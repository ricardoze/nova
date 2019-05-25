package com.ricardo.nova.controller;

import com.ricardo.nova.core.JsonData;
import com.ricardo.nova.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/test")
public class TestController {
    @RequestMapping("/page")
    public String testRequest(){
        return "test page";
    }



}
