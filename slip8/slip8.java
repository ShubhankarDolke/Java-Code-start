import java.awt.*;
import javax.swing.*;
class Slip8 extends JFrame
{
     JLabel fn,ln,add,mob,gen,interest;
     JTextField t1,t2,t3;
     JTextArea t;
     JPanel p,p1,p2,p3;
     JButton b1,b2;
     Slip8()
   {
    p=new JPanel();
    fn=new JLabel("First name");
    ln=new JLabel("last name");
    add=new JLabel("Address");
     mob=new JLabel("mobile no");
    t1=new JTextField(10);
    t2=new JTextField(10);
    t3=new JTextField(10);
     t=new JTextArea(2,10);
     p.add(fn);  p.add(t1);
     p.add(ln);  p.add(t2);
     p.add(add); p.add(t);
     p.add(mob); p.add(t3);
    p.setLayout(new GridLayout(4,2));
    add(p);

        p1=new JPanel();
gen=new JLabel("Gender");
       JRadioButton m,f;
       m=new JRadioButton("male");
      f=new JRadioButton("female");
  ButtonGroup bg=new ButtonGroup();
       bg.add(m);
      bg.add(f);
       p1.add(gen);
      p1.add(m);
      p1.add(f);
        p1.setLayout(new GridLayout(1,3));
       p2=new JPanel();
      interest=new JLabel("your interests");
           JCheckBox C,S,M;
       C=new JCheckBox("computer");
       S=new JCheckBox("sports");
       M=new JCheckBox("music");
      p2.add(interest);
     p2.add(C);
      p2.add(S);
     p2.add(M);
     p2.setLayout( new GridLayout(1,4));
     p3=new JPanel();
     b1=new JButton("submit");
     b2=new JButton("reset");
      p3.add(b1);
     p3.add(b2);
       add(p);
     add(p1);
    add(p2);
      add(p3);
     setSize(300,400);
    setLayout( new FlowLayout());
    setVisible(true);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

   public static void main(String a[])
{
    new Slip8();
   }
}   
      