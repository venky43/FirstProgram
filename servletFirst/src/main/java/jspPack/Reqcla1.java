package jspPack;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Reqcla1 extends HttpServlet {
	 
	 protected void doPost(HttpServletRequest req , HttpServletResponse res) throws ServletException, IOException {
		 RequestDispatcher rd = req.getRequestDispatcher("traildisplayreq.jsp");
		 req.setAttribute( "class", "jEE class");
		 rd.forward(req, res);
		  
	 }
}
