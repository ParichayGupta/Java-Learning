import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MenuPanel extends JPanel
{
	JTabbedPane tb;
	Insert in;
	Search sr;
	Update ud;
	Delete del;
	Show sw;
	MenuPanel(FDemo f)
	{
		setLayout(new BorderLayout());
		
		in=new Insert();
		sr=new Search();
		ud=new Update();
		del=new Delete();
		sw=new Show();
		
		tb=new JTabbedPane();
		tb.addTab("Insert",in);
		tb.addTab("Search",sr);
		tb.addTab("Update",ud);
		tb.addTab("Delete",del);
		tb.addTab("Show",sw);
		add(tb);
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
		
		u1=new JLabel("Enter Roll No.");
		u1.setSize(120,30);
		u1.setLocation(130,130);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(270,130);
		add(t1);
		
		u2=new JLabel("Enter Name");
		u2.setSize(120,30);
		u2.setLocation(130,180);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(150,30);
		t2.setLocation(270,180);
		add(t2);
		
		u3=new JLabel("Physics");
		u3.setSize(120,30);
		u3.setLocation(130,230);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(150,30);
		t3.setLocation(270,230);
		add(t3);
		
		u4=new JLabel("Chemistry");
		u4.setSize(120,30);
		u4.setLocation(130,280);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(150,30);
		t4.setLocation(270,280);
		add(t4);
		
		u5=new JLabel("Maths");
		u5.setSize(120,30);
		u5.setLocation(130,330);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(150,30);
		t5.setLocation(270,330);
		add(t5);
		
		b1=new JButton("Insert");
		b1.setSize(85,35);
		b1.setLocation(220,370);
		add(b1);
		b1.addActionListener(this);
	}
    public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Insert.png");
		g.drawImage(i,0,0,this);
	}
	
	public void actionPerformed(ActionEvent e2)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		String s5=t5.getText();
		
		try
		{
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		String db_url="jdbc:mysql://localhost:3306/mydb?useSSL=false";
		
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			Statement st=con.createStatement();
		
			String q="insert into UserDetails values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
			
			if(s1.length()==0 || s2.length()==0 || s3.length()==0 || s4.length()==0 || s5.length()==0)
			{
				JOptionPane.showMessageDialog(b1,"Complete all the Entries","Softwaves Developers",JOptionPane.WARNING_MESSAGE);
			}
			else
			{
				st.executeUpdate(q);
			
				System.out.println("Data Inserted");
			}
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class Search extends JPanel implements ActionListener
{
	JLabel u1,u2;
	JTextField t1;
	JButton b1;
	Search()
	{
		setLayout(null);
		u1=new JLabel("ROLL NO.");
		u1.setSize(100,30);
		u1.setLocation(120,120);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(250,120);
		add(t1);
		
		b1=new JButton("Search");
		b1.setSize(85,35);
		b1.setLocation(280,170);
        add(b1);
		b1.addActionListener(this);
			
	}
	public void actionPerformed(ActionEvent e1)
	{
		String s1=t1.getText();
		
		if(e1.getSource()==b1)
		
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String db_url="jdbc:mysql://localhost:3306/mydb?useSSL=false";
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			Statement st=con.createStatement();
		
			String q="Select * from userDetails where ROLL_NO='"+s1+"'";
			ResultSet rs=st.executeQuery(q);
			if(rs.next())
			{
				JOptionPane.showMessageDialog(b1," "+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5),"Softwaves Developers",JOptionPane.PLAIN_MESSAGE);
				
			}
			else
			{
				JOptionPane.showMessageDialog(b1,"Invalid ROLL NO.");
			}
			t1.setText("");
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Search.png");
		g.drawImage(i,0,0,this);
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
		
		u1=new JLabel("Enter Roll No.");
		u1.setSize(120,30);
		u1.setLocation(130,130);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(270,130);
		add(t1);
		
		
		u2=new JLabel("Enter Name");
		u2.setSize(120,30);
		u2.setLocation(130,180);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(150,30);
		t2.setLocation(270,180);
		add(t2);
		
		u3=new JLabel("Physics");
		u3.setSize(120,30);
		u3.setLocation(130,230);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(150,30);
		t3.setLocation(270,230);
		add(t3);
		
		u4=new JLabel("Chemistry");
		u4.setSize(120,30);
		u4.setLocation(130,280);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(150,30);
		t4.setLocation(270,280);
		add(t4);
		
		u5=new JLabel("Maths");
		u5.setSize(120,30);
		u5.setLocation(130,330);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(150,30);
		t5.setLocation(270,330);
		add(t5);
		
		b1=new JButton("Update");
		b1.setSize(85,35);
		b1.setLocation(220,370);
		add(b1);
		b1.addActionListener(this);

		b2=new JButton("Search");
		b2.setSize(85,35);
		b2.setLocation(450,130);
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
	
		try
			{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String db_url="jdbc:mysql://localhost:3306/mydb?useSSL=false";
		
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			Statement st=con.createStatement();
			
			if(e.getSource()==b2)
			{
			String q1="select * from UserDetails where ROLL_NO='"+s1+"'";
			ResultSet rs=st.executeQuery(q1);
				
				if(rs.next())
				{	
						t1.setText(rs.getString(1));
						t2.setText(rs.getString(2));
						t3.setText(rs.getString(3));
						t4.setText(rs.getString(4));
						t5.setText(rs.getString(5));
					
					System.out.println("Values Fetched");
				}
				else 
				{
					JOptionPane.showMessageDialog(b2,"Invalid ROLL_NO","Softwaves Developers",JOptionPane.WARNING_MESSAGE);
				}
				
			}
			if(e.getSource()==b1)
			{
				String s6=t3.getText();
				String s7=t4.getText();
				String s8=t5.getText();
		
				String q="update UserDetails set PHYSICS='"+s6+"',CHEMISTRY='"+s7+"',MATHS='"+s8+"' where ROLL_NO='"+s1+"'";
				st.executeUpdate(q);
			
				System.out.println("Data Updated");
				
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
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Update.png");
		g.drawImage(i,0,0,this);
	}
}
class Delete extends JPanel implements ActionListener
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	
	Delete()
	{
		setLayout(null);
		u1=new JLabel("ROLL NO.");
		u1.setSize(120,30);
		u1.setLocation(150,150);
	
		t1=new JTextField();
		t1.setSize(120,30);
		t1.setLocation(270,150);
		add(t1);
		
		b1=new JButton("Delete");
		b1.setSize(85,35);
		b1.setLocation(280,200);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		
				String db_url="jdbc:mysql://localhost:3306/mydb?useSSL=false";
		
				String db_uname="root";
				String db_upass="root";
			
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
				Statement st=con.createStatement();
			
				String q="delete from userDetails where ROLL_NO='"+s1+"'";
				if(s1.length()==0)
				{
					JOptionPane.showMessageDialog(b1,"Enter Roll NO","Softwaves Developers",JOptionPane.INFORMATION_MESSAGE);
				}	
				else
				{
					st.executeUpdate(q);
					System.out.println("Data Deleted");
				}
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		else
		{
			JOptionPane.showMessageDialog(b1,"Invalid Roll Number...","Softwaves Developers",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Delete.png");
		g.drawImage(i,0,0,this);
	}
}
class Show extends JPanel implements ActionListener
{
	JTextArea t1;
	JButton b1;
	
	Show()
	{
		setLayout(null);
	    
		t1=new JTextArea(10,10);
		t1.setSize(150,70);
		t1.setLocation(280,150);
		add(t1);
		
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(280,300);
        add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		String S1=t1.getText();
		String s2="";
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		
			String db_url="jdbc:mysql://localhost:3306/mydb?useSSL=false";
		
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			Statement st=con.createStatement();
		
			String q="select * from UserDetails";
			ResultSet rs =st.executeQuery(q);
			while(rs.next())
			{
					s2=""+rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getString(5);
					t1.setText(s2);
			}
			con.close();	
		}
		catch(Exception e1)
		{
			System.out.println(e1);		
		 }
	 }	

	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("show.png");
		g.drawImage(i,0,0,this);
	}
}