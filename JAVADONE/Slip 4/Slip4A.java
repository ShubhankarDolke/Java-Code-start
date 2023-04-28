import java.lang.*;
public class Slip4A implements Runnable
{
int n;
public Slip4A(int r)
{
	n=r;
}
public void run()
{
for(int i=1;i<=n ;i++)
{
	System.out.println(i +  " Hello Java : " + Thread.currentThread());
	try{
		Thread.sleep(800);
	}catch(InterruptedException ie){
		System.out.println(ie);
	}
}
}

public static void main(String[] args)
{
	Slip4A obj = new Slip4A(10);
	Thread t = new Thread(obj);
	t.start();
	Thread t2 = new Thread(obj);
	t2.start();
}	
}
