import java.util.*;


public class Slip16B implements Runnable
{
	Thread t;
	int interval;
	public Slip16B()
	{
		t = new Thread(this);
		t.setName("MyThread");
		System.out.println("New State: Thread Created...");
		interval = (int) (Math.random () * 4999);
		t.start();
	}

	public void run()
	{
		System.out.println("Running State: Thread is running...");
		for(int i=0;i<10;i++)
		{
			int turn = (int) (Math.random() * 10);
			if(turn%2==0)
				System.out.println(Thread.currentThread().getName())	;
			else 
				System.out.println("Interval : " + interval)	;	
			try
			{
				Thread.sleep(interval);
			}catch(InterruptedException ie){
			}
		}
	}	

	public static void main(String arg[])
	{
		Slip16B obj = new Slip16B();
	}			
}