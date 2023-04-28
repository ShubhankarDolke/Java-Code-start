/*
Write a java program to accept the details of customer (CID, CName, Address, Ph_No) 
and store it into the database(Use PreparedStatement interface) 
*/
import java.io.*;
import java.sql.*;

public class Slip6A
{
	public static void main(String[] args) throws IOException,SQLException, ClassNotFoundException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));						
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
		String query = "Insert into Customer values(?,?,?,?)";
		PreparedStatement pst = conObject.prepareStatement(query);
		System.out.println("Enter Customer Id: ");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Customer Name: ");
		String name = br.readLine();
		System.out.println("Enter Customer Address: ");
		String address = br.readLine();
		System.out.println("Enter Phone Number: ");
		String phone = br.readLine();
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setString(3,address);
		pst.setString(4,phone);
		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Inserted successfully!");
		else
			System.out.println("Insert Error!");
		pst.close();
		conObject.close();	
	}
}	