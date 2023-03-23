package college;

import java.sql.Connection;

public interface AdminRepositry {
	Connection getconnection();
	
	String getAdmin(Admin admin);
	
	Admin adminLogin(String adminName, String password);
}
