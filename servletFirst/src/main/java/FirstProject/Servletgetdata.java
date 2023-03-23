package FirstProject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/GETdata")
public class Servletgetdata extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		 int id = Integer.parseInt(req.getParameter("id"));
		 Dto d = new Dto();
		 Dao da = new Dao();
		 Dto dt = da.dataAccess(id);
		 PrintWriter p = resp.getWriter();
		 p.print(dt);
	}
}
