package com.yaswanth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
		RestTemplate rt = new RestTemplate();
		String apiUrl = "http://mu.mulesoft-training.com/essentials/united/flights/";
		ResponseEntity<String> getResponse = rt.getForEntity(apiUrl, String.class);
		if(getResponse.getStatusCodeValue()==200) {
			System.out.println(getResponse.getBody());
		}
	}

}
