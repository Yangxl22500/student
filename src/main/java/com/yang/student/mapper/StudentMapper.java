package com.yang.student.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.yang.student.entity.SysStudent;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface StudentMapper extends BaseMapper<SysStudent> {

    SysStudent login(SysStudent student);
}
