import java.net.*;
import java.io.*;
import java.util.*;

class FileServer
{
public static void main(String args[]) throws Exception
{
 	ServerSocket ss=new ServerSocket(3000);
	System.out.println("Server Started..");
	System.out.println("Waiting for Client.....");
	while(true)
        	{	            			
	            	Socket sk=ss.accept();
		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		PrintStream cout=new PrintStream(sk.getOutputStream());

		int num = Integer.parseInt(cin.readLine());		
		System.out.println("Number received : " + num);
		System.out.println("Calculating factorial.....");
		int temp=num, ans=1;
		while(temp>1)
		{
			ans = ans * temp;
			temp--;
		}
		System.out.println("Sending answer...");
		cout.print(ans);		

	            	cin.close();
		cout.close();
	            	sk.close();
        	}
        
    }
}
