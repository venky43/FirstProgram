package servletFirst;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {

	public static void save(UserDto u)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","root");
			String sql = "insert into login values(?,?,?)";
			PreparedStatement p = con.prepareStatement(sql);
			p.setInt(1,u.getId());
			p.setString(2,u.getName());
			p.setString(3, u.getEmail());
			p.executeUpdate();
			con.close();
		} catch (ClassNotFoundException | SQLException e) {
			 
			e.printStackTrace();
		}
	}
	public static UserDto Get(int id)
	{
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/app","root","root");
			String s = "select * from login where id=?";
			PreparedStatement p = con.prepareStatement(s);
			p.setInt(1, id);
			ResultSet r = p.executeQuery();
			
			UserDto u = new UserDto();
			if(r.next());
			{
			u.setId(r.getInt(1));
			u.setName(r.getString(2));
			u.setEmail(r.getString(3));
			con.close();
			}
			return u;
			
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		
	}
}
