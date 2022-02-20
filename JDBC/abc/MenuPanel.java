import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

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
class InsDemo extends JPanel
{
	JLabel u1,u2,u3,u4,u5;
	JTextField t1,t2,t3,t4,t5;
	JButton b1;
	InsDemo()
	{
		
		setLayout(null);
		
		u1=new JLabel("Enter Roll No.");
		u1.setSize(120,30);
		u1.setLocation(100,100);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(220,100);
		add(t1);
		
		u2=new JLabel("Enter Name");
		u2.setSize(120,30);
		u2.setLocation(100,150);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(150,30);
		t2.setLocation(220,150);
		add(t2);
		
		u3=new JLabel("Physics");
		u3.setSize(120,30);
		u3.setLocation(100,200);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(150,30);
		t3.setLocation(220,200);
		add(t3);
		
		u4=new JLabel("Chemistry");
		u4.setSize(120,30);
		u4.setLocation(100,250);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(150,30);
		t4.setLocation(220,250);
		add(t4);
		
		u5=new JLabel("Maths");
		u5.setSize(120,30);
		u5.setLocation(100,300);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(150,30);
		t5.setLocation(220,300);
		add(t5);
		
		b1=new JButton("Insert");
		b1.setSize(85,35);
		b1.setLocation(150,370);
		add(b1);
	}
}
class SearchDemo extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	SearchDemo()
	{
		setLayout(null);
		
		u1=new JLabel("Search");
		u1.setSize(120,30);
		u1.setLocation(100,100);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(120,30);
		t1.setLocation(220,100);
		add(t1);
		
		b1=new JButton("Search");
		b1.setSize(85,35);
		b1.setLocation(150,200);
		add(b1);
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
		
		u1=new JLabel("Update Roll no.");
		u1.setSize(120,30);
		u1.setLocation(100,100);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(220,100);
		add(t1);
		
		u2=new JLabel("Update Name");
		u2.setSize(120,30);
		u2.setLocation(100,150);
		add(u2);
		
		t2=new JTextField();
		t2.setSize(150,30);
		t2.setLocation(220,150);
		add(t2);
		
		u3=new JLabel("Update Physics");
		u3.setSize(120,30);
		u3.setLocation(100,200);
		add(u3);
		
		t3=new JTextField();
		t3.setSize(150,30);
		t3.setLocation(220,200);
		add(t3);
		
		u4=new JLabel("Update Chemistry");
		u4.setSize(120,30);
		u4.setLocation(100,250);
		add(u4);
		
		t4=new JTextField();
		t4.setSize(150,30);
		t4.setLocation(220,250);
		add(t4);
		
		u5=new JLabel("Update Maths");
		u5.setSize(120,30);
		u5.setLocation(100,300);
		add(u5);
		
		t5=new JTextField();
		t5.setSize(150,30);
		t5.setLocation(220,300);
		add(t5);
	
			
		b1=new JButton("Update");
		b1.setSize(85,35);
		b1.setLocation(150,380);
		add(b1);
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
		u1=new JLabel("Delete");
		u1.setSize(120,30);
		u1.setLocation(100,100);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(220,100);
		add(t1);
		
		b1=new JButton("Delete");
		b1.setSize(85,35);
		b1.setLocation(150,200);
		add(b1);
	}
}
class Show extends JPanel
{
	JLabel u1;
	JTextField t1;
	JButton b1;
	
	Show()
	{
		setLayout(null);
		
	    u1=new JLabel("Show");
		u1.setSize(120,30);
		u1.setLocation(100,100);
		add(u1);
		
		t1=new JTextField();
		t1.setSize(150,30);
		t1.setLocation(220,100);
		add(t1);
		
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(150,200);
        add(b1);
	}	
}