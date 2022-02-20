import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Home extends JPanel
{
	JLabel l1,l2,l3;
	JButton b1,b2,b3;
	JTextField t1;
	JPasswordField t2; 
	
	Home(FDemo f,User up)
	{
		setLayout(null);
		
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		l1=new JLabel("UserName");
		l1.setBounds(280,300,80,15);
		l1.setForeground(b);
		l1.setFont(fo1);
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(280,320,250,25);
		t1.setFont(fo1);
		t1.setForeground(gr);
		t1.setOpaque(true);
		add(t1);
		
		l2=new JLabel("Password");
		l2.setBounds(280,350,80,15);
		l2.setForeground(b);
		l2.setFont(fo1);
		add(l2);
		
		t2=new JPasswordField();
		t2.setBounds(280,370,250,25);
		t2.setOpaque(true);
		t2.setForeground(gr);
		t2.setFont(fo1);
		add(t2);
		
		l3=new JLabel("Examination Portal");
		l3.setBounds(30,30,500,90);
		l3.setFont(fo3);
		l3.setForeground(y);
		add(l3);
		
		b1=new JButton("Login");
		b1.setBounds(280,440,250,25);
		b1.setFont(fo2);
		b1.setBackground(b);
		b1.setForeground(Color.white);
		b1.setOpaque(true);
		b1.setBorder(BorderFactory.createEmptyBorder());
		add(b1);
		b1.addActionListener(f);
						
		b2=new JButton("About");
		b2.setBounds(650,130,100,15);
		b2.setBorderPainted(false);
		b2.setForeground(y);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setOpaque(true);
		b2.setContentAreaFilled(false);
		b2.setFont(fo2);
		add(b2);
		b2.addActionListener(f);
		
		b3=new JButton("New User - Register Here");
		b3.setBounds(280,400,250,35);
		b3.setBorderPainted(false);
		b3.setForeground(b);
		b3.setBorder(BorderFactory.createEmptyBorder());
		b3.setOpaque(true);
		b3.setContentAreaFilled(false);
		b3.setFont(fo2);
		add(b3);
		b3.addActionListener(f);

	}
	
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);
		g.setColor(r);
		g.fillRect(0,0,800,150);
		g.setColor(b);
		g.drawRoundRect(245,250,330,230,5,5);
		
	}
}	
