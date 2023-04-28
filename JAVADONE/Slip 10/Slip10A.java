/*
Write a JDBC program to count the number of records in table. (Without using standard method)
*/
import java.io.*;
import java.sql.*;

public class Slip10A
{
	public static void main(String[] args) throws IOException,SQLException,ClassNotFoundException
	{							
		int count=0;
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
		Statement stmt = conObject.createStatement();
		String query  = "Select * from Employee";
		ResultSet rs = stmt.executeQuery(query);				
		while(rs.next())
		{	
			count++;
		}
		System.out.println("No.of Records : " +  count);
		stmt.close();
		conObject.close();	
	}
}	