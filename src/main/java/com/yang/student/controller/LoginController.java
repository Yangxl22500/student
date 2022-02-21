package com.yang.student.controller;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.LineCaptcha;
import com.yang.student.common.AjaxResult;
import com.yang.student.entity.SysStudent;
import com.yang.student.service.StudentService;
import com.yang.student.vo.SysStudentVO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@RestController
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private StudentService service;

    @RequestMapping(value = "/login", method={RequestMethod.POST})
    public AjaxResult login(SysStudentVO studentVO, String code, HttpSession session){

        String Code = (String)session.getAttribute("code");
        if (code != null && code.equals(Code)){
//            Subject subject = SecurityUtils.getSubject();
//            AuthenticationToken token = new UsernamePasswordToken(studentVO.getLoginName(),studentVO.getPassword());
            session.setAttribute("currentUser", studentVO);
            SysStudent sysStudent = service.selectStu(studentVO);
            if (sysStudent != null && sysStudent.getLoginName().equals(studentVO.getLoginName()) && sysStudent.getPassword().equals(studentVO.getPassword())){
                return AjaxResult.LOGIN_SUCCESS;
            }else {
                return AjaxResult.LOGIN_ERROR_PASS;
            }
        }
        return AjaxResult.LOGIN_ERROR_CODE;
    }

    /**
     * 得到登陆验证码
     * @param response
     * @param session
     * @throws IOException
     */
    @RequestMapping("/getCode")
    public void getCode(HttpServletResponse response, HttpSession session) throws IOException{
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(116, 36,4,5);
        session.setAttribute("code",lineCaptcha.getCode());
        try {
            ServletOutputStream outputStream = response.getOutputStream();
            lineCaptcha.write(outputStream);
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
