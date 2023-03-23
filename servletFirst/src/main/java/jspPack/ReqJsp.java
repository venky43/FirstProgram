package jspPack;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/trpp")
public class ReqJsp extends HttpServlet {
		 
		 protected void doPost(HttpServletRequest req , HttpServletResponse res) {
			 
			 String id = req.getParameter("id");
			 String name = req.getParameter("name");
			 String email = req.getParameter("email");
			 System.out.println(id);
			 System.out.println(name);
			 System.out.println(email);
		 }
	}


