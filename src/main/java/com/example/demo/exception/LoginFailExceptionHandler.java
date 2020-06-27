package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class LoginFailExceptionHandler extends ResponseEntityExceptionHandler {
    @ExceptionHandler(LoginFailException.class)
    public String redirectToLogin(){
        return "redirect:/login";
    }
}
