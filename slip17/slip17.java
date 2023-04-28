import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class passexception extends Exception
{
}

class slip17 extends Frame implements ActionListener
{
	Button b1,b2;
	Label l1,l2;
	TextField t1;
	PasswordField t2;
	static int attempt=0;
	slip17( )
	{
 		b1=new Button("LOGIN");
		b2=new Button("CLEAR");
		l1=new Label("Enter UserName");
		l2=new Label("Enter Password");
		t1=new TextField(10);
		t2=new PasswordField(10);
		setSize(300,300);
		setVisible(true);
		setLayout(new GridLayout(3,2));
		add(l1) ; add(t1);
                add(l2) ; add(t2);
		add(b1) ;add(b2);
		b1.addActionListener(this);
		b2.addActionListener(this);
	}
public void actionPerformed (ActionEvent ae)
{
	if(ae.getSource( ) ==b2)
	{
		t1.setText("");
		t2.setText("");
	}
	if(ae.getSource( )==b1)
	{
		try
		{
			String user = t1.getText();
			String pass = t2.getText();
			if(pass.equals(user))
	JOptionPane.showMessageDialog(null,"Login Successfully!!!");
			else
			throw new passexception( );
		}
		catch(passexception e)
		{
			attempt++;
	JOptionPane.showMessageDialog(null,"Login Successfully");
		if(attempt==3)
		{
	JOptionPane.showMessageDialog(null,"No More Attempts");
	System.exit(0);
	}
	}
	}
}
public static void main(String arg[])
	{
		new slip17( );
	}
}

		