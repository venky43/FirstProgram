package firstGeneric;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;

/**
 * Servlet implementation class FirstGenericType
 */
@WebServlet("/c")
public class FirstGenericType extends GenericServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest req , ServletResponse res ) throws ServletException, IOException {
		int i = Integer.parseInt(req.getParameter("numb1"));
		int j = Integer.parseInt(req.getParameter("numb2"));
		int c= i+j;
		
		PrintWriter pw = res.getWriter();
		pw.print("the sum of two numbers = "+c);
	}

}
