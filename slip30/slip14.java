import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class slip14 extends Frame
{
public slip14()
{
setSize(400,400);
setVisible(true);
addWindowListener(new WindowAdapter()
{
public void windowClosing(WindowEvent es)
{
setBackground(Color.red);
}
});
}
public static void main(String arg[])
{
new slip14();
}
}