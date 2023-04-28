import java.awt.*;
import java.awt.event.*;
public class slip16 extends Frame implements ActionListener
{
	Button moveBtns[]= new Button[4];
	Panel gridPanels[]= new Panel[16];
	String icons[]={"Left","Up","Right","Down"};
	int cnt=1;
	public slip16()
	{
		setLayout(new GridLayout(5,4));
		for(int i=0;i<16;i++)
		{
			gridPanels[i]= new Panel();
			add(gridPanels[i]).setBackground(Color.blue);
		}
		gridPanels[0].setBackground(Color.black);
		for(int i=0;i<4;i++)
		{
			moveBtns[i]= new Button(icons[i]);
			add(moveBtns[i]);
			moveBtns[i].addActionListener(this);
		}
		setSize(300,300);
		setVisible(true);
		setTitle("Grid Example");
		//setDefaultCloseOperation(Frame.EXIT_ON_CLOSE);
	}
	public void actionPerformed(ActionEvent e)
	{
		Button btn= (Button) e.getSource();
		gridPanels[cnt-1].setBackground(Color.blue);
		if(btn==moveBtns[0])
		{
			if(cnt%4!=1)
			cnt--;
		}
		if(btn==moveBtns[1])
		{
			if(cnt>4)
			cnt=cnt-4;
		}
		if(btn==moveBtns[2])
		{
			if(cnt%4!=0)
			cnt++;
		}
		if(btn==moveBtns[3])
		{
			if(cnt<13)
			cnt=cnt+4;
		}
		gridPanels[cnt-1].setBackground(Color.black);
	}
	public static void main(String args[])
	{
		new slip16().show();
	}
}