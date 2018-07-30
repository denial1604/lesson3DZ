package com.gmail.denial1604;

public class Group {
	private Student[] group = new Student[10];

	public void addStudent(Student student) throws MyException {
		for (int i = 0; i < group.length; i++) {
			if (group[i] == null) {
				group[i] = student;
				System.out.println("Student " + student.getName() + " added to this group");
				return;
			} else {
				if (i == group.length - 1) {
					throw new MyException();
				}
			}

		}
	}

	public void delStudent(Student student) {
		for (int i = 0; i < group.length; i++) {
			if (group[i] != null && group[i].getName() == student.getName()) {
				group[i] = null;
				System.out.println("Student " + student.getName() + " have been deleted from this group");
			}

		}
	}

	public Student search(String name) {
		for (Student student : group) {
			if (student != null && student.getName().equals(name)) {
				return student;
			}
		}
		return null;
	}
}
