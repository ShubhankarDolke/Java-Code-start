import java.util.*;


public class Slip18A implements Runnable
{
	Thread t1,t2;
	public Slip18A()
	{
		t1 = new Thread(this);
		t2 = new Thread(this);
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t1.start();
		t2.start();
	}
	public synchronized void display()
	{
		for(int i=1;i<11;i++)
		{
			System.out.println(Thread.currentThread().getName() + " : " + i);
			try{
				Thread.sleep(500);
			}catch(InterruptedException ie){
			System.out.println(ie);
			}
		}
	}
	public void run()
	{
		display();
	}

	public static void main(String args[])
	{
		new Slip18A();
	}

}