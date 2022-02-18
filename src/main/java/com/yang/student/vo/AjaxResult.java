package com.yang.student.vo;

import lombok.Data;

@Data
public class AjaxResult {

    /**
     *  是否成功
     */
    private boolean success = true;
    /**
     *  状态
     */
    private Integer code;

    /**
     * 数据
     */
    private Object data;

    /**
     * 信息
     */
    private String message;

    /**
     * 类型
     */
    private String type;

}
