/*
Write a Java Program to Read, Update and Delete any record from “Elements” table. 
The table has following fields (Atomic_weight , Name (primary key), Chemical_symbol). 
The input should be provided through Command Line Arguments along with the appropriate data. 
The operations are: R : Read, U: Update, D: Delete.
The syntax for Read: R
The syntax for Delete: D name
The syntax for Delete: D name weight symbol
*/
import java.io.*;
import java.sql.*;

public class Slip23B
{
public static void main(String[] args) throws SQLException, ClassNotFoundException
{	
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
	Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
	Statement stmt;
	if(args.length==0)
		System.out.println("Invalid no.of Arguments!");	
	else if(args[0].equals("U"))
	{
		System.out.println("Updating....");
		if(args.length!=4)
		{
			System.out.println("Insufficient parameters");
			System.exit(0);
		}		
		String query = "Update Elements set AtomicWt=?,Symbol=? where EleName=?";
		PreparedStatement pst = conObject.prepareStatement(query);
		int wt = Integer.parseInt(args[2]);
		pst.setInt(1,wt);
		pst.setString(2,args[3]);
		pst.setString(3,args[1]);

		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Updated successfully!");
		else
			System.out.println("Update Error!");	
		pst.close();		
		conObject.close();
	}
	else if(args[0].equals("R"))
	{
		System.out.println("Reading....");
		stmt = conObject.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Elements");
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		stmt.close();
		conObject.close();		
	}else if(args[0].equals("D"))
	{
		System.out.println("Deleting....");
		if(args.length!=2)
		{
			System.out.println("Insufficient parameters");
			System.exit(0);
		}	
		String query = "Delete from Elements where EleName=?";
		PreparedStatement pst = conObject.prepareStatement(query);
		String name = args[1];
		pst.setString(1,name);

		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Deleted successfully!");
		else
			System.out.println("Delete Error!");
		pst.close();
		conObject.close();
	}
	else
	{
		System.out.println("Invalid Syntax!");
	}
	conObject.close();	
}
}	