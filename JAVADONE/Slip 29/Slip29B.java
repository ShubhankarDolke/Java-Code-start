/*
Write a menu driven java program for the following:
	- Insert
	- Update
	- Delete
	- Search
	- Display
	- Exit
Consider Student (rno, sname, per) table for this.(SLIP29B)
*/
import java.io.*;
import java.sql.*;

public class Slip29B
{
public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException
{
int ch;	
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");					
Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
Statement stmt;
PreparedStatement pst;
do
{
	System.out.println("1.) Insert Record.");
	System.out.println("2.) Update Record.");
	System.out.println("3.) Delete Record.");
	System.out.println("4.) Search Record.");
	System.out.println("5.) Display all Records.");
	System.out.println("0.) Exit");
	System.out.println("Enter your choice : ");
	ch = Integer.parseInt(br.readLine());
	if(ch==1)
	{
		String query = "Insert into Student values(?,?,?)";
		pst = conObject.prepareStatement(query);
		System.out.println("Enter Roll No : ");
		int roll = Integer.parseInt(br.readLine());
		System.out.println("Enter Student Name : ");
		String sname = br.readLine();
		System.out.println("Enter Percentage : ");
		int per = Integer.parseInt(br.readLine());
		pst.setInt(1,roll);
		pst.setString(2,sname);
		pst.setInt(3,per);
		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Inserted successfully!");
		else
			System.out.println("Insert Error!");
		pst.close();
	}
	if(ch==2)
	{
		String query = "Update Student set StudName=?, Percentage=? where RollNo=?";
		pst = conObject.prepareStatement(query);
		System.out.println("Enter Roll No to update : ");
		int roll = Integer.parseInt(br.readLine());
		System.out.println("Enter new Student Name : ");
		String sname = br.readLine();
		System.out.println("Enter new Percentage : ");
		int per = Integer.parseInt(br.readLine());
		pst.setString(1,sname);
		pst.setInt(2,per);
		pst.setInt(3,roll);
		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Updated successfully!");
		else
			System.out.println("Update Error!");	
		pst.close();		
	}
	else if(ch==3)
	{
		String query = "Delete from Student where RollNo=?";
		pst = conObject.prepareStatement(query);
		System.out.println("Enter Roll No to delete : ");
		int roll = Integer.parseInt(br.readLine());
		pst.setInt(1,roll);
		int result = pst.executeUpdate();
		if(result == 1)
			System.out.println("Record Deleted successfully!");
		else
			System.out.println("Record NOT Found!");
		pst.close();
	}
	else if(ch==4)
	{
		System.out.println("Enter Roll No to search : ");
		int roll = Integer.parseInt(br.readLine());
		stmt = conObject.createStatement();
		String query = "Select * from Student where RollNo=" + roll;
		ResultSet rs = stmt.executeQuery(query);
		if(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}else{
			System.out.println("Record NOT Found!");
		}
		rs.close();
		stmt.close();
	}
	else if(ch==5)
	{
		stmt = conObject.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from Student");
		while(rs.next())
		{
			System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
		}
		rs.close();
		stmt.close();
	}
	else
	{
		System.out.println("Invalid Syntax!");
	}

}while(ch!=0);
conObject.close();	
}
}	