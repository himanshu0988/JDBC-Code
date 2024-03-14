package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc1 {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Connection connection=null;
		Statement statement =null;
		ResultSet resultset=null;
		// 1 .load and Register the Driver
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		// 2 .Establish the connection
		String url="jdbc:mysql://localhost:3306/detail";
		String user="root";
		String password="9852451029";
		connection= DriverManager.getConnection(url,user,password);
		
		//3.Create Statement obj and exceute the query
		
		String query="Select * From studnet";
		statement=connection.createStatement();
		resultset=statement.executeQuery(query);
		
		// 4.process the resultset
		System.out.println("sid\tsname\t\tage");
		System.out.println();
		
		while(resultset.next())
		{
			Integer i=resultset.getInt(1);
			String name=resultset.getString(2);
			Integer age=resultset.getInt(3);
			System.out.println(i+"\t"+name+"\t"+age+"\t");
		}
		if(connection !=null)
		{
			connection.close();
		}
		
		
		
		
		

	}

}

