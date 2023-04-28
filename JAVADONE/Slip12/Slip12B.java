<!--
Write a JSP program to accept the details of Account (ANo, Type, Bal) and store it into database 
and display it in tabular form. (Use PreparedStatement interface)	
-->
<%@page language="Java" import="java.sql.*"%>

<html>
<body>
<%
String ac = request.getParameter("txtAno");
double bal = Double.parseDouble(request.getParameter("txtBal"));
String type = request.getParameter("txtType");
try
{			
	Class.forName( "sun.jdbc.odbc.JdbcOdbcDriver");					
	Connection conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");				
	PreparedStatement pst = conObject.prepareStatement("Insert into Account values(?,?,?)");
	pst.setString(1,ac);
	pst.setString(2,type);
	pst.setDouble(3,bal);
	int r = pst.executeUpdate();
	if(r==1)
		out.print("<h4>Record Inserted!</h4>");

}catch(ClassNotFoundException e) {
	System.out.println("Class not found exception.");
}catch(SQLException sqle){
	System.out.println(sqle);
}catch(Exception ex){
	System.out.println(ex);
}
out.print("<table border='1'><tr><th>Account No.</th><th>Account Type</th><th>Balance</th></tr>");
out.print("<tr align='center'><td>"+ ac +  "</td><td>" + type + "</td><td>" + bal + "</td></tr>");
%>
</body>
</html>