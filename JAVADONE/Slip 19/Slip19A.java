<!--
Create a JSP page to accept a number from an user and display it in words: 
Example: 123 – One Two Three. 
The output should be in red color. 
-->
<%@page language="Java" %>

<html>
<body>
<form method="get">
	Enter Number: <input type="text" name="t1" value="">
	<input type="submit" value="Click" name="b1">

<%
	String val = request.getParameter("t1");
	if(val!=null)
	{		
		int num = Integer.parseInt(val);
		out.print("<br>You Entered : " + val + "<br>");
		int rev =0 ;
		while(num!=0)
		{
			int dig = num%10;
			rev = rev*10 + dig;
			num= num/10;	
		}
		while(rev!=0)
		{
			int dig = rev%10;
			switch(dig)
			{
				case 0: out.print(" Zero "); break;
				case 1: out.print("One "); break;
				case 2: out.print(" Two "); break;
				case 3: out.print(" Three "); break;
				case 4: out.print(" Four "); break;
				case 5: out.print(" Five "); break;
				case 6: out.print(" Six "); break;
				case 7: out.print(" Seven "); break;
				case 8: out.print(" Eight "); break;
				case 9: out.print(" Nine "); break;
			}
			rev = rev/10;
		}
	}	
	
%>
</form>
</body>
</html>