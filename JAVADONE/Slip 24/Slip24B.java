/*
Write a java program to accept the details of college (CID, CName, Address, year)
 and store it into database (Use Swing and PreparedStatement interface) (Slip24B)
*/
import java.io.*;
import java.sql.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Slip24B extends JFrame implements ActionListener
{
	private Label lblId, lblName, lblAddr, lblYear, lblMsg;
	private JTextField txtId, txtName, txtAddr, txtYear;
	private JButton btnAdd;
	private JPanel inputPanel;
	Connection conObject=null;
	PreparedStatement pst;

	public Slip24B() throws SQLException
	{
		setTitle( "College Details" );
		setSize( 500, 300 );
		setBackground( Color.gray );

		inputPanel = new JPanel(new GridLayout(5,2));

		lblId = new Label("College Id : ");
		lblName = new Label("College Name : ");
		lblAddr = new Label("College Address : ");
		lblYear = new Label("College Year : ");
		lblMsg = new Label();
	
		txtId = new JTextField(10);
		txtName = new JTextField(30);
		txtAddr = new JTextField(50);
		txtYear = new JTextField(10);
			
		btnAdd = new JButton("Insert Record");
		btnAdd.addActionListener(this);

		inputPanel.add(lblId); 
		inputPanel.add(txtId); 

		inputPanel.add(lblName); 
		inputPanel.add(txtName); 

		inputPanel.add(lblAddr); 
		inputPanel.add(txtAddr); 

		inputPanel.add(lblYear); 
		inputPanel.add(txtYear); 

		inputPanel.add(btnAdd);
		inputPanel.add(lblMsg);
		add(inputPanel);	
	}

	public void actionPerformed(ActionEvent ae)
	{
		try
		{			
			String DriverName = "sun.jdbc.odbc.JdbcOdbcDriver";			
			Class.forName(DriverName);					
			conObject = DriverManager.getConnection("jdbc:odbc:SlipsDsn");
			pst = conObject.prepareStatement("Insert into College values(?,?,?,?)");
			int id = Integer.parseInt(txtId.getText());
			pst.setInt(1, id);
			pst.setString(2, txtName.getText());
			pst.setString(3, txtAddr.getText());
			pst.setString(4, txtYear.getText());
			int row = pst.executeUpdate();
			String msg = row + " row inserted successfully!";
			lblMsg.setText(msg);
			pst.close();
			conObject.close();			
		}catch(ClassNotFoundException e) {
			System.out.println("Class not found exception.");
		}catch(SQLException sqle){
			System.out.println(sqle);
		}
	}

	public static void main( String args[] ) throws SQLException
	{
		// Create an instance of the test application
		Slip24B mainFrame	= new Slip24B();
		mainFrame.setVisible( true );
	}
}