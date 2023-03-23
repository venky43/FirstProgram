package Co.nvk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteDb extends HttpServlet{
	protected void doGet(HttpServletRequest req , HttpServletResponse res) {
		 String  no =  req.getParameter( "rollno2");
		 try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/memory_bank";
			String user = "root";
			String password = "root";
			Connection con = DriverManager.getConnection(url,user,password);
			Statement st = con.createStatement();
			String query = "delete * from hospitial where id ="+no;
			 
			 int res1 = st.executeUpdate(query);
			 
			 PrintWriter pq = res.getWriter();
			 pq.print("delete rows = "+res1);
			  
			 con.close();
			} catch (ClassNotFoundException | SQLException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	 }

}
