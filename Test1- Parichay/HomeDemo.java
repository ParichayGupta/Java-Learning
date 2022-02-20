import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class HomeDemo extends JPanel 
{
	JButton b1,b2;
	HomeDemo(FDemo f)
	{
		setLayout(null);
		
		b1=new JButton("Login");
		b1.setSize(100,50);
		b1.setLocation(500,400);
		add(b1);
		b1.addActionListener(f);
		
	    b2=new JButton("About");
		b2.setSize(100,50);
		b2.setLocation(100,400);
		add(b2);
		b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Background.png");
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
		
		u1=new JLabel("ABOUT");
		u1.setSize(100,40);
		u1.setLocation(300,100);
		add(u1);
		
		
		b1=new JButton("Home");
		b1.setSize(100,50);
		b1.setLocation(100,400);
		add(b1);
		b1.addActionListener(f);	
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("About.png");
		g.drawImage(i,0,0,this);
	}
}