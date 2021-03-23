package com.yaswanth.domain;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonProperty;
@JsonInclude(value=Include.NON_NULL)
public class Student {
	@JsonProperty("Name")
	private String StudentName;
	private int StudentAge;
	private String CourseEnrolled;
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
		return CourseEnrolled;
	}
	public void setCourseEnrolled(String courseEnrolled) {
		CourseEnrolled = courseEnrolled;
	}
	@Override
	public String toString() {
		return "Student [StudentName=" + StudentName + ", StudentAge=" + StudentAge + ", CourseEnrolled="
				+ CourseEnrolled + "]";
	}
	

}
