package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Jdbc2 {

	public static void main(String[] args) {
		Connection connection=null;
		try {
			String url="jdbc:mysql:///detail";
			String user="root";
			String password="9852451029";
			 connection=DriverManager.getConnection(url,user,password);
			
			Statement statement=connection.createStatement();	
			String Query="Select * from studnet";
			
			ResultSet resultset=statement.executeQuery(Query);
			System.out.println("id\tname\tage\t");
			
			while(resultset.next())
			{
				Integer id=resultset.getInt(1);
				String name=resultset.getString(2);
				Integer age=resultset.getInt(3);
				
				System.out.println(id+"\t"+name+"\t"+age);
			}
			
			} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(connection!=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			}
		}

	}

}
