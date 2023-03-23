package Co.nvk;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
@WebServlet("/firstServlet")
public class firstServlet implements Servlet{
	ServletConfig config;
	 
	@Override
	public void init(ServletConfig config) throws ServletException {
		 this.config=config;
	
	}
public void service(ServletRequest req,ServletResponse res) throws IOException {
	 PrintWriter pw = res.getWriter();
	 pw.println("<b>venky</b>");
}
@Override
public ServletConfig getServletConfig() {
	 
	return null;
}
@Override
public String getServletInfo() {
	 
	return null;
}
@Override
public void destroy() { 	 
	
}

}
