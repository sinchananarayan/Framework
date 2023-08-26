package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class fetch_jdbc {
	
	
	@Test
	public void jd_fetch() throws SQLException// sql exception 
	{
		String url="jdbc:mysql://localhost:3306/test?user=root&password=root";
		String un= "root";
		String pwd="root";
		
		Connection connection = DriverManager.getConnection(url,un,pwd);
		Statement stat= connection.createStatement();
		ResultSet result= stat.executeQuery("select * from data");
		while(result.next())//next, previous is the iterator we use in real time also to get to know the count in database table
		{
			String username=result.getString(1);
			String password= result.getString(2);
			System.out.println(username+"  "+password);
		}
	}

}
