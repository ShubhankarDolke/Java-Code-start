import java.awt.*;
import java.awt.event.*;
import java.io.*;
import javax.swing.*;
class slip14 extends JFrame
{
JPanel p = new JPanel();
slip14()
{ 
 setVisible(true);
 setSize(400,400);
 add(p);
 p.setBackground(Color.BLUE);
 addWindowListener(new WindowAdapter()
 {
  public void windowClosing(WindowEvent e)
  {
   p.setBackground(Color.RED);
   JOptionPane.showMessageDialog(null,"BackGround Color is"+p.getBackground(),"Color",JOptionPane.INFORMATION_MESSAGE);
   new slip14().show();
  }
 });
}

public static void main(String args[])
{
new slip14().show();
}
}