import java.awt.*;
import java.applet.*;
import java.util.*;
/*<applet code= "Slip19B.class" height="500" width="500"></applet>*/

public class Slip19B extends Applet implements Runnable 
{
	boolean smile;
	Thread t;
	public void init() 
	{
		smile = true;
		t=new Thread(this); 
		t.start();      
	}
	public void run()
	{
		try
		{
			if (smile==true)
			{
				t.sleep(1000*5);
				smile=false;        
			}
			else
			{
				t.sleep(1000*5);			
				smile=true;        
			}
			repaint(); 
			run();
		}catch(Exception e){
			System.out.println(e);
     		}
     	}

	public void paint(Graphics g) 
	{
		g.setColor(Color.yellow);
		g.fillOval(100,100,100,100);
		g.setColor(Color.black);
		g.fillOval(120,125,20,20);
		g.fillOval(160,125,20,20);
		g.drawLine(150,135,150,155);
		if (smile==true)
		{ 
			g.drawArc(140,160,20,20,0,-180);
			smile = false;
      		}
		else
      		{
			g.drawArc(140,160,20,20,0,180);
			smile = true;
		}
	}
}