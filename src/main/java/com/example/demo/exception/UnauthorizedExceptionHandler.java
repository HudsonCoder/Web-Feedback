package com.example.demo.exception;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class UnauthorizedExceptionHandler extends ResponseEntityExceptionHandler {

   @ExceptionHandler(UnauthorizedException.class)
    public String getHandler(Model model){
       model.addAttribute("messenger", "Bạn không có quyền truy cập");
       return "error-messenger";
   }
}
