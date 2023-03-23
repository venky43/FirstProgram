package jspPack;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/ssa")
public class Reqjsp2 extends HttpServlet {
	 
	 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		 HttpSession s= req.getSession();
		 
		 String id = (String)s.getAttribute("id");
		 String name =  (String)s.getAttribute("name");
		 String email =  (String)s.getAttribute("email");
		 
		 PrintWriter p = res.getWriter();
		 p.println(id);
		 p.println(name);
		 p.println(email);
	 }
}


