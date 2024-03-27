package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteApp {

	public static void main(String[] args) throws SQLException
	{
		
		Connection connection=null;
		Statement statement=null;
	
		String url="jdbc:mysql:///detail";
		String user="root";
		String password="9852451029";
		
		connection=DriverManager.getConnection(url,user,password);
		
		statement=connection.createStatement();
		String Query="Delete from studnet where sid=2";
		int rowAffect=statement.executeUpdate(Query);
		
		System.out.println(" total row affected is "+rowAffect);
		
		connection.close();
		statement.close();
	}

}
