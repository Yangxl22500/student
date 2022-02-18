package com.yang.student.vo;

import com.yang.student.entity.SysStudent;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
public class SysStudentVO extends SysStudent {

    private Integer page = 1;
    private Integer limit = 10;

    /**
     * 验证码
     */
    private String code;
}
