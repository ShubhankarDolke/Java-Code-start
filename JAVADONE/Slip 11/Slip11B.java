import java.util.*;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Slip11B extends HttpServlet 
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException 
{
	res.setContentType("text/html");
	PrintWriter out = res.getWriter();
	HttpSession session = req.getSession();
	out.println("<h4>Session Timer</h4>");
	out.println("The previous timeout was " +  session.getMaxInactiveInterval());
	session.setMaxInactiveInterval(2*60*60);  // two hours
	out.println("<br>The newly assigned timeout is " +  session.getMaxInactiveInterval());
}
}