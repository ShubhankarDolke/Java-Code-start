import java.net.*;
import java.io.*;
 
public class  FileServer
{
	public static void main(String args[]) throws Exception
	{
		ServerSocket ss=new ServerSocket(2000);
		System.out.println("Server Started..");
		System.out.println("Waiting for Client.....");	
		
		//Connecting to client
		Socket sk=ss.accept();
		System.out.println("Client connected: " + sk.getRemoteSocketAddress());

		//reading the file name
		BufferedReader cin=new BufferedReader(new InputStreamReader(sk.getInputStream()));
		String fileName = cin.readLine();
		File f = new File(fileName);
		if(f.exists())
		{
			System.out.println("File Found! File Contents: ");
			BufferedReader fin = new BufferedReader(new FileReader(fileName));
			String line;
			while((line = fin.readLine()) != null)
			{
				System.out.println(line);
			}
			fin.close();
		}
		else
		{
			System.out.println("File does not exists!");
		}
		cin.close();			
		ss.close();
 		sk.close();
 		
	}
}