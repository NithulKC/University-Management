package University;

import java.util.ArrayList;
import java.util.List;

public class Student {
	private String name;
	private List<Course> enrolledCourse;

	
	public Student(String name) {
		this.name = name;
		this.enrolledCourse= new ArrayList<>();

	
		// TODO Auto-generated method stub

	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Course> getEnrolledCourse() {
		return enrolledCourse;
	}


	public void enrollInCourse(Course course) {
		this.enrolledCourse = enrolledCourse;
	}


	@Override
	public String toString() {
		return name;
	}

}
