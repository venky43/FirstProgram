package jspPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/stGG")
public class StudentDetai extends HttpServlet {
		@Override
		 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
			Studentdetails  s=new Studentdetails();
			 
			 s.setId(req.getParameter("id"));
			 s.setName(req.getParameter("name"));
			 s.setEmail(req.getParameter("email"));
			 s.setAge(req.getParameter("age"));
			 s.setAddress(req.getParameter("address"));
		//	 System.out.println(s);
			 HttpSession a= req.getSession();
			 	a.setAttribute("venky",s);
//			  RequestDispatcher rd = req.getRequestDispatcher("student.jsp");
//			  rd.forward(req,res);
			 res.sendRedirect("Stud11.jsp");
		 }
	}


