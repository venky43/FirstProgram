package jspPack;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/hhh")
public class StudentListype extends HttpServlet {
	 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		 Studentdetails  s=new Studentdetails();
		 
		 s.setId(req.getParameter("id"));
		 s.setName(req.getParameter("name"));
		 s.setEmail(req.getParameter("email"));
		 s.setAge(req.getParameter("age"));
		 s.setAddress(req.getParameter("address"));
		 Studentdetails  s1=new Studentdetails("1","venky","@venky","23","dup");
		 Studentdetails  s2=new Studentdetails("2","hemanth","@hemanth","22","nlr");
		 Studentdetails  s3=new Studentdetails("3","surya","@surya","24","vis");
		 Studentdetails  s4=new Studentdetails("4","bhanu","@bhanu","25","nlr");
		 Studentdetails  s5=new Studentdetails("5","rocky","@rocky","26","bng");
		 List<Studentdetails> l = new ArrayList<>();
		 l.add(s1);
		 l.add(s2);
		 l.add(s3);
		 l.add(s4);
		 l.add(s5);
		 
		 
		 HttpSession a= req.getSession();
		 	a.setAttribute("list",l);
 
		 res.sendRedirect("StudentLi.jsp");
	 }


}
