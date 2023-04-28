import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Slip2B extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	boolean flag=false;
	Cookie[] cookies = req.getCookies();

	if (cookies != null)
	{
		for (int i = 0; i<cookies.length; i++)
		{
		            if (cookies[i].getName().equals("Counter"))
		           {
			int count = Integer.parseInt(cookies[i].getValue());
			count++;	
		
			cookies[i].setMaxAge(0); //delete existing cookie
			
			//add cookie with new counter value
			Cookie ck = new Cookie("Counter", Integer.toString(count));
			res.addCookie(ck);

			pw.println("You have visited this page for " + count + " times.");
			flag=true;
			break;
		            }
             		} 
        	}//end for
	if(flag==false)
	{
		Cookie ck = new Cookie("Counter", "1");
		res.addCookie(ck);
		pw.println("Welcome!! ");
	}					
}
}

