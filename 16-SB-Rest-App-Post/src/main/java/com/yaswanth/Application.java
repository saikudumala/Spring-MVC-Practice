package com.yaswanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//This application is developed as a tutorial to learn on how to use POST method in the spring Boot.
		//Post method is used for sending the data securely from client to the server.
		//To make a resource method bind to the POST request we can use @PostMapping annotation
		//To bind the data sent by client to the object we have @RequestBody Annoation
		//***NOTE: Always send the json data with property names starting the lowercase letter.
	}

}
