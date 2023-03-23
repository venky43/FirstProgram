package Co.nvk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet("/save4")
public class DbTServletW extends HttpServlet {
	private static final long serialVersionUID = 1L;
 protected void doGet(HttpServletRequest req , HttpServletResponse res) {
	 
	 int rollno = Integer.parseInt(req.getParameter( "rollno1"));
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url = "jdbc:mysql://localhost:3306/memory_bank";
		String user = "root";
		String password = "root";
		Connection con = DriverManager.getConnection(url,user,password);
		Statement st = con.createStatement();
		String query = "select * from hospitial where id ="+rollno;
		
		ResultSet rs = st.executeQuery(query);
		rs.next();
		
		PrintWriter p = res.getWriter();
		p.println("no :"+rs.getInt(1));
		p.println("name :"+rs.getString(2));
		p.println("email :"+rs.getString(3));
		 
		} catch (ClassNotFoundException | SQLException | IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
 
}

}
