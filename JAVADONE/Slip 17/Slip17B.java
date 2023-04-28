import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;

public class Slip17B extends JFrame implements ActionListener
{
private JLabel l1,l2;
private JButton b1,b2,b3;
private JPanel inputPanel;
private JTextField t1;
Connection conObject=null;
Statement stmt;

public Slip() throws SQLException,ClassNotFoundException
{
setTitle( "DDL Queries" );
setSize( 500, 300 );
setBackground( Color.gray );

inputPanel = new JPanel(new FlowLayout());
l1= new JLabel("Type DDL Query : ");
l2= new JLabel("");
t1 = new JTextField(80);

b2= new JButton("Create Table");
b2.addActionListener(this);

b3= new JButton("Alter Table");
b3.addActionListener(this);

b1= new JButton("Drop Table");
b1.addActionListener(this);

inputPanel.add(l1);
inputPanel.add(t1);
inputPanel.add(b1);
inputPanel.add(b2);
inputPanel.add(b3);
inputPanel.add(l2);
add(inputPanel);

}

public void actionPerformed(ActionEvent ae)
{
try
{
	Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
	conObject = DriverManager.getConnection("jdbc:odbc:BCADsn");
	stmt = conObject.createStatement();
	String query  = t1.getText();		
	int r = stmt.executeUpdate(query);
	if(r==-1)
		l2.setText("Query executed successfully!");	
	stmt.close();
	conObject.close();
	repaint();	
}catch(SQLException se){
	l2.setText("Syntax error in query");
	System.out.println(se);
}catch(ClassNotFoundException cnfe){
	System.out.println(cnfe);
}
}

public static void main( String args[] ) throws SQLException,ClassNotFoundException
{
Slip17B mainFrame	= new Slip17B();
mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
mainFrame.setVisible( true );
}
}