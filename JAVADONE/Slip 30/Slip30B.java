import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.sql.*;
public class Slip30B extends HttpServlet
{
Connection con;
Statement stmt;
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
res.setContentType("text/html");
PrintWriter pw = res.getWriter();
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	con = DriverManager.getConnection("jdbc:odbc:SlipsDsn");	
	stmt = con.createStatement();
	String sql = "Select * from Product";
	ResultSet rs = stmt.executeQuery(sql);
	pw.write("<table width='50%' border='1'>");
	pw.write("<tr align='center'><th>Product Code</th><th>Product Name</th><th>Price</th></tr>");	
	while(rs.next())
	{
		pw.write("<tr align='center'>");
		pw.write("<td>" + rs.getString(1) + "</td>");
		pw.write("<td>" + rs.getString(2) + "</td>");
		pw.write("<td>" + rs.getString(3) + "</td>");
		pw.write("</tr>");
	}
	pw.write("</table>");
	rs.close();
	stmt.close();
	con.close();
}catch(Exception e){
	System.out.println(e);
}
}
}

