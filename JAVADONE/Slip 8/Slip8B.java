import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;

public class Slip8B extends HttpServlet
{
Connection con;
Statement stmt;

public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
String usrName = req.getParameter("UserName");
String pwd = req.getParameter("Pwd");
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:SlipsDsn");	
	stmt = con.createStatement();
	String sql = "Select Pwd from Login where UserId='" + usrName + "'";
	ResultSet rs = stmt.executeQuery(sql);
	if(rs.next())
	{
		String temp = rs.getString(1);
		if(pwd.equals(temp))
			pw.write("Login Successfull!");
		else
			pw.write("Incorrect Password!<br> Login Failed!");
	}
	else
	{
		pw.write("Invalid User Name!<br>Login Failed!");
	}
	rs.close();
	stmt.close();
	con.close();
}catch(Exception e){
	System.out.println(e);
}
}
}

