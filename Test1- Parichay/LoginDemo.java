import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginDemo extends JPanel
{
	
	JLabel u1,u2;
	JTextField t1;
	JPasswordField t2;
	JButton b1,b2;
	
	
	LoginDemo(FDemo f)
	{
		
		setLayout(null);
		u1=new JLabel("UserName");
		u1.setSize(100,30);
		u1.setLocation(150,150);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(200,30);
		t1.setLocation(270,150);
		add(t1);
		
		u2=new JLabel("Password");
		u2.setSize(100,30);
		u2.setLocation(150,200);
		add(u2);
		
		t2=new JPasswordField();
		t2.setSize(200,30);
		t2.setLocation(270,200);
		add(t2);
		
		b1=new JButton("Login");
		b1.setSize(85,35);
		b1.setLocation(210,250);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("Register");
		b2.setSize(85,35);
		b2.setLocation(210,300);
		add(b2);
		b2.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("loginpanel.png");
		g.drawImage(i,0,0,this);
	}
	
}

