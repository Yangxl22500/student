package com.yang.student.controller;

import com.yang.student.entity.SysStudent;
import com.yang.student.mapper.StudentMapper;
import com.yang.student.vo.AjaxResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/student")
public class StudentController {

    @Autowired
    private StudentMapper studentMapper;

    @RequestMapping("/selectAll")
    public AjaxResult login(SysStudent student){
        AjaxResult ajaxResult = new AjaxResult();
        ajaxResult.setCode(0);
        ajaxResult.setData(studentMapper.selectList(null));
        return ajaxResult;
    }
}
