package com.nf.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

public class FirstInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response, Object handler) throws Exception {
        System.out.println("first interceptor");
        return true;
    }
}
