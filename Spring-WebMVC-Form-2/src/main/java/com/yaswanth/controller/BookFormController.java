package com.yaswanth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpServletRequest;
@Controller
public class BookFormController {

	@GetMapping("/loadBookForm")
	public String getBookDetails() {
		return "index";
	}
	@PostMapping("/saveBook")
	public String saveBookDetails(HttpServletRequest req, Model model) {
		String bookname = req.getParameter("bookname");
		String bookAuthor = req.getParameter("bookAuthor");
		model.addAttribute("bname",bookname);
		model.addAttribute("bAuthor",bookAuthor);
		return "success";
	}
}
