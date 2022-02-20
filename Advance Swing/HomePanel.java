import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HomePanel extends JPanel 
{
	JButton b1,b2;
	HomePanel(FDemo f)
	{
		setLayout(null);
		b1=new JButton("Login");
		b1.setBounds(300,300,85,35);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("About");
		b2.setBounds(300,350,85,35);
		add(b2);
		b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("homepanel.png");
		g.drawImage(i,0,0,this);
	}
	
}

class About extends JPanel 
{
	JButton b1;
	JLabel u1;
	About(FDemo f)
	{
		setLayout(null);

		u1=new JLabel();
		u1.setSize(400,400);
		u1.setLocation(150,100);
		add(u1);
		
		
		b1=new JButton("Home");
		b1.setBounds(30,400,85,35);
	 	add(b1);	
		b1.addActionListener(f);
	}

	public void paintComponent(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("About.png");
		g.drawImage(i,0,0,this);
	}
}