package com.yaswanth.domain;
import java.io.File;
import java.io.IOException;
import java.util.List;
import com.yaswanth.domain.Student;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
//Class ObjectMapper can be used to read the values from the JSON file.
//Note: For reading the list of students , use typereference.
public class JsonDeserializer  {
	public static void main(String [] args) throws JsonParseException, JsonMappingException, IOException {
		ObjectMapper deMapper = new ObjectMapper();
	    //Student newStudentData =  deMapper.readValue(new File("student.json"),Student.class);
	    List<Student> studentsList = deMapper.readValue(new File("student.json"), new TypeReference<List<Student>>() {});
	    for(Student student : studentsList) {
	    	System.out.println(student.toString());
	    }
	}
	
}
