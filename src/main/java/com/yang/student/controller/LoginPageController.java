package com.yang.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginPageController {


    @RequestMapping("/")
    public String index(){
        return "/index";
    }

    @RequestMapping("/login")
    public String login(){
        return "modules/index/login";
    }
}
