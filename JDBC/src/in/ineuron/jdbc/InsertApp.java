package in.ineuron.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {

	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql:///detail";
			String user="root";
			String password="9852451029";
			
			connection=DriverManager.getConnection(url,user,password);
			
			statement=connection.createStatement();
			
			String Query=" insert into studnet(sid,sname,sage)values(12,'juhi',24)";
			int rowUdate=statement.executeUpdate(Query);
			
			System.out.println("total row updated is "+rowUdate);
			
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}catch(SQLException se)
		{
			se.printStackTrace();
		}finally
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
		}
		

	}

}
