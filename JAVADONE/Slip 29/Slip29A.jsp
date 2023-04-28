<!--
Write a JSP program to accept Name and Age of Voter and check whether he is eligible for voting or not.
-->
<%@page language="Java"%>

<html>
<body>
<form method="get">
	Enter Name: <input type="text" name="t1" value=""> <br><br>
	Enter Age: <input type="text" name="t2" value=""> <br><br>
	<input type="submit" value="Check" name="b1"> <br>

<%
	String name = request.getParameter("t1"); 
	String val = request.getParameter("t2"); 	
	if(name!=null && val!=null)
	{
		int age = Integer.parseInt(val);
		if(age>17)
			out.println("<br>You are eligible to vote.");			
		else
			out.println("<br>You are not eligible to vote.");			
	}
%>
</form>
</body>
</html>