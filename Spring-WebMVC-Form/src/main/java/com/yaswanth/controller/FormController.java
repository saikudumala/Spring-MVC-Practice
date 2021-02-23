package com.yaswanth.controller;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController {

	@GetMapping("/loadform")
	public String loadUserForm() {
		
		return "index";
	}
	@GetMapping("/saveUser")
	public String handleUsrSubmitBtn(HttpServletRequest req, Model model) {
		String uid = req.getParameter("uid");
		String uname= req.getParameter("uname");
		String uphn = req.getParameter("uphn");
		System.out.println(uid);
		model.addAttribute("msg","user saved successfully");
		return "success";
	}
}
