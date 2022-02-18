package com.yang.student.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class StudentPageController {

    @RequestMapping("/table")
    public String table(){

        return "modules/page/Student/table";
    }
}
