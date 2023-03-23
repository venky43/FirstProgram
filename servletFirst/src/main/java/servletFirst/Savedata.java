package servletFirst;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class Savedata
 */
@WebServlet("/save")
public class Savedata extends GenericServlet {
	private static final long serialVersionUID = 1L;

	 
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 String name = req.getParameter("name");
		 String email = req.getParameter("email");
		 UserDto u = new UserDto();
		 u.setName(name);
		 u.setEmail(email);
		 UserDao a = new UserDao();
		 a.save(u);
		 PrintWriter p = res.getWriter();
		 p.print("<h1>Successful update</h1>");
	}

}
