package ControllerData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/s3")
public class SessionClass3 {
	//private static final long serialVersionUID = 1L;
	 protected void doGet(HttpServletRequest req , HttpServletResponse res) throws IOException {
		 HttpSession se = req.getSession();
		 
		Studentss s = (Studentss) se.getAttribute("st");
		 PrintWriter p = res.getWriter();
		 p.print(s);
		 
		 
		 
		 
}
}