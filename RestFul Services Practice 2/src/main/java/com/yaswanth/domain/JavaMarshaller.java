package com.yaswanth.domain;
import  javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
public class JavaMarshaller {

	public static void main(String [] args) throws JAXBException {
		Student sagar = new Student();
		sagar.setStudentAge(26);
		sagar.setStudentName("Sagar");
		sagar.setCourseEnrolled("SBMS");
		JAXBContext context = JAXBContext.newInstance(Student.class);
		Marshaller mapper = context.createMarshaller();
		mapper.marshal(sagar, System.out);
	}
}
