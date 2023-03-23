package college;

import java.util.List;

public interface StudentService {

Student studentLogin(String email,String password);
	
	String saveStudent(Student student);
	
	Student getStudentById(int id);
	
	Student deleteStudent(int id);
	
	Student updateStudent(Student student);
	
	List<Student> getStudentByStd(String std);
	
	List<Student> getStudentByStdAndsec(String std,String sec);
	
	List<Student> getStudentBetweenPercentage(String lower,String high);
	
	List<Student> getAllStudent();
	
}
