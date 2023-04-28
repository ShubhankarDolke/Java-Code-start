/*
Write a JDBC Program in java to display the names of Employees starting with ‘S’ character 
*/
import java.io.*;
import java.sql.*;

public class Slip21A
{
	public static void main(String[] args) throws IOException,SQLException,ClassNotFoundException
	{							
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
		Statement stmt = conObject.createStatement();
		String query  = "Select * from Employee where EmpName Like 'S%' ";
		ResultSet rs = stmt.executeQuery(query);				
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getString(4) );
		}
		stmt.close();
		conObject.close();	
	}
}	