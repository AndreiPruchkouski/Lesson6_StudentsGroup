package by.htp.stringarray;

import java.text.SimpleDateFormat;

public class StudentsGroup {

	// add unlimited number of students
	// print all students from group to console

	private Student[] students;
	private int studentsCounter;

	public void setStudents(Student[] students) {
		if (students != null) {
			this.students = students;
		}
	}

	public Student[] getStudents() {
		return this.students;
	}

	public void addStudents(Student student) {
		if (this.students != null) {
			if (studentsCounter < students.length) {
				students[studentsCounter] = student;
				studentsCounter++;
			} else {
				// Мы уперлись в размер старого массива(он заполнен) и теперь мы создаем новый
				// массив
				Student[] authors = new Student[this.students.length + 10];
				for (int i = 0; i < this.students.length; i++) {
					authors[i] = this.students[i];
				}
				this.students = authors;
				this.students[studentsCounter] = student;
				studentsCounter++;
			}
		} else {
			this.students = new Student[2];
			this.students[0] = student;
			studentsCounter++;
		}
	}
	
	public void printStudents() {
		
		SimpleDateFormat sdfprint = new SimpleDateFormat("dd-MM-yyyy");
		
		for(int i = 0; i < this.students.length; i++) {
			if(this.students[i] !=null) {
				int n = i+1;
				System.out.println("Student #"+ n + " " +  this.students[i].name + " " + this.students[i].surname + " " + sdfprint.format(this.students[i].birthDate));
			}
			
		}
		
	}

}
