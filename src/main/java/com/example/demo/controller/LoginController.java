package com.example.demo.controller;

import com.example.demo.model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.demo.service.LoginService;

import javax.servlet.http.HttpServletRequest;

@Controller
public class LoginController {
	
	@Autowired
	private LoginService loginService;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		if (request.getSession().getAttribute("user") == null){
			return "login";
		}

		return "redirect:/";
	}

	@RequestMapping(value = "/logout", method = RequestMethod.GET)
	public String logout(HttpServletRequest request){
		request.getSession().removeAttribute("user");
		return "redirect:login";
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(
			@RequestParam("username") String email,
			@RequestParam("password") String password,
			HttpServletRequest request,
			Model model){
		
		UserModel userModel = loginService.login(email, password);

		if(userModel == null) {
			model.addAttribute("messenger", "Email hoặc mật khẩu không chính xác!");
			return "login";
		}

		request.getSession().setAttribute("user", userModel);

		return "redirect:/";
	}
}
