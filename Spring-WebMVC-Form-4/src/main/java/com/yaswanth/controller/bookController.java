package com.yaswanth.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yaswanth.model.Book;

@Controller
public class bookController {

	@GetMapping("/loadbook")
	public String loadBookForm(Model model) {
		Book b = new Book();
		model.addAttribute("book",b);
		return "index";
	}
	@PostMapping("/savebook")
	public String saveBookData(Book book) {
		System.out.println(book);
		return "success";
	}
}
