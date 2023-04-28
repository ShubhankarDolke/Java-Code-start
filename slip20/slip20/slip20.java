package games;
import games.indoor;
import games.outdoor;
import java.util.*;

public class slip20
{
	/*protected void finalize()
	{
	System.out.println("Finalize method called");
	}*/
	public static void main(String arg[])
	{
		indoor in[]=new indoor[3];
		outdoor out[]=new outdoor[3];
		slip20 s=new slip20();
		int i;
		String n;
		Scanner sr=new Scanner(System.in);

		for(i=0;i<3;i++)
		{
		System.out.println("Enter indoor Game name");
		n=sr.next();
		in[i]=new indoor(n);
		}
		for(i=0;i<3;i++)
		{
		System.out.println("enter the outdoor games");
		n=sr.next();
		out[i]=new outdoor(n);
		}
		System.out.println("Indoor List are as Follows");
		for(i=0;i<3;i++)
		in[i].display();
		System.out.println("Outdoor List are as Follows");
		for(i=0;i<3;i++)
		out[i].display();
	//s.finalize();
	}
}
		