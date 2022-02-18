package com.yang.student.controller;

import org.apache.shiro.authc.AuthenticationToken;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class LoginControllerTest {

    @Test
    void test(){
        AuthenticationToken token = new UsernamePasswordToken("system", "532ac00e86893901af5f0be6b704dbc7");
        System.out.println(token);
    }
}