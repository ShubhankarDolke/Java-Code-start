/*
Write a java program to create Teacher table (TNo.TName, Sal, Desg) and insert a record in it.
*/
import java.io.*;
import java.sql.*;

public class Slip5A
{
	public static void main(String[] args) throws IOException,SQLException, ClassNotFoundException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));						
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");

		Statement stmt = conObject.createStatement();
		String createQuery = "CREATE TABLE Teacher(Tno INTEGER PRIMARY KEY, TName TEXT(30), Salary DOUBLE, Desg TEXT(20))";
		int result = stmt.executeUpdate(createQuery);
		if(result == -1)
			System.out.println("Table created successfully!");
		String query = "Insert into Teacher values(?,?,?,?)";
		PreparedStatement pst = conObject.prepareStatement(query);
		System.out.println("Enter Teacher Id: ");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Teacher Name: ");
		String name = br.readLine();
		System.out.println("Enter Teacher Salary: ");
		double sal = Double.parseDouble(br.readLine());
		System.out.println("Enter Teacher Designation: ");
		String desg= br.readLine();
		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setDouble(3,sal);
		pst.setString(4,desg);
		result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Inserted successfully!");
		else
			System.out.println("Insert Error!");
		pst.close();
		stmt.close();
		conObject.close();	
	}
}	