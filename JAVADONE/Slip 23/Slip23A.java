<!--
Write a JSP script to accept the details of Student (RNo, SName, Gender, Comp_Know , Class) and display it 
on the browser. Use appropriate controls for accepting data. 
-->
<%@page language="Java" %>

<html>
<body>
<form method="get">
	Enter Roll No.: <input type="text" name="txtRoll" value=""> <br>
	Enter Student Name: <input type="text" name="txtName" value=""> <br>
	Gender: <input type="radio" name="gender" value="Male"> Male
	<input type="radio" name="gender" value="Female"> Female <br>
	Computer Knowledge : <input type="radio" name="ck" value="Yes">Yes
	<input type="radio" name="ck" value="No">No <br>
	Class : <input type="text" name="txtClass" value=""> <br>
	<input type="submit" value="Click" name="b1">
	<%
		String roll = request.getParameter("txtRoll");
		String name = request.getParameter("txtName");
		String gender = request.getParameter("gender");
		String ck = request.getParameter("ck");		
		String class1 = request.getParameter("txtClass");
		if(roll!=null)
			out.print("<br>Roll No : " + roll);
		if(name!=null)
			out.print("<br>Name : " + name);
		if(gender!=null)
			out.print("<br>Gender : " + gender);
		if(ck!=null)
			out.print("<br>Computer Knowled : " + ck);
		if(class1!=null)
			out.print("<br>Class : " + class1);
	%>
</form>
</body>
</html>