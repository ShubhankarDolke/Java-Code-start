import java.awt.*;
import java.awt.event.*;
import java.io.*;
class empdet extends Frame implements ActionListener
{
Label l1,l2,l3;
Label l,lt1,lt2,lt3;
Button cancel;
Panel p1=new Panel();
Panel p2=new Panel();
Panel p3=new Panel();

empdet(String b,String c,String d)
{


l=new Label("EMPLOYEE INFORMTION");
p1.add(l);

l1=new Label("Emp No. : -");
l2=new Label("Name : -");
l3=new Label("Salary : -");
lt1=new Label(b);
lt2=new Label(c);
lt3=new Label(d);

cancel=new Button("CLOSE"); cancel.addActionListener(this);
p2.setLayout(new GridLayout(6,2));
p2.add(l1);
p2.add(lt1);
p2.add(l2);
p2.add(lt2);
p2.add(l3);
p2.add(lt3);

p3.setLayout(new GridLayout(1,1));
p3.add(cancel);


add(p1,BorderLayout.NORTH);
add(p2,BorderLayout.CENTER);
add(p3,BorderLayout.SOUTH);
setVisible(true);
setSize(400,400);
}
public void actionPerformed(ActionEvent ae)
{
if(ae.getSource()==cancel)
{
System.exit(0);
}
}
}
