package Dbms.service;

import college.Student;
import college.StudentService;

public class TestStudent {

	public static void main(String[] args) {
		 StudentService stu = new StudentServiceImp();
		 
		 Student stud = new Student();
		 
		 stud.setName("dharma");
		 stud.setEmail("@dharma");
		 stud.setGender("male");
		 stud.setOverAllPercentage("98.55");
		 stud.setParentContact("850045642");
		 stud.setSec("A");
		 stud.setStd("xII");
		 stud.setRemarks("expert at logical");
		 stud.setPassword("dharma");
		 System.out.println(stu.saveStudent(stud));
	}

}
