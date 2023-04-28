import java.applet.*;
import java.awt.*;
import java.awt.event.*;

/*
<applet code="Slip12A" width="500" height="500"></applet>
*/

public class Slip12A extends Applet implements Runnable, ActionListener
{
	Thread t;
	TextField txt1;
	Button btnStart;

	public void init()
	{
		txt1 = new TextField(20);
		btnStart = new Button("Start");	
		btnStart.addActionListener(this);
		add(txt1); add(btnStart);
	}
	public void run()
	{
		for(int i=1;i<101;i++)
		{
			txt1.setText("" + i);
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
	}
}