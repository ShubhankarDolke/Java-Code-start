import javax.swing.*;
import java.awt.*;
import java.lang.*;

public class Slip8A extends JFrame implements Runnable
{
	Label l1;
	Thread t;
	public Slip8A()
	{
		setTitle( "Blinking Text" );
		setSize( 500, 300 );
		setBackground( Color.gray );

		l1 = new Label("Blinking Text...");
		getContentPane().add(l1);

		t = new Thread(this);
		t.start();
	}	

	public void run()
	{
		while(true) 
		{
			if(l1.getText()!=null)
				l1.setText(null);                		
			else
			{
				l1.setText("Blinking Text...");
			}
			try
			{
				Thread.sleep(1000);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
        		}
	}

	public static void main( String args[] ) 
	{
		Slip8A mainFrame	= new Slip8A();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible( true );
	}
}