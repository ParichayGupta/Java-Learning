import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Menu extends JPanel 
{
	JTabbedPane tp;
	
	Insert in;
	Update ud;
	Delete del;
	Show sw;
	
	Menu(FDemo f)
	{
		in=new Insert();
		ud=new Update();
		del=new Delete();
		sw=new Show();
		
		setLayout(new BorderLayout());
		tp=new JTabbedPane();
		tp.addTab("Insert",in);
		tp.addTab("Update",ud);
		tp.addTab("Delete",del);
		tp.addTab("Show",sw);
		add(tp);
	}
} 

class Insert extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	
	Insert()
	{	
		setLayout(null);
		
		u1=new JLabel("Roll_No");
		u1.setSize(100,30);
		u1.setLocation(150,50);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(200,30);
		t1.setLocation(270,50);
		add(t1);
		
		u2=new JLabel("Name");
		u2.setSize(100,30);
		u2.setLocation(150,100);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(200,30);
		t2.setLocation(270,100);
		add(t2);
		
		u3=new JLabel("Physics");
		u3.setSize(100,30);
		u3.setLocation(150,150);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(200,30);
		t3.setLocation(270,150);
		add(t3);
		
		u4=new JLabel("Maths");
		u4.setSize(100,30);
		u4.setLocation(150,200);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(200,30);
		t4.setLocation(270,200);
		add(t4);
		
		u5=new JLabel("Chemistry");
		u5.setSize(100,30);
		u5.setLocation(150,250);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(200,30);
		t5.setLocation(270,250);
		add(t5);
		
		b1=new JButton("Insert");
		b1.setSize(85,35);
		b1.setLocation(210,300);
		add(b1);
		b1.addActionListener(this);
		
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
				
				String db_url="jdbc:mysql://localhost:3306/Newdb?useSSL=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0)
				{
					JOptionPane.showMessageDialog(b1,"Please Fill all the fields above");
				}
				else
				{
				String q="insert into users values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
				st.executeUpdate(q);
				
				System.out.println("Data Inserted");
				}
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
			
		}
	}
}

class Update extends JPanel implements ActionListener 
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1,b2;
	
	Update()
	{
		setLayout(null);
		
		u1=new JLabel("Roll_No");
		u1.setSize(100,30);
		u1.setLocation(150,50);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(200,30);
		t1.setLocation(270,50);
		add(t1);
		
		u2=new JLabel("Name");
		u2.setSize(100,30);
		u2.setLocation(150,100);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(200,30);
		t2.setLocation(270,100);
		add(t2);
		
		u3=new JLabel("Physics");
		u3.setSize(100,30);
		u3.setLocation(150,150);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(200,30);
		t3.setLocation(270,150);
		add(t3);
		
		u4=new JLabel("Maths");
		u4.setSize(100,30);
		u4.setLocation(150,200);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(200,30);
		t4.setLocation(270,200);
		add(t4);
		
		u5=new JLabel("Chemistry");
		u5.setSize(100,30);
		u5.setLocation(150,250);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(200,30);
		t5.setLocation(270,250);
		add(t5);
		
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(500,50);
		add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("Show");
		b2.setSize(85,35);
		b2.setLocation(210,300);
		add(b2);
		b2.addActionListener(this);
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
				
				String db_url="jdbc:mysql://localhost:3306/Newdb?useSSl=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				
				String q="Select * form users where ROLL_NO='"+s1+"'";
				
				ResultSet rs=st.executeQuery(q);
				
				if(rs.next())
				{
					s1.setText(rs.getString(1));
					s2.setText(rs.getString(2));
					s3.setText(rs.getString(3));
					s4.setText(rs.getString(4));
					s5.setText(rs.getString(5));
				}
				else
				{
					JOptionPane.showMessageDialog(b1,"Invalid ROLL_NO");
				}
				if(e.getSource()==b2)
				{
					String s6=t3.getText();
					String s7=t4.getText();
					String s8=t5.getText();
					
						String q1="Update users set PHYSICS='"+s6+"',MATHS='"+s7+"',CHEMISTRY='"+s8+"'";
						
						st.executeUpdate(q1);
						
						System.out.println("Values Updated");
						
						if(s1.length()==0 || s6.length()==0 || s7.length()==0 || s8.length()==0)
						{
							JOptionPane.showMessageDialog(b1,"Please fill the above fields","Softwaves Developers",JOptionPane.INFORMATION_MESSAGE);
						}
						t1.setText("");
						t2.setText("");
						t3.setText("");
						t4.setText("");
						t5.setText("");
				}
				con.close();
				}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}

class Delete extends JPanel
{
	Delete()
	{
		
	}
}

class Show extends JPanel
{
	Show()
	{
		
	}
}