package com.example.demo.controller;

import javax.servlet.http.HttpSession;

import com.example.demo.model.LopHocModel;
import com.example.demo.model.UserModel;
import com.example.demo.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class HomeController {
	@Autowired
	private HomeService homeService;
	
	@RequestMapping(value = "/")
	public String home(HttpSession session, Model model) {

		UserModel userModel = (UserModel) session.getAttribute("user");

		if (userModel.isStudent()){
			List<LopHocModel> listLopHoc = homeService.getClassesOfStudent(userModel.getEmail());
			model.addAttribute("lops", listLopHoc);
			System.out.println(listLopHoc);

			return "home-student";
		}

		if(userModel.isTeacher()){
			List<LopHocModel> listLopHoc = homeService.getClassesOfStudent(userModel.getEmail());
			model.addAttribute("lops", listLopHoc);

			return "home-teacher";
		}

		if (userModel.isAdmin()){
			return "redirect:/admin";
		}

		model.addAttribute("messenger", "Bạn không có quyền truy cập");
		return "admin-error";
	}
}