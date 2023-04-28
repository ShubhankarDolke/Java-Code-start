import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Slip21 extends JFrame implements ActionListener
{
        JLabel ltext, lfind, lreplace, loccurrence;
        JTextArea text;
        JTextField findText, replaceText, occurrenceText;
        JButton find, replace, clear;
        JPanel pan1,pan2;
        int occurrences=0,i=0;

        Slip21()
        {
         
                  ltext= new JLabel("Enter Text : ");
                  lfind = new JLabel("Text to Find : ");
                  lreplace = new JLabel("Text to Replace : ");
                  loccurrence = new JLabel("No.of Occurrences : ");


                text = new JTextArea(1,20);
                findText = new JTextField(20);
                replaceText = new JTextField(20);
                occurrenceText = new JTextField(20);

                pan1 = new JPanel();
                pan1.setLayout(new GridLayout(4,2));
                pan1.add(ltext);
                pan1.add(text);
                pan1.add(lfind);
                pan1.add(findText);
                pan1.add(lreplace);
                pan1.add(replaceText);
                pan1.add(loccurrence);
                pan1.add(occurrenceText);

                find = new JButton("Find");
                replace = new JButton("Replace");
                clear= new JButton("Clear");

                find.addActionListener(this);
                replace.addActionListener(this);
                clear.addActionListener(this);

                pan2 = new JPanel();
                pan2.setLayout(new FlowLayout());
                pan2.add(find);
                pan2.add(replace);
                pan2.add(clear);

              
                add(pan1,"Center");
                add(pan2,"South");

                setTitle("Find And Replace");
                setSize(300, 200);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
        }

     
        public void actionPerformed(ActionEvent ae)
        {
              
                if(ae.getSource() == find)
                {
	String s = text.getText();
	String f = findText.getText();
	int cnt=0;
	int len=findText.getText().length();
                   	
	     for(i=0;i<s.length()-(len-1);i++)
                        {
		String substr=s.substring(i,i+len);
			if(substr.equals(findText.getText()))
			{
				cnt=cnt+1;
			}
	         }
	occurrenceText.setText(""+cnt);
	  

                }
                if(ae.getSource() == replace)
                {
                        if(text.getSelectedText().length()!=0)
                        {
                                
		String r = replaceText.getText();
                                   text.replaceSelection(r);
		
                        }

}
                
                if(ae.getSource() == clear)
                {
                 text.setText("");
                 findText.setText("");
                 replaceText.setText("");
                 occurrenceText.setText("");
                }
         }
     
         public static void main(String[] args)
         {
            new Slip21();
         }
}