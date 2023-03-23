package Dbms.service;

import java.util.List;

import college.Student;
import college.StudentRepositry;
import college.StudentRepositryImp;
import college.StudentService;

public class StudentServiceImp implements StudentService {
	
	StudentRepositry r;
	{
		r = new StudentRepositryImp();
	}
	
	@Override
	public Student studentLogin(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String saveStudent(Student student) {
		 String encEmail=AES.encrypt(student.getEmail(), AppConstants.SECRETKEY);
		 String encAddress=AES.encrypt(student.getAddress(), AppConstants.SECRETKEY);
		 String encParentConstant = AES.encrypt(student.getParentContact(), AppConstants.SECRETKEY);
		 String encPassword = AES.encrypt(student.getPassword(), AppConstants.SECRETKEY);
		 student.setEmail(encEmail);
		 student.setAddress(encEmail);
		 student.setParentContact(encParentConstant);
		 student.setPassword(encEmail);
		 
		 
		return r.saveStudent(student);
	}

	@Override
	public Student getStudentById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student deleteStudent(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Student updateStudent(Student student) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStd(String std) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentByStdAndsec(String std, String sec) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getStudentBetweenPercentage(String lower, String high) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> getAllStudent() {
		// TODO Auto-generated method stub
		return null;
	}

}
