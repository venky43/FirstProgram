package college;

import java.util.ArrayList;
import java.util.List;

public class TestSaveStudent {

	public static void main(String[] args) {
//		 Student studen = new Student();
//		 studen.setId(3);
//		 studen.setName("venky");
//		 studen.setEmail("@venky");
//		 studen.setStd("9");
//		 studen.setSec("A");
//		 studen.setOverAllPercentage("99.99");
//		 studen.setGender("male");
//		 studen.setParentContact("12655659+79");	 
//		 studen.setRemarks("good");
//		 studen.setAddress("banglore");
//		 studen.setPassword("11223");
//		 StudentRepositryImp r= new StudentRepositryImp();
//		 System.out.println(r.saveStudent(studen));
 	
//		StudentRepositry res= new StudentRepositryImp();
//	 Student student = res.studentLogin("@legain","11223");
//	 if(student != null) {
//		 System.out.println(student.getName());
//	 }else {
//		 System.out.println("Invalid user or password");
//	 }
		
		//get StudentById	
//		 StudentRepositryImp r= new StudentRepositryImp();
//		 Student l= r.getStudentById(3);
//		 System.out.println(l);

		
		//Delete operation
//		 StudentRepositryImp r= new StudentRepositryImp();
//		 System.out.println(r.deleteStudentById(1));
		
	 
		 StudentRepositryImp r= new StudentRepositryImp();
		 
	List<Student> s=  r.getStudentByStd("9");
	for(Student a:s) {
		 System.out.println(a);
	}
		 
		
	}

}
