package com.yang.student.entity;


import lombok.Data;

@Data
public class SysStudent {

  private long id;
  private String name;
  private String loginName;
  private String password;
  private Integer sex;
  private java.sql.Time birthday;
  private java.sql.Timestamp createTime;
  private java.sql.Timestamp updateTime;


}
