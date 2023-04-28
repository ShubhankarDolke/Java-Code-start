import java.awt.*;
class slip7 extends Frame
{
    Label L;
   slip7()
      {
           L=new Label("hello java");
           L.setFont(new Font("Georgia",Font.BOLD,14));
           L.setForeground(Color.RED);
          add(L);
          setBackground(Color.BLUE);
          setSize(300,300);
          setLayout(new FlowLayout());
          setVisible(true);
      }
public static void main(String a[])
{
     new slip7();
     }
        
}