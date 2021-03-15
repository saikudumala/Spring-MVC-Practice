package com.yaswanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		//Steps to create web application:
		//1.Create Spring boot application with spring-boot-starter dependecy.(Note: Use WAR as packaging scheme)
		//2.Create a class and use rest controller annotation to make that class as a resource.
		//3.Bind that class to a url pattern using request mapping annotation.
		//4.Write required methods and bind them to http protocol methods.
		//5.Configure the server port in the application.properties file.
		//6.Run the application and test it.
	}

}
