import java.io.*;
import java.net.*;

class FactClient
{
public static void main(String args[]) throws Exception
{
	Socket sk=new Socket(InetAddress.getLocalHost(),3000);        
	System.out.println("Connected to Server....");

	PrintStream sout=new PrintStream(sk.getOutputStream());	
	BufferedReader sin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	System.out.println("Enter number: ");
	String s = br.readLine();
	sout.println(s);

	int res = Integer.parseInt(sin.readLine());
	System.out.println("Factorial of Number is : " + res);

	sout.close();
	sin.close();
	sk.close();
	br.close();
}    
}

