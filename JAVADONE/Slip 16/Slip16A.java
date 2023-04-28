<!--
Write a JSP page, which accepts user name in a text box and greets the user according to the time on server machine. 
-->
<%@page language="Java" import="java.util.*"%>

<html>
<body>
<form method="get">
	EnterYour Name: <input type="text" name="t1" value="">
	<input type="submit" value="Click" name="b1">

<%
	String val = request.getParameter("t1");
	if(val!=null)
	{		
		Date currDate = new Date();
		out.println("<br>Today'd Date: " + currDate);
		int hrs = currDate.getHours();
		if(hrs<12)
			out.print("<br>Good Morning!");
		else if(hrs>11 && hrs<17)
			out.print("<br>Good Afternoon!");
		else if(hrs>16 && hrs<20)
			out.print("<br>Good Evening!");
		else if(hrs>19)
			out.print("<br>Good Night!");		
	}	
	
%>
</form>
</body>
</html>