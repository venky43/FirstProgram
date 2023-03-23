package ControllerData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/sess2")
public class SessionClass2 extends HttpServlet{
	private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		 HttpSession ses = req.getSession();
		 
		 String id = (String) ses.getAttribute("id");
		 String name = (String) ses.getAttribute("name");
		 String email = (String) ses.getAttribute("email");
		 
		 PrintWriter p = res.getWriter();
		 
		 p.println(id);
		 p.println(name);
		 p.println(email);
		 
		 Studentss st = new Studentss();
		 st.setId(Integer.parseInt(id));
		 st.setName(name);
		 st.setName(email);
		 ses.setAttribute("st", st);
//		 ses.removeAttribute("id");
//		 ses.removeAttribute("name");
//		 ses.removeAttribute("email");
		 
		 res.sendRedirect("s3");
}
}
