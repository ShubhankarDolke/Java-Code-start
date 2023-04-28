import java.lang.*;
public class Slip17A 
{
public static void main(String[] args)
{
Thread t = Thread.currentThread();
System.out.println("Current Thread Name : " + t.getName());
System.out.println("Current Thread Priority : " + t.getPriority());

t.setName("MyThread");
t.setPriority(2);

System.out.println("Current Thread Name : " + Thread.currentThread());
System.out.println("Current Thread Priority : " + t.getPriority());

}	
}