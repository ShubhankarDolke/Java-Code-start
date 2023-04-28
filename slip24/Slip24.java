import java.awt.*;
import java.awt.event.*;
import java.io.*;

class Slip24 extends Frame implements ActionListener
{
Label lt,l1,l2,l3;
TextField t1,t2,t3;
Button next,cancel;
Panel p1,p2,p3;

Slip24()
{
lt=new Label("EMPLOYEE INFORMTION");
l1=new Label("Emp No. : -");
l2=new Label("Name : -");
l3=new Label("Salary : -");
t1=new TextField(20);
t2=new TextField(20);
t3=new TextField(20);

p1=new Panel();
p1.add(lt);

p2=new Panel();
p2.setLayout(new GridLayout(6,2));
p2.add(l1);
p2.add(t1);
p2.add(l2);
p2.add(t2);
p2.add(l3);
p2.add(t3);

p3=new Panel();
p3.setLayout(new GridLayout(1,2));

next=new Button("NEXT"); 
next.addActionListener(this);// to capture the events from the buttons, they are registered with the Listener Interface

cancel=new Button("CANCEL"); 
cancel.addActionListener(this);
p3.add(next);
p3.add(cancel);

//Panel Arrangment
add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);
setVisible(true);
setSize(400,400);
}

public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==next)
{
new empdet(t1.getText(),t2.getText(),t3.getText());
}
if(ae.getSource()==cancel)
{
System.exit(0);
}
}

public static void main(String args[])
{
new Slip24();
}
}