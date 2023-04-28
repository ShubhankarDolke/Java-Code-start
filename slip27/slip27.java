import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class slip27 extends JFrame implements ActionListener
{

JButton b;
String str[][]={{"chap1","mustafa"},{"chap2","ali"},{"chap3","deepak"}};
String nm[]={"chap","name"};

public slip27()
{
b=new JButton("insert");
setLayout(new FlowLayout());
add(b);
b.addActionListener(this);
setSize(500,500);
setVisible(true);
}
public void actionperformed(ActionEvent e)
{
JTable tab=new JTable(str,nm);
add(tab);
}
public static void main(String arg[])
{
new slip27();
}
}
