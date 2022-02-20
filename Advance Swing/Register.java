import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Register extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t4,t5;
	JPasswordField t2,t3;
	JButton b1,b2;
	Register(FDemo f)
	{
		
		setLayout(null);
		
		u1=new JLabel("Enter Name");
		u1.setSize(120,30);
		u1.setLocation(130,130);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(270,130);
		add(t1);
		
		u2=new JLabel("Enter Password");
		u2.setSize(120,30);
		u2.setLocation(130,180);
		add(u2);
		
		t2=new JPasswordField();
		t2.setSize(150,30);
		t2.setLocation(270,180);
		add(t2);
		
		u3=new JLabel("Confirm Password");
		u3.setSize(120,30);
		u3.setLocation(130,230);
		add(u3);
		
		t3=new JPasswordField();
		t3.setSize(150,30);
		t3.setLocation(270,230);
		add(t3);
		
		u4=new JLabel("Contact No.");
		u4.setSize(120,30);
		u4.setLocation(130,280);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(150,30);
		t4.setLocation(270,280);
		add(t4);
		
		u5=new JLabel("Email");
		u5.setSize(120,30);
		u5.setLocation(130,330);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(150,30);
		t5.setLocation(270,330);
		add(t5);
			
		b1=new JButton("Register");
		b1.setSize(85,35);
		b1.setLocation(232,370);
		add(b1);
		b1.addActionListener(this);
		
		b2=new JButton("Login");
		b2.setSize(85,35);
		b2.setLocation(332,370);
		add(b2);
		b2.addActionListener(f);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
	    
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		
				String db_url="jdbc:mysql://Localhost:3306/mydb?useSSL=false";
				String db_uname="root";
				String db_upass="root";
		
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		
				Statement st=con.createStatement();
		
				String q="insert into user values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
		
				
				if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0)
				{
					JOptionPane.showMessageDialog(b1,"Please Fill All the fields above","Softwaves Developers",JOptionPane.INFORMATION_MESSAGE);
				}
				else
				{ 
					st.executeUpdate(q);
					System.out.println("Registered");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
				t5.setText("");
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		
		
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("Register.png");
		g.drawImage(i,0,0,this);
	}
}
