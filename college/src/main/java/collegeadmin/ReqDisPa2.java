package collegeadmin;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
public class ReqDisPa2 extends HttpServlet {

	 protected void doPost (HttpServletRequest req, HttpServletResponse res) throws IOException {
		 int k = (int) req.getAttribute("k");
		 k=k*k;
		PrintWriter p = res.getWriter();
		p.print(k);
		
		
	}

}
