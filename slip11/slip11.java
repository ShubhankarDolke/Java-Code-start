import java.util.*;
class NameisInvalid extends Exception
{
	NameisInvalid()
	{
		System.out.println("Name is not valid");
	}
}
class slip17
{
	public static void main(String arg[])
	{
		String name;
	Scanner sr=new Scanner(System.in);
		try
		{
			System.out.println("Enter name");
			name=sr.next();
		for(int i = 0;i < name.length();i++)
		{
			char ch=name.charAt(i);
			if(Character.isDigit(ch))
			throw new NameisInvalid();
		}
		System.out.println("Emp name is" + name);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}