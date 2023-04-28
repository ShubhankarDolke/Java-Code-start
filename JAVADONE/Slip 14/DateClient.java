import java.io.*;
import java.net.*;

class DateClient
{
public static void main(String args[]) throws Exception
{
	Socket sk=new Socket(InetAddress.getLocalHost(),3000);        
	System.out.println("Connected to Server....");

	BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
	String s = sin.readLine();
	System.out.println(s);

	sin.close();
	sk.close();
	
}    
}

