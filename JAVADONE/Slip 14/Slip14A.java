/*
Write a JDBC program in java to display details of Book_Sales(SalesID, Date, Amount)  
of selected month in JTable. Book_sales table is already created.
*/
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Slip14A extends JFrame implements ActionListener
{
	private Label lblMonth;
	private JComboBox month;
	private JTable salesTable;	
	private JButton btnShow;
	private JPanel inputPanel;
	Connection conObject=null;
	Statement stmt;

	public Slip14A() 
	{
		setTitle( "Book Sales Details" );
		setSize( 500, 300 );
		setBackground( Color.gray );

		inputPanel = new JPanel(new FlowLayout());

		lblMonth = new Label("Select Month : ");
		month = new JComboBox();
		month.addItem("1");
		month.addItem("12");
		month.addItem("2");	
		month.setSelectedIndex(0);

		btnShow = new JButton("Display Records");
		btnShow.addActionListener(this);

		inputPanel.add(lblMonth); 
		inputPanel.add(month); 
		inputPanel.add(btnShow);
		add(inputPanel);				
		
	}	

	public void actionPerformed(ActionEvent ae)
	{
		String mn = month.getSelectedItem().toString();
		
		try
		{			
			String DriverName = "sun.jdbc.odbc.JdbcOdbcDriver";			
			Class.forName(DriverName);					
			conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");

			//Fetch data into ResultSet
			stmt = conObject.createStatement();
			String query  = "Select * from Book_Sales where month(SalesDate)=" + mn;		
			ResultSet rs = stmt.executeQuery(query);
			int rows=0;
		
			//find no.of records in ResultSet/Table
			while(rs.next())
				rows++;
						
			// Create a new table instance
			salesTable = new JTable(rows,3);					

			int row_no = 0;
		
			rs = stmt.executeQuery(query);
			while(rs.next())
			{
				salesTable .setValueAt(rs.getString(1),row_no,0);
				salesTable .setValueAt(rs.getString(2),row_no,1);
				salesTable .setValueAt(rs.getString(3),row_no,2);
				row_no++;
			}	
			rs.close();
			stmt.close();
			conObject.close();
		}catch(ClassNotFoundException e) {
			System.out.println("Class not found exception.");
		}catch(SQLException sqle){
			System.out.println(sqle);
		}

		inputPanel.add(new JScrollPane(salesTable));
		validate();
		getContentPane().repaint();	

			
	}

	public static void main( String args[] ) throws SQLException
	{
		// Create an instance of the test application
		Slip14A mainFrame	= new Slip14A();
		mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		mainFrame.setVisible( true );
	}
}	