import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MenuPanel extends JPanel
{
	JTabbedPane tb;
	InsDemo in;
	SearchDemo sr;
	Update ud;
	Delete del;
	Show sw;
	MenuPanel(FDemo f)
	{
		setLayout(new BorderLayout());
		
		in=new InsDemo();
		sr=new SearchDemo();
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
class InsDemo extends JPanel implements ActionListener
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	InsDemo()
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
		
		String db_url="jdbc:mysql=//localhost:3306/mydb?useSSL=false";
		
			String db_uname="root";
			String db_upass="root";
			
			Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
			
			Statement st=con.createStatement();
		
			String q="insert into UserDetails values('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"')";
			st.executeUpdate(q);
			
			System.out.println("Data Inserted");
			con.close();	
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}

}
class SearchDemo extends JPanel
{
	
	JTextField t1;
	JButton b1;
	SearchDemo()
	{
		setLayout(null);
		
		
		t1=new JTextField();
		t1.setSize(400,30);
		t1.setLocation(130,150);
		add(t1);
		
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(280,200);
        add(b1);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Search.png");
		g.drawImage(i,0,0,this);
	}
}
class Update extends JPanel
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	
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

	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Update.png");
		g.drawImage(i,0,0,this);
	}
}
class Delete extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	
	Delete()
	{
		setLayout(null);
	
		t1=new JTextField();
		t1.setSize(400,30);
		t1.setLocation(150,150);
		add(t1);
		
		b1=new JButton("Delete");
		b1.setSize(85,35);
		b1.setLocation(280,200);
		add(b1);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Delete.png");
		g.drawImage(i,0,0,this);
	}
}
class Show extends JPanel
{
	JTextField t1;
	JButton b1;
	
	Show()
	{
		setLayout(null);
		
	    t1=new JTextField();
		t1.setSize(400,30);
		t1.setLocation(130,150);
		add(t1);
		
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(280,200);
        add(b1);
	}
	
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("show.png");
		g.drawImage(i,0,0,this);
	}
}