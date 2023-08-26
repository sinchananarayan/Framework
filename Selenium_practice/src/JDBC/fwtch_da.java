package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class fwtch_da {
@Test 
public void fet() throws SQLException
{
	 Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/test?user=root&password=root");
	 Statement stat = connection.createStatement();
	 ResultSet result = stat.executeQuery("select * from data");
	 while(result.next())
	 {
		 final String un = result.getString(1);
		 final String pwd = result.getString(2);
		 System.out.println(un+"   "+pwd);
	 }
}
}
