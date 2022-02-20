import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class LoginPanel extends JPanel implements ActionListener
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
		b2.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e1)
	{
    class Register extends JPanel implements ActionListener
	{

    JLabel un,up;
    JTextField tx1,tx2;
    JButton b1;
    Register()
	{
		un=new JLabel("Name");
		un.setSize(120,30);
		un.setLocation(225,200);
		add(un);
		
		tx1=new JTextField();
		tx1.setSize(150,30);
		add(tx1);
		
		up=new JLabel("Password");
		up.setSize(120,30);
		up.setLocation(225,250);
		add(up);
		
		tx2=new JPasswordField(20);
		tx2.setSize(150,30);
		tx2.setLocation(300,250);
		add(tx2);
		
		b1=new JButton("Submit");
		b1.setSize(85,35);
		b1.setLocation(262,300);
		add(b1);
		b1.addActionListener(this);
	}
		public void actionPerformed(ActionEvent e)
		{
			String s1=tx1.getText();
			String s2=tx2.getText();
		
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
			
				String db_url="jdbc:mysql=//Localhost:3306/mydb?useSSL=false";
				String db_uname="root";
				String db_upass="root";
			
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
				Statement st=con.createStatement();
			
				String q="insert into user values('"+s1+"','"+s2+"')";
				st.executeQuery(q);
			
				System.out.println("Registered");
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}		
		public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("loginpanel.png");
		g.drawImage(i,0,0,this);
	}
}

	
	

	
