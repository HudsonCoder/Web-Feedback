package com.example.demo.config;

import com.example.demo.exception.LoginFailException;
import com.example.demo.model.UserModel;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Configuration
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserModel userModel = (UserModel) request.getSession().getAttribute("user");

        String path = request.getRequestURI().substring(request.getContextPath().length());

        if(path.equals("/login") || path.equals("/register")){
            return true;
        }

        if (path.startsWith("/images") || path.startsWith("/resources")){
            return true;
        }

        if (userModel == null){
            throw new LoginFailException("Login requite");
        }

        return true;
    }
}
