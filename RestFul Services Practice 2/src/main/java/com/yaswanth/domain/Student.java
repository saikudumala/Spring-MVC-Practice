package com.yaswanth.domain;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Student {
	private String StudentName;
	private int StudentAge;
	private String courseEnrolled;
	public String getStudentName() {
		return StudentName;
	}
	public void setStudentName(String studentName) {
		StudentName = studentName;
	}
	public int getStudentAge() {
		return StudentAge;
	}
	public void setStudentAge(int studentAge) {
		StudentAge = studentAge;
	}
	public String getCourseEnrolled() {
		return courseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		this.courseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentAge=" + StudentAge + ", courseEnrolled="
				+ courseEnrolled + "]";
	}
	
	
}
