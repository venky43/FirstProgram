package collegeadmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

 
@WebServlet("/aad")
public class mulReqDisPat extends HttpServlet {

	 protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException {
		int a = Integer.parseInt(req.getParameter( "num1"));
		int b = Integer.parseInt(req.getParameter( "num2"));
		int r=a+b;
	 req.setAttribute("k", r);
		
	 RequestDispatcher rd = req.getRequestDispatcher("aa");
		 rd.forward(req, res);
		
		
	}
}
