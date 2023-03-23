package college;

import java.sql.Connection;
import java.util.List;

public interface TeacherRepositry {

	 
	
	
	Teacher TeacherLogin(String email,String password);
	String saveTeacher(Teacher teacher);
	
	
	Teacher getTeacherById(int id);
	
	String deleteTeacher(int id);
	
	Teacher updateTeacher(Teacher t);
	
	List<Teacher> getTeacherBySubject(String subject);
	
	List<Teacher> getClassTeacher(String classteacher);
	List<Teacher> getTeacherBySal(int sal);
	List<Teacher> getAllTeacher();


	 
	
	
	
	
}
