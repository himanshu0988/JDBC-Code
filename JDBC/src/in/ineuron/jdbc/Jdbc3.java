package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class Jdbc3 {

	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet resultset=null;
		try {
			
			
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			String url="jdbc:mysql://localhost:3306/detail";
			String user="root";
			String password="9852451029";
			connection=DriverManager.getConnection(url,user,password);
			
			statement=connection.createStatement();
			String Query="Select * from studnet";
			resultset=statement.executeQuery(Query);
			
			while(resultset.next())
			{
				Integer id=resultset.getInt(1);
				String name=resultset.getString(2);
				Integer Age=resultset.getInt(3);
				
				System.out.println(id+"\t"+name+"\t"+Age);
			}
			
			} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally
		{
			if(connection !=null)
			{
				try {
					connection.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if(statement !=null)
			{
				try {
					statement.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
