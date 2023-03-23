package servletFirst;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/ok")
public class GetData extends GenericServlet {
	private static final long serialVersionUID = 1L;
	private UserDto userDto;

	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
	   
	  int id = Integer.parseInt(req.getParameter("india"));
	System.out.println(id);
	    
	   UserDto  u = new UserDto();
	   UserDao d = new UserDao();
	   UserDto u1 = d.Get(id);
	   
	    PrintWriter out = res.getWriter();
	    out.println("<h1>User information:</h1>");
	    out.println("<table>");
	    out.println("<tr><td>ID:</td><td>" +  u1.getId() + "</td></tr>");
	    out.println("<tr><td>Name:</td><td>" +  u1.getName() + "</td></tr>");
	    out.println("<tr><td>Email:</td><td>" +  u1.getEmail() + "</td></tr>");
	    out.println("</table>");
	}


}
