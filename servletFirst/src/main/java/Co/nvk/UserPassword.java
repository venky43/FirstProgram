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
@WebServlet("/loginsevlet")
public class UserPassword extends HttpServlet {
	private static final long serialVersionUID = 1L;
	 
	 protected void doGet(HttpServletRequest req , HttpServletResponse res) {
		 int user = Integer.parseInt(req.getParameter("uname"));
		 String password = req.getParameter("upassword");
		 
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url= "jdbc:mysql://localhost:3306/memory_bank";
			String user1 = "root";
			String password1 = "root";
			Connection con = DriverManager.getConnection(url,user1,password1);
			Statement st = con.createStatement();
			String sql = "select * from hospitial where id="+user+" and name='"+password+"'";
			 ResultSet rs = st.executeQuery(sql);
			 PrintWriter p = res.getWriter();
			 if(rs.next()) {
				p.println( rs.getInt(1));
				p.println( rs.getString(2));
				p.println( rs.getString(3));
			 }else {
				 p.println("Not A Valid User");
			 }
		} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 
}

	 
}
