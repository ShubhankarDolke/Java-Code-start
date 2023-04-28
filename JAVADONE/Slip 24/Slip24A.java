<!--
Write a JSP script to check whether given mail ID is valid or not. (Mail ID should contain one @ symbol)
-->
<%@page language="Java"%>

<html>
<body>
<form method="get">
	Enter Email Id: <input type="text" name="t1" value="">
	<input type="submit" value="Check" name="b1">

<%
	String val = request.getParameter("t1");
	if(val!=null)
	{
		if(val.indexOf('@')!=-1)
			out.println("<br>Valid email address.");
		else
			out.println("<br>Invalid email address.");
	}	
	
%>
</form>
</body>
</html>