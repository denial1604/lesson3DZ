package com.gmail.denial1604;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Group group = new Group();
		Student stOne = new Student("Phill", 17, true, "IT", 1);
		Student stTwo = new Student("Bob", 18, true, "IT", 1);
		Student stThree = new Student("Anna", 17, false, "IT", 1);
		Student stFour = new Student("Sam", 18, true, "IT", 1);
		Student stFive = new Student("Sarah", 17, false, "IT", 1);
		Student stSix = new Student("Jack", 17, true, "IT", 1);
		Student stSeven = new Student("John", 18, true, "IT", 1);
		Student stEight = new Student("Andrew", 17, true, "IT", 1);
		Student stNine = new Student("Lily", 17, false, "IT", 1);
		Student stTen = new Student("Ben", 22, true, "IT", 1);
		Student stEleven = new Student("Will", 16, true, "IT", 1);

		try {
			group.addStudent(stOne);
			group.addStudent(stTwo);
			group.addStudent(stThree);
			group.addStudent(stFour);
			group.addStudent(stFive);
			group.addStudent(stSix);
			group.addStudent(stSeven);
			group.addStudent(stEight);
			group.addStudent(stNine);
			group.addStudent(stTen);
			group.addStudent(stEleven);
		} catch (MyException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
