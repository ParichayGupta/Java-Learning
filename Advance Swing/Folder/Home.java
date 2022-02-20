import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
 
class Home extends JPanel
{
	JButton b1,b2;
	
	Home(FDemo f)
	{	
		setLayout(null);
		b1=new JButton("Login");
		b1.setSize(85,35);
		b1.setLocation(320,400);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("About");
		b2.setSize(85,35);
		b2.setLocation(450,400);
		add(b2);
		b2.addActionListener(f);
	}
}

class About extends JPanel
{
	JButton b1;
	About(FDemo f)
	{
		setLayout(null);
		b1=new JButton("Home");
		b1.setSize(85,35);
		b1.setLocation(320,400);
		add(b1);
		b1.addActionListener(f);
		
	}
}