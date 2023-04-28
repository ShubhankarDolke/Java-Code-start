import java.io.*;
import java.lang.*;

class StringVowel extends Thread
{
	String str;

	public StringVowel(String str)
	{
		this.str = str;
	}

	public void run()
	{
		int len = str.length();
		String temp = str.toUpperCase();
		for(int i=0;i<len;i++)
		{
			char ch = temp.charAt(i);
			switch(ch)
			{
				case 'A': 
				case 'E': 
				case 'I': 
				case 'O': 
				case 'U': 
					System.out.println("" + Thread.currentThread() + str.charAt(i)); 
					break;				
			}	
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				System.out.println(ie);
			}	
		}
	}

}

public class Slip2A
{
	public static void main(String[] arg)
	{
		StringVowel t1 = new StringVowel("Mitsom College");
		StringVowel t2 = new StringVowel("Welcome to MITSOM");
		t1.setName("College Name");
		t2.setName("Welcome Message");
		t1.start();
		t2.start();
	}
}