/*
Write a java program to display IP Address and Name of client machine.
*/
import java.io.*;
import java.lang.*;
import java.net.InetAddress;

public class Slip1A
{
	public static void main(String[] args)throws Exception
	{
		InetAddress addr = InetAddress.getLocalHost();
      		System.out.println("Local HostAddress: "+addr.getHostAddress());
		String hostname = addr.getHostName();
		System.out.println("Local host name: "+hostname);		
	}
}