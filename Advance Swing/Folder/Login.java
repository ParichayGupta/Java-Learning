import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Login extends JPanel
{
	JButton b1,b2,b3;
	JLabel u1,u2;
	JTextField t1;
	JPasswordField t2;
	
	Login(FDemo f)
	{
		setLayout(null);
		
		u1=new JLabel("User Name");
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
		b2.setLocation(300,250);
		add(b2);
		b2.addActionListener(f);
		
		b3=new JButton("Home");
		b3.setSize(85,35);
		b3.setLocation(100,400);
		add(b3);
		b3.addActionListener(f);

	}
}

class Register extends JPanel
{	
	JButton b1,b2;
	JLabel u1,u2,u3,u4;
	JTextField t1,t4;
	JPasswordField t2,t3;

	Register(FDemo f)
	{
		
		setLayout(null);
		
		u1=new JLabel("Enter Name");
		u1.setSize(100,30);
		u1.setLocation(150,150);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(200,30);
		t1.setLocation(270,150);
		add(t1);
		
		u2=new JLabel("Create Password");
		u2.setSize(100,30);
		u2.setLocation(150,200);
		add(u2);
		
		t2=new JPasswordField();
		t2.setSize(200,30);
		t2.setLocation(270,200);
		add(t2);
		
		u3=new JLabel("Confirm Password");
		u3.setSize(100,30);
		u3.setLocation(150,250);
		add(u3);
		
		t3=new JPasswordField();
		t3.setSize(200,30);
		t3.setLocation(270,250);
		add(t3);
		
		u4=new JLabel("Contact No.");
		u4.setSize(100,30);
		u4.setLocation(150,300);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(200,30);
		t4.setLocation(270,300);
		add(t4);
		
		b1=new JButton("Register");
		b1.setSize(85,35);
		b1.setLocation(210,350);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("Login");
		b2.setSize(85,35);
		b2.setLocation(300,350);
		add(b2);
		b2.addActionListener(f);
	}
}