package firstweb.dbutil;

import java.sql.Connection;
import java.sql.DriverManager;

public class Dbutil {
	
	public Connection getConnection() {
		Connection con=null;
		String driverClass="com.mysql.cj.jdbc.Driver";
		String driverUrl="jdbc:mysql://localhost:3306/july";
		String userName="root";
		String password="shruthi";
		
		try {
			Class.forName(driverClass);  
			con=DriverManager.getConnection(driverUrl,userName,password);
			System.out.println("connection established---"+con);
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		
		return con;
		
		
		
	}

	public void emp(String id, String name, String age) {
		// TODO Auto-generated method stub
		
	}

}
