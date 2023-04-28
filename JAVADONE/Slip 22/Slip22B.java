/*
Write a java program to create a student table with field’s rno, name and per. Insert values in the table. 
Display all the details of the student on screen. (Use PreparedStatement Interface)
*/
import java.io.*;
import java.sql.*;

public class Slip22B
{
	public static void main(String[] args) throws IOException,SQLException, ClassNotFoundException
	{	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));						
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
		Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");

		Statement stmt = conObject.createStatement();
		String createQuery = "CREATE TABLE Student1(RollNo INTEGER PRIMARY KEY, StudName TEXT(30), Percentage DOUBLE)";
		int result = stmt.executeUpdate(createQuery);
		if(result == -1)
			System.out.println("Table created successfully!");
		String query = "Insert into Student1 values(?,?,?)";
		PreparedStatement pst = conObject.prepareStatement(query);
		System.out.println("Enter Student Id: ");
		int id = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name: ");
		String name = br.readLine();
		System.out.println("Enter Percentage: ");
		double per = Double.parseDouble(br.readLine());

		pst.setInt(1,id);
		pst.setString(2,name);
		pst.setDouble(3,per);

		result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Inserted successfully!");
		else
			System.out.println("Insert Error!");

		stmt = conObject.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Student1");
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		pst.close();
		stmt.close();
		conObject.close();	
	}
}	