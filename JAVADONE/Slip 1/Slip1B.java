<!--
Write a JSP script to accept username, store it into the session, compare it with password in another jsp file, 
if username matches with password then display appropriate message in html file.
-->
<%@page language="Java"%>

<html>
<body>
<form method="post" action="print.jsp">
	Enter User Name: <input type="text" name="t1" value=""><br>
	Enter Password: <input type="password" name="t2" value=""><br>
	<input type="submit" value="Login" name="b1">
	<input type="reset" value="Reset" name="b2">
</form>
</body>
</html>