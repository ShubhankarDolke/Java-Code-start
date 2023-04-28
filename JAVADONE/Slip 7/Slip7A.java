<!--
Write a JSP program to calculate sum of first and last digit of a given number. 
Display sum in Red Color with font size 18.
-->
<%@page language="Java"%>

<html>
<body>
<form method="get">
	Enter Number: <input type="text" name="t1" value="">
	<input type="submit" value="Sum" name="b1">

<%
	String val = request.getParameter("t1");
	if(val!=null)
	{
		int num = Integer.parseInt(val);
		int last = num%10;
		while(num>9)
			num = num/10;
		int first = num%10
		out.print("<br><font size=18 color='Red'>First Digit = " + first);
		out.print("<br>Last Digit = " + last +"</font>");
		out.print("<br>Sum  = " + (first+last)+"</font>");
	}	
	
%>
</form>
</body>
</html>