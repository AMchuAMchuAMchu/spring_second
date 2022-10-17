package com.itheima.controller.interceptor;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.security.Principal;
import java.util.Arrays;
import java.util.Enumeration;

/**
 * Description ==> TODO
 * BelongsProject ==> spring_second
 * BelongsPackage ==> com.itheima.controller.interceptor
 * Version ==> 1.0
 * CreateTime ==> 2022-10-17 09:58:06
 * Author ==> _02雪乃赤瞳楪祈校条祭_艾米丽可锦木千束木更七草荠_制作委员会_start
 */
@Component
public class AnimeInfoInterceptor implements HandlerInterceptor{

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestURI = request.getRequestURI();
        String remoteUser = request.getRemoteUser();
        Cookie[] cookies = request.getCookies();
        Enumeration<String> headerNames = request.getHeaderNames();
        Principal userPrincipal = request.getUserPrincipal();
        System.out.println("userPrincipal >>> "+userPrincipal);
        System.out.println("headerNames >>> "+headerNames);
        System.out.println("cookies >>> "+Arrays.toString(cookies));
        System.out.println("remoteUser >>> "+remoteUser);
        System.out.println("requestURI >>> "+requestURI);
        System.out.println("preHandle...");
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("postHandle...");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("afterCompletion...");
    }
}
