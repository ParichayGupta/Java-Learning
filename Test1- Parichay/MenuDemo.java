import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class MenuDemo extends JPanel
{
	Insert in;
	Search sr;
	Update ud;
	Delete del;
	Show sw;
	JTabbedPane tp;
	
	MenuDemo(FDemo f)
	{
		setLayout(new BorderLayout());
		in=new Insert();
		sr=new Search();
		ud=new Update();
		del=new Delete();
		sw=new Show();
		
		tp=new JTabbedPane();
		tp.addTab("Insert",in);
		tp.addTab("Search",sr);
		tp.addTab("Update",ud);
		tp.addTab("Delete",del);
		tp.addTab("Show",sw);
		add(tp);
	}
	
}


class Insert extends JPanel
{
	JButton b1;
	Insert()
	{
		setLayout(null);
		b1=new JButton("Insert");
		b1.setSize(85,35);
		b1.setLocation(210,250);
		add(b1);
		
		
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Insert.png");
		g.drawImage(i,0,0,this);
	}
}

class Search extends JPanel
{
	JButton b1;
	Search()
	{
		setLayout(null);
		b1=new JButton("Search");
		b1.setSize(85,35);
		b1.setLocation(210,250);
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
	JButton b1;
	Update()
	{
		setLayout(null);
		b1=new JButton("Update");
		b1.setSize(85,35);
		b1.setLocation(210,250);
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
	JButton b1;
	Delete()
	{
		setLayout(null);
		b1=new JButton("Delete");
		b1.setSize(85,35);
		b1.setLocation(210,250);
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
	JButton b1;
	Show()
	{
		setLayout(null);
		b1=new JButton("Show");
		b1.setSize(85,35);
		b1.setLocation(210,250);
		add(b1);
		
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("Show.png");
		g.drawImage(i,0,0,this);
	}
}