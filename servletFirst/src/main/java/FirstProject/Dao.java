package FirstProject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Dao {
	public Dto dataAccess(int id) {
	    Dto d = null;
	    try {
	        Class.forName("com.mysql.cj.jdbc.Driver");
	        String url = "jdbc:mysql://localhost:3306/memory_bank";
	        String user = "root";
	        String password = "root";
	        Connection con = DriverManager.getConnection(url, user, password);
	        String sql = "select * from hospitial where id=?";
	        PreparedStatement p = con.prepareStatement(sql);
	        p.setInt(1, id);
	        ResultSet r = p.executeQuery();
	        if (r.next()) {
	            d = new Dto();
	            d.setId(r.getInt("id"));
	            d.setName(r.getString("name"));
	            d.setEmail(r.getString("email"));
	        }
	        con.close();
	        return d;
	    } catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	    }
	    return d;
	}
}
