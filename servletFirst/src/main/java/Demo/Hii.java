package Demo;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
//@WebServlet("/add")
public class Hii extends HttpServlet
{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws   IOException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		 int k=i+j;
		 PrintWriter p = res.getWriter();
		 p.print(k);
		 
	}

}
