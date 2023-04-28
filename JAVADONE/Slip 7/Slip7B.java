import java.awt.*;
import java.applet.*;

/*<applet code="Slip7B" height="600" width="800"></applet>
 */

public class Slip7B extends Applet implements Runnable
{
Image pic;
int x1,x2,flag;
Thread t;
public void init()
{
	pic =getImage(getDocumentBase(),"car.jpeg");
	t=new Thread(this);
	x1=0; x2=0;
	t.start();	
	flag=0;
}
public void run()
{
	try{
		if(flag==0)
		{
			if(x1<getWidth()-100)
				x1=x1+5;	
			flag=1;
		}
		else
		{
			if(x2<getWidth()-100)
				x2=x2+5;	
			flag=0;
		}
		Thread.sleep(50);
		repaint();
		run();
	}catch(Exception e){
		
	}
}
public void paint(Graphics g)
{
	Graphics2D g2 = (Graphics2D) g;
	g2.setStroke(new BasicStroke(5));
	g.drawLine(0,20,800,20);
	g.drawLine(0,260,800,260);
	Stroke dashed = new BasicStroke(5, BasicStroke.CAP_BUTT, BasicStroke.JOIN_BEVEL, 0, new float[]{9}, 0);
	g2.setStroke(dashed);
	g.drawLine(0,140,800,140);
	g.drawImage(pic,x1,30,this);
	g.drawImage(pic,x2,150,this);
}
	
}
  