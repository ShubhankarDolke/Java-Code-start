import java.util.*;
import java.io.*;
public class slip1{
public static void main(String[] args)throws IOException
{
FileInputStream fin=new FileInputStream("abc.txt");
int ch=0;
while((ch=fin.read())!=-1)
{
	char c=(char)ch;
	if(Character.isUpperCase(c))
	{
	c=Character.toLowerCase(c);
	System.out.print(c);
	}
	else if(Character.isLowerCase(c))
	{
	c=Character.toUpperCase(c);
	System.out.print(c);
	}
	else if(Character.isDigit(c))
	{
	System.out.print(c+"Digit");
	}
	else if(Character.isSpace(c))
	{
	System.out.print(c+"space");
	}
	else
	System.out.println(c);
	}
	fin.close();
}
}