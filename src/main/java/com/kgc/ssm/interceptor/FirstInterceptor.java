package com.kgc.ssm.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("请求前");
        //获取会话请求
        Object admin=request.getSession().getAttribute("user");
        //如果用户已登陆也放行
        if(admin!=null){
            return true;
        }else{
            throw new RuntimeException("用户未登录");
        }
    }

}
