package com.yang.student.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AjaxResult {

    private Integer code;
    private String msg;

    public static final AjaxResult LOGIN_SUCCESS = new AjaxResult(Constast.OK,"登录成功");
    public static final AjaxResult LOGIN_ERROR_PASS = new AjaxResult(Constast.ERROR,"用户名或密码错误");
    public static final AjaxResult LOGIN_ERROR_CODE = new AjaxResult(Constast.ERROR,"验证码错误");


}
