/*
Write a JDBC program to delete the details of given employee (ENo EName Salary). 
Accept employee ID through command line.   (Slip27A)
*/
import java.io.*;
import java.sql.*;

public class Slip27A
{
public static void main(String[] args) throws SQLException, ClassNotFoundException
{	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
	Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
	if(args.length==0)
		System.out.println("Invalid no.of Arguments!");	
	else if(args.length==1)
	{
		String query = "Delete from Employee where EmpId=?";
		PreparedStatement pst = conObject.prepareStatement(query);
		int id = Integer.parseInt(args[0]);
		pst.setInt(1,id);
		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Deleted successfully!");
		else
			System.out.println("Delete Error!");
		pst.close();
		conObject.close();
	}
}
}