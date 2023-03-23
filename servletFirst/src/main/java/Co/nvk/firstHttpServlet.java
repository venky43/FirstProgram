package Co.nvk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class firstHttpServlet
 */
@WebServlet("/nvk")
public class firstHttpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		 int i = Integer.parseInt(req.getParameter( "fnum"));
		 int j = Integer.parseInt(req.getParameter( "snum"));
		 int a=i+j;
		 PrintWriter pw = res.getWriter();
		 pw.print("the sum of two numbers = " + a);
	}

}
