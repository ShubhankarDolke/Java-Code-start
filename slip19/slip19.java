import java.util.*;
class NumberNotZero extends Exception
{
 	NumberNotZero()
{                      
  		System.out.println("Number Should be > 0");
}
}
class slip19
{
	static int n;
	public static void main(String arg[])
	{
		int first=0, last, sum =0;
		Scanner sr=new Scanner(System.in);
		try
		{
		n=sr.nextInt();
		if(n==0)
		throw new NumberNotZero();
		else
		{
			last=n%10;
			while(n>0)
			{
				first=n%10;
				n=n/10;
			}
		sum=first+last;
	System.out.println("Sum of first and last Digit is"+sum);
		}
	}
	catch(Exception e)
	{
		System.out.println(e);
	}
     }
}