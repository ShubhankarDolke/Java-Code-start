import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*<applet code="Slip10B" width=500 height=500></applet> */ 

public class Slip10B extends Applet implements Runnable
{
        int x,y;
        Thread t;
        public void init()
        {
        x=30;
        y=30;
        t=new Thread(this);
        t.start();
        }
 
        public void run()
        {
                while(true)
                {
                x=(int)(Math.random()*getWidth());
                y=(int)(Math.random()*getHeight());
 
                if(x>=470)
                {
                        x=0;
                }
                if(y>=470)
                {
                        y=0;
                }
 
                try
                {
                        Thread.sleep(500);
                }catch(Exception e){                        
                        System.out.println(e);
                }
                repaint();
                }
        }
 
        public void paint(Graphics g)
        {
                g.setColor(Color.RED);
                g.fillOval(x,y,30,30);
        }
}