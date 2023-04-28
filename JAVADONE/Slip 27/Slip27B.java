import java.applet.*;
import java.awt.*;
import java.util.*;
import java.awt.event.*;

/*
<applet code="Slip27B" width="500" height="500"></applet>
*/

public class Slip27B extends Applet implements Runnable, ActionListener
{
	Thread t;
	TextField txt1;
	Button btnStart,btnStop;

	public void init()
	{
		txt1 = new TextField(20);
		
		btnStart = new Button("Start");	
		btnStart.addActionListener(this);

		btnStop = new Button("Stop");	
		btnStop.addActionListener(this);
		add(txt1); add(btnStart); add(btnStop);
	}
	public void run()
	{
		String msg;
		while(true)
		{
			Calendar cal = Calendar.getInstance();
		      	String hour = String.valueOf(cal.get(Calendar.HOUR));
		      	String minute = String.valueOf(cal.get(Calendar.MINUTE));
		      	String second = String.valueOf(cal.get(Calendar.SECOND));
			msg = hour + ":" + minute + ":" + second;
			txt1.setText(msg);
			repaint();
			try
			{
				Thread.sleep(500);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}	
		}
	}
	
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==btnStart)
		{
			t = new Thread(this);
			t.start();
		}
		else if(ae.getSource()==btnStop)
		{			
			t.stop();
		}
	}

	
}