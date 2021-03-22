package com.yaswanth.domain;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
public class JsonSerializer {

	public static void main(String [] args) throws JsonProcessingException {
		Student Yaswanth = new Student();
		Yaswanth.setStudentName("yaswanth");
		Yaswanth.setStudentAge(25);
		Yaswanth.setCourseEnrolled("Restful Services");
		ObjectMapper Mapper = new ObjectMapper();
		String ModifiedJsonString = Mapper.writeValueAsString(Yaswanth);
		System.out.println(ModifiedJsonString);
	}
}
