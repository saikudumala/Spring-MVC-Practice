package com.yaswanth.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
@Controller
public class CourseController {
@GetMapping("/courseDetails/{courseID}/{studentName}")
public String courseStats(@PathVariable String courseID,@PathVariable String studentName, Model model) {
	String response = null;
	if(courseID.equals("SBMS")) {
		response="welcome to spring boot course " + studentName;
	}
	else if(courseID.equals("JRTP")) {
		response = "welcome to real time project "+ studentName;
	}
	model.addAttribute("msg", response);
	return "index";
}
}
