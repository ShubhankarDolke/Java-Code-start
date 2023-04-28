<!--
Write a JSP program to display all the prime number’s between 1 to n in “Blue” Color.
-->
<%@page language="Java"%>
<html>
<body>
<form>
 Enter value of n: <input type="text" name="t1">	
<input type="submit" value="Get Prime Numbers">
<font color="blue">
<%
	String val = request.getParameter("t1");
	if(val!=null)
	{
		int n=Integer.parseInt(val);
		out.print("<br><br><b>Prime numbers between 1 to " + n + " are : </b>");
		int flag=0;
		out.print("<br>1<br>2<br>3");
		for(int num=4;num<=n;num++,flag=0)
		{
			for(int i=2;i<=num/2;i++)
			{
				if(num%i==0)
				{
					flag=1;
					break;
				}
			}			
			if(flag==0)
				out.print("<br>" + num);	
		}
	}
%>
</font>
</form>
</body>
</html>