package com.yaswanth.domain;

public class Student {
	String StudentName;
	int StudentAge;
	String CourseEnrolled;
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
