import java.awt.*;
import java.awt.event.*;

public class MoveText extends Frame implements Runnable
{
Label l1;
Thread t;
int x,y,bound;
public MoveText()
{
	l1=new Label("Hello Java");
	setSize(400,400);
	setVisible(true);
	t=new Thread(this);
	t.start();
  	x=5;
  	y=200;
	bound=1;	
 }
public void run()
{
try
{
	if(bound==1)
   	{
    		l1.setBounds(x+=5,y-=5,70,15);
		if(y==20)
			bound=2;
   	}
   	else if(bound==2)
   	{
		l1.setBounds(x+=5,y+=5,70,15);
		if(y==200)
			bound=3;
   	}
	else if(bound==3)
	{
		l1.setBounds(x-=5,y+=5,70,15);
		if(y==390)
    			bound=4;
   	}
   	else if(bound==4)
   	{
		l1.setBounds(x-=5,y-=5,70,15);
		if(x==0)
		{
			bound=1;
			x=0;y=200;
    		}
   	}
	t.sleep(50);
	add(l1);
}catch(Exception e){
	System.out.println(e);
}
run();
}

public static void main(String args[])
{
	MoveText m = new MoveText();
	m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	m.setVisible( true );
}

}
