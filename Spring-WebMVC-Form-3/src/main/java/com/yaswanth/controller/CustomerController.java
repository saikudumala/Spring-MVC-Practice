package com.yaswanth.controller;
import java.util.Arrays;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
@Controller
//Practicing query and path parameters
public class CustomerController {
	@GetMapping("/customerDetails")
	public String customerDetails(@RequestParam Integer customerId,Model model) {
		if(customerId==101) {
			model.addAttribute("msg","Sai Yaswanth");
		}
		else if(customerId==102) {
			model.addAttribute("msg", "Hari Charan");
		}
		else if(customerId==103) {
			model.addAttribute("msg","Chandra Sekhar");
		}
		return "index";
	}
	@GetMapping("/AllcustomerDetails")
	public String allCustomerDetails(@RequestParam Integer [] id,Model model) {
		model.addAttribute("msg",Arrays.toString(id));
		return "index";
	}
	@GetMapping("/areastats")
	public String getCustomersCount(@RequestParam("area") String area,@RequestParam("age") Integer age, Model model) {
		String response = null;
		if(area.equals("Hyderabad")&& age>=30) {
			response="we have 110 customers in Hyderabad";
		}
		else if(area.equals("Bangalore")&& age>=25) {
			response="we have 150 customers in Hyderabad";
		}
		model.addAttribute("msg",response);
		return "index";
	}
	}
	
	
