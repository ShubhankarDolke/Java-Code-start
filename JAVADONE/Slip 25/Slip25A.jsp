<!--
Write a JSP script to accept UserName and his NickName through html page and then displays username 
when visit count to page is odd and displays nickname when the visit count to the page is even.
-->
<%@page language="Java"%>

<html>
<body>
<form method="get">
	Enter User Name: <input type="text" name="t1" value=""> <br><br>
	Enter Nick Name: <input type="text" name="t2" value=""> <br><br>
	<input type="submit" value="Login" name="b1"> <br>
<%! int count=0; %>
<%
	count++;
	String name = request.getParameter("t1");
	String nname = request.getParameter("t2");
	if(count%2!=0 && name!=null)
		out.print("<br> Welcome " + name);
	else if(count%2==0 && nname!=null)
		out.print("<br> Welcome " + nname);
%>
</form>
</body>
</html>