package com.yang.student.service.impl;

import com.yang.student.entity.SysStudent;
import com.yang.student.mapper.StudentMapper;
import com.yang.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public SysStudent selectStu(SysStudent student) {
//        return studentMapper.selectById(student.getId());
        return studentMapper.login(student);
    }
}
