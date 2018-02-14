package by.htp.stringarray;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainAppStringArray {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
		Date date1 = sdf.parse("17-11-1987");
		Date date2 = sdf.parse("18-11-1987");
		Date date3 = sdf.parse("19-11-1987");
		Date date4 = sdf.parse("20-11-1987");
		Date date5 = sdf.parse("21-11-1987");
		
		Student stud1 = new Student("Name1", "Surname1", date1);
		Student stud2 = new Student("Name2", "Surname2", date2);
		Student stud3 = new Student("Name3", "Surname3", date3);
		Student stud4 = new Student("Name4", "Surname4", date4);
		Student stud5 = new Student("Name5", "Surname5", date5);
		
		StudentsGroup group = new StudentsGroup();
		
		group.addStudents(stud1);
		group.addStudents(stud2);
		group.addStudents(stud3);
		group.addStudents(stud4);
		group.addStudents(stud5);
		
		group.printStudents();
		
	}

}
