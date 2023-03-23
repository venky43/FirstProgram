package ControllerData;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import servletFirst.UserDto;

@WebServlet("/getDataById")
public class getDataById extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id=Integer.parseInt(req.getParameter("id"));
		 
		  DaoUser dao = new  DaoUser();
		  
		  UserDto sto = dao.getDataById(id);
		  
		  PrintWriter p = resp.getWriter();
		  p.print(sto);
	}
}
