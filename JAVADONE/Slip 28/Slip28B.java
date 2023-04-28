/*
Write a java program to display the selected employee details in JTable. (use database, combo box for employee 
selection )  Employee having fields eno, ename, sal, desg. (Slip28B)
*/
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.sql.*;
import javax.swing.table.DefaultTableModel;


public class Slip28B extends JFrame implements ActionListener
{
private Label lblEid;
private JComboBox empId;
private JTable empTable;	
private JButton btnShow;
private JPanel inputPanel;
Connection conObject=null;
Statement stmt;

public Slip28B() throws SQLException,ClassNotFoundException
{
	setTitle( "Book Sales Details" );
	setSize( 500, 300 );
	setBackground( Color.gray );

	inputPanel = new JPanel(new FlowLayout());
	lblEid = new Label("Select Employee Id : ");
	empId = new JComboBox();
	btnShow = new JButton("Display Record");
	btnShow.addActionListener(this);
	inputPanel.add(lblEid); 
	inputPanel.add(empId); 
	inputPanel.add(btnShow);
	add(inputPanel);

	//populating combo box with EmpId	
	String DriverName = "sun.jdbc.odbc.JdbcOdbcDriver";			
	Class.forName(DriverName);					
	conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
	stmt = conObject.createStatement();
	String query  = "Select * from Employee";		
	ResultSet rs = stmt.executeQuery(query);	
	while(rs.next())
	{
		empId.addItem(rs.getString(1));
	}
	rs.close();
	stmt.close();
	conObject.close();
	
}
public void actionPerformed(ActionEvent ae)
{
try
{	
	String id = empId.getSelectedItem().toString();	
	String DriverName = "sun.jdbc.odbc.JdbcOdbcDriver";			
	Class.forName(DriverName);					
	conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
	stmt = conObject.createStatement();
	String query  = "Select * from Employee where EmpId=" + id;		
	ResultSet rs = stmt.executeQuery(query);
	
	// Create a new table instance
	empTable = new JTable(1,4);	
	DefaultTableModel model = (DefaultTableModel)empTable.getModel();					
	
	if(rs.next())
	{
		empTable .setValueAt(rs.getString(1),0,0);
		empTable .setValueAt(rs.getString(2),0,1);
		empTable .setValueAt(rs.getString(3),0,2);
		empTable .setValueAt(rs.getString(4),0,3);	
	}	
	rs.close();
	stmt.close();
	conObject.close();	
	inputPanel.add(new JScrollPane(empTable));
	validate();
	repaint();	
}catch(SQLException se){
	System.out.println(se);
}catch(ClassNotFoundException cnfe){
	System.out.println(cnfe);
}			
}

public static void main( String args[] ) throws SQLException,ClassNotFoundException
{
	// Create an instance of the test application
	Slip28B mainFrame	= new Slip28B();
	mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	mainFrame.setVisible( true );
}
}