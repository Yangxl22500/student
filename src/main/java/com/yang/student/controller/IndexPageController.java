package com.yang.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/sys")
public class IndexPageController {

    @RequestMapping(value = "/index", method={RequestMethod.GET})
    public String index(){

        return "modules/index/index";
    }
}
