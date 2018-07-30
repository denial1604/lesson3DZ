package com.gmail.denial1604;

public class Student extends Human {
	private String faculty;
	private int course;

	public Student(String name, int age, boolean sex, String faculty, int course) {
		super(name, age, sex);
		this.faculty = faculty;
		this.course = course;
	}

	public Student() {
		super();
	}

	public String getFaculty() {
		return faculty;
	}

	public int getCourse() {
		return course;
	}

	@Override
	public String toString() {
		return "Student [faculty=" + faculty + ", course=" + course + super.toString();
	}

}
