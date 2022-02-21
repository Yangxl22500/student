package com.yang.student.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class LoginConfig implements WebMvcConfigurer {

    @Override
    public void addInterceptors(InterceptorRegistry registry){
        InterceptorRegistration ir=registry.addInterceptor(new Interceptor());
        ir.addPathPatterns("/**");
        ir.excludePathPatterns("/login","/login/**","/js/**","/html/**","/images/**","/css/**");
    }

}
