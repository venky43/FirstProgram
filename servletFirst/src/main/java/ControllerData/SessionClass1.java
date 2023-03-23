package ControllerData;

import java.io.IOException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/sess1")
public class SessionClass1 extends HttpServlet{
//	private static final long serialVersionUID = 1L;
	 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws IOException {
		 String id = req.getParameter("id");
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 
		 System.out.println(id);
		 System.out.println(name);
		 System.out.println(email);
		 
		 HttpSession session = req.getSession();
		 session.setAttribute("id", id);
		 session.setAttribute("name", name);
		 session.setAttribute("email", email);
		 
		 
		 res.sendRedirect("sess2");
}
}
