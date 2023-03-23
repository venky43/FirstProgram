package Co.nvk;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletToData
 */
@WebServlet("/rowdy")
public class ServletToData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest req , HttpServletResponse res ) throws ServletException, IOException {
		int no = Integer.parseInt( req.getParameter("id"));
		String name =   req.getParameter("ename");
		String mail =   req.getParameter("email");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url = "jdbc:mysql://localhost:3306/memory_bank";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url, user, password);
        
            Statement s = con.createStatement();
            String sql = "INSERT INTO hospitial VALUES("+no+",'"+name+"','"+mail+"')";
            s.executeUpdate(sql);
            PrintWriter p = res.getWriter();
            p.println("record added");
           con.close();
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
		}
	}

}

