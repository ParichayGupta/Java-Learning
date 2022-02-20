import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class About extends JPanel
{
	
	JButton b1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8;
	
	About(FDemo f)
	{
		setLayout(null);

		Font fo1=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,20);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		l1=new JLabel("About Project:-");
		l1.setBounds(30,200,250,30);
		l1.setFont(fo2);
		l1.setForeground(r);
		add(l1);
		
		
		l2=new JLabel("Version - 1.0.0");
		l2.setBounds(30,250,250,30);
		l2.setFont(fo2);
		l2.setForeground(gr);
		add(l2);
		
		l3=new JLabel("About Us:-");
		l3.setBounds(30,300,250,30);
		l3.setFont(fo2);
		l3.setForeground(r);
		add(l3);
		
		l4=new JLabel("Created By:-");
		l4.setBounds(30,350,130,30);
		l4.setFont(fo2);
		l4.setForeground(gr);
		add(l4);
		
		l5=new JLabel("PARICHAY GUPTA");
		l5.setBounds(150,350,250,30);
		l5.setFont(fo2);
		l5.setForeground(b);
		add(l5);
		
		l6=new JLabel("Guided By:-");
		l6.setBounds(30,400,130,30);
		l6.setFont(fo2);
		l6.setForeground(gr);
		add(l6);
		
		l7=new JLabel("ABHISHEK JAIN SIR");
		l7.setBounds(150,400,250,30);
		l7.setFont(fo2);
		l7.setForeground(b);
		add(l7);
		
		l8=new JLabel("About");
		l8.setBounds(30,30,250,70);
		l8.setFont(fo3);
		l8.setForeground(r);
		add(l8);
	
		b1=new JButton("Back To Login");
		b1.setBounds(450,600,250,25);
		b1.setBackground(b);
		b1.setForeground(Color.white);
		b1.setFont(fo2);
		add(b1);
		b1.addActionListener(f);
	}
	
	
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);
		g.setColor(y);
		g.fillRect(0,0,800,150);
	}
}