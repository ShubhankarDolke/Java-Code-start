import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Slip21B extends HttpServlet
{
public void doPost(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	boolean flag=false;
	String hobby = req.getParameter("Painting") + "," + req.getParameter("Drawing") ;
	hobby = hobby + "," + req.getParameter("Singing") + "," + req.getParameter("Swimming") ;
	Cookie[] cookies = req.getCookies();

	if (cookies != null)
	{
		for (int i = 0; i<cookies.length; i++)
		{
		            if (cookies[i].getName().equals("Hobby"))
		           {
			cookies[i].setMaxAge(0);
			Cookie ck = new Cookie("Hobby", hobby);
			res.addCookie(ck);
			pw.print("Cookie values Modified. New Value = " + hobby);
			flag=true;
			break;
		            }
             		} 
        	}//end for
	if(flag==false)
	{
		Cookie ck = new Cookie("Hobby", hobby);
		pw.print("Cookie added. Value = " + hobby);
		res.addCookie(ck);
	}

}
}