import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register extends JPanel implements ActionListener
{
	JLabel u1,u2,u3;
	JTextField t1;
	JPasswordField t2,t3;
	JButton b1,b2;
	
	Register(FDemo f)
	{
		setLayout(null);
		
		u1=new JLabel("Enter Name");
		u1.setSize(120,30);
		u1.setLocation(150,150);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(200,30);
		t1.setLocation(300,150);
		add(t1);
		
		u2=new JLabel("Enter Password");
		u2.setSize(120,30);
		u2.setLocation(150,200);
		add(u2);
		
		t2=new JPasswordField();
		t2.setSize(200,30);
		t2.setLocation(300,200);
		add(t2);
		
		u3=new JLabel("confirm Password");
		u3.setSize(120,30);
		u3.setLocation(150,250);
		add(u3);
		
		t3=new JPasswordField();
		t3.setSize(200,30);
		t3.setLocation(300,250);
		add(t3);
		
		b1=new JButton("Register");
		b1.setSize(85,35);
		b1.setLocation(220,300);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Login");
		b2.setSize(85,35);
		b2.setLocation(220,350);
		add(b2);
		b2.addActionListener(f);
		
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Register.png");
		g.drawImage(i,0,0,this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		
		
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String db_url="jdbc:mysql://localhost:3306/Softwaves?useSSL=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				
				if (s1.length()>0 || s2.length()>0 || s3.length()>0)
				{
					if(s2.equals(s3))
					{
						String q="insert into Regis values('"+s1+"','"+s2+"')";
						st.executeUpdate(q);
				
						System.out.println("Registered");
					}
					else
					{
						JOptionPane.showMessageDialog(b1,"Password Dosen't match");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(b1,"Please fill the above fields");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
		
				
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}
