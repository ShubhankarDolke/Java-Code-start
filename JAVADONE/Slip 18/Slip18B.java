import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Slip18B extends HttpServlet
{
public void doGet(HttpServletRequest req, HttpServletResponse res)throws IOException, ServletException
{
	res.setContentType("text/html");
	PrintWriter pw = res.getWriter();
	pw.write("<br><h4> Client Information:</h4>");
	pw.write("<br> Client IP Address : " + req.getRemoteAddr());
	pw.write("<br> Client Name : " + req.getRemoteHost());
	pw.write("<br> Protocol : " + req.getProtocol());

	String s = req.getHeader("user-agent");
	if (s == null)
	      pw.write("error!");
	else if (s.indexOf("Chrome") != -1)
		      pw.write("<br>Browser : Google Chrome");
	else if (s.indexOf("MSIE") != -1)
		      pw.write("<br>Browser : Microsoft Internet Explorer");
	else if (s.indexOf("Netscape") != -1)
		      pw.write("<br>Browser : Netscape");
	else if(s.indexOf("Mozilla") != -1)
		      pw.write("<br>Browser : Mozilla Firefox");
	
	pw.write("<br> <h4>Server Information:</h4>");	
	pw.write("<br> Server Name : " + req.getServerName());
	pw.write("<br> Server Port : " + req.getServerPort());
	
}
}

