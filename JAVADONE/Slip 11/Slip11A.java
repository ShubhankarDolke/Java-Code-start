/*
Write a JDBC program to remove “percentage” column from student (rno, sname, percentage) table. 
Student table is already created. 
*/
import java.sql.*; 
import java.io.*;

public class Slip11A
{
	public static void main(String[] args) throws SQLException, IOException, ClassNotFoundException
	{
		Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
		Connection con = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
		Statement st = con.createStatement();
		int ans = st.executeUpdate("ALTER TABLE Student DROP Percentage");
		if(ans!=0)
		{
			System.out.println("Column 'Percentage' is deleted successfully.");
		}
		
		st.close();
		con.close();
	}
}