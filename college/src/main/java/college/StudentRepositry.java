package college;

import java.sql.Connection;
import java.util.List;

public interface StudentRepositry {
	
	Connection getConnection();
	
	Student studentLogin(String email,String password);
	
	String saveStudent(Student student);
	
	Student getStudentById(int id);
	
	String deleteStudentById(int id);
	
	Student updateStudent(Student student);
	
	List<Student> getStudentByStd(String std);
	
	List<Student> getStudentByStdAndsec(String std,String sec);
	
	List<Student> getStudentBetweenPercentage(String lower,String high);
	
	List<Student> getAllStudent();

	 
	
	
	
}
