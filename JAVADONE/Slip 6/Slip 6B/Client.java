import java.net.*;
import java.io.*;
public class Client
{
	public static void main(String args[]) throws Exception
	{
		Socket sk=new Socket("localhost",2000);
		System.out.println("Connected to Server...");
		PrintStream sout=new
		PrintStream(sk.getOutputStream());
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter File Name:");
		String fileName=br.readLine();
		sout.println(fileName);
		sk.close();
		sout.close();
		br.close();
	}
}
