import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginPanel extends JPanel
{ 	
	JButton b1,b2;
	JTextField tx1;
	JPasswordField tx2;
	JLabel un,up;
	LoginPanel(FDemo f)
	{
		
		setLayout(null);

		un=new JLabel("Name");
		un.setSize(120,30);
		un.setLocation(225,200);
		add(un);
		
		tx1=new JTextField();
		tx1.setSize(150,30);
		tx1.setLocation(300,200);
		add(tx1);
		
		up=new JLabel("Password");
		up.setSize(120,30);
		up.setLocation(225,250);
		add(up);
		
		tx2=new JPasswordField(20);
		tx2.setSize(150,30);
		tx2.setLocation(300,250);
		add(tx2);
		
		b1=new JButton("Login");
		b1.setSize(85,35);
		b1.setLocation(262,300);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("Register");
		b2.setSize(85,35);
		b2.setLocation(262,350);
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