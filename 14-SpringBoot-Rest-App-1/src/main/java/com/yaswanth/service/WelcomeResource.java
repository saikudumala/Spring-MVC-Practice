package com.yaswanth.service;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@RestController
@RequestMapping("/api")

public class WelcomeResource {
	  @GetMapping("/welcome")
      public String getWelcomeMessage() {
		  return "Welcome to Restful Services";
	  }
}
