/*
Write a JDBC program to delete the records of employees whose names are starts with ‘A’ character. 
*/
import java.io.*;
import java.sql.*;

public class Slip9A
{
	public static void main(String[] args) throws IOException,SQLException,ClassNotFoundException
	{							
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
		Statement stmt = conObject.createStatement();
		String query  = "Delete from Employee where EmpName Like 'A%' ";
		int row = stmt.executeUpdate(query);				
		System.out.println(row + " row/s deleted successfully!");
		stmt.close();
		conObject.close();	
	}
}	