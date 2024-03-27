package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {

	public static void main(String[] args)throws SQLException
	{
		Connection connection=null;
		String url="jdbc:mysql:///detail";
		String user="root";
		String password="9852451029";
		
		connection=DriverManager.getConnection(url,user,password);
		
		Statement statement=connection.createStatement();
		String Query="Update studnet set sage=21 where sage=24";
		int rowAffect=statement.executeUpdate(Query);
		
		System.out.println("total row Affected is "+ rowAffect);
		
		connection.close();
		statement.close();
		
		
		
		

	}

}
