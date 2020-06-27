package com.example.demo.config;

import com.example.demo.exception.UnauthorizedException;
import com.example.demo.model.UserModel;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Configuration
public class AuthorizedInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        UserModel userModel = (UserModel) request.getSession().getAttribute("user");

        String path = request.getRequestURI().substring(request.getContextPath().length());

        if (path.contains("/admin")){
            if (!userModel.isAdmin()){
                throw new UnauthorizedException("Unauthorized");
            }
        }

        if (path.startsWith("/feedback")){
            if (!userModel.isStudent()){
                throw new UnauthorizedException("Unauthorized");
            }
        }

        if (path.startsWith("/viewfeedback")){
            if (!userModel.isTeacher()){
                throw new UnauthorizedException("Unauthorized");
            }
        }

        return true;
    }
}
