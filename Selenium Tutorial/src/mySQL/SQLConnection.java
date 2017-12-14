package mySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.testng.annotations.Test;

public class SQLConnection {
	
	@Test
	public void testDB() throws Exception {
		
		//Calling the connection driver class.....
		Class.forName("com.mysql.jdbc.Driver");
		//Creating connection with database.....
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/selenium","root","root");
		//Creating statement.....
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery("select * from selenium.credentials");
		
		while(rs.next()) {
			
			String user = rs.getString("UserName");
			String password = rs.getString("Password");
			String date = rs.getString("DateCreated");
			String attempts = rs.getString("NoOfAttempts");
			String result = rs.getString("Resullt");
			System.out.println(user+"\t"+password+"\t"+date+"\t"+attempts+"\t"+result);
		}
		rs.close();
	}

}
