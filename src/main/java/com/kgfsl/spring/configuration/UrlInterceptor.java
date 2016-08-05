package com.kgfsl.spring.configuration;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class UrlInterceptor extends HandlerInterceptorAdapter {
	
	@Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
		System.out.println("UrlInterceptor");
		if(modelAndView != null) { 
        	System.out.println("UrlInterceptor + postHandle + IF ");
            modelAndView.addObject("global", "globalTest");
        }
    }


}
