import java.awt.*;
import java.applet.*;
public class Slip30 extends Applet
{
public void paint(Graphics g)
{
g.drawOval(100,50,200,200);
g.drawOval(135,80,40,40);
g.fillOval(135,80,40,40);
g.drawOval(220,80,40,40);
g.fillOval(220,80,40,40);
g.drawLine(200,120,200,170);
g.drawArc(148,106,100,100,-30,-120);
}
}