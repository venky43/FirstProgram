package college;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import Dbms.service.AppConstants;

 //this method is used to achieve connection with data base

public class ConnectionUtil {

	public static  Connection getConnection() {
	 
			try {
				Class.forName(AppConstants.DRIVERNAME);
				String url =  AppConstants.DB_URL;
				String user = AppConstants.DB_USERNAME;
				String password = AppConstants.DB_PASSWORD;
				 
				System.out.println("get connection");
				return DriverManager.getConnection(url,user,password);
			} catch (SQLException | ClassNotFoundException e) {
				e.printStackTrace();
			}
			return null;
		
	}
}
