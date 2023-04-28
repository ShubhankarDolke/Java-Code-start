<%@page language="Java"%>
<html>
<body>
<form method="get">
	Enter Number: <input type="text" name="t1" value="">
	<input type="submit" value="Check Armstrong" name="b1">
<%
	String val = request.getParameter("t1");
	if(val!=null)
	{
		int num = Integer.parseInt(val);
		int temp=num;
		int sum=0;
		while(num!=0)
		{
			int dig = num%10;
			sum = sum + (dig*dig*dig);
			num=num/10;
		}
		if(sum==temp)
			out.print("<br>Number is armstrong.");
		else
			out.print("<br>Number is not armstrong.");		
	}		
%>
</form>
</body>
</html>