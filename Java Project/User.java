import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class User extends JPanel implements ActionListener
{
	JTabbedPane tp;
	Examination ex;
	Update ud;
	ScoreCard sc;
	Home hp;
	JButton b1;
	JPanel p1,p2;
	JLabel l1,l2;
	
	User(FDemo f)
	{ 
		
		setLayout(null);
	
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		Font fo4=new Font("Microsoft Tai Le",Font.BOLD,25);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		ex=new Examination();
		ud=new Update();
		sc=new ScoreCard();
		hp=new Home(f,this);
		
		p1=new JPanel();
		p1.setLayout(null);
		p1.setBounds(0,0,800,100);
		p1.setBackground(Color.white);
		add(p1);
		
		l1=new JLabel("Welcome");
		l1.setBounds(30,30,120,40);
		l1.setForeground(b);
		l1.setFont(fo4);
		p1.add(l1);
		
		String s1=hp.t1.getText();		
		
		l2=new JLabel(s1);
		l2.setBounds(150,30,300,40);
		l2.setForeground(b);
		l2.setFont(fo4);
		p1.add(l2);
		
		b1=new JButton("Logout");
		b1.setBounds(650,40,85,25);
		b1.setBorderPainted(false);
		b1.setForeground(b);
		b1.setBorder(BorderFactory.createEmptyBorder());
		b1.setOpaque(true);
		b1.setContentAreaFilled(false);
		b1.setFont(fo4);
		p1.add(b1);
		b1.addActionListener(f);
		
		p2=new JPanel();
		p2.setBounds(0,110,800,700);
		add(p2);
		p2.setLayout(new BorderLayout());
		
		tp=new JTabbedPane();
		tp.setBackground(Color.black);
		tp.setFont(fo2);
		tp.addTab("Examination",ex);
		tp.addTab("Update Details",ud);
		tp.addTab("Score Card",sc);
		
		tp.setBorder(BorderFactory.createEmptyBorder());
		tp.setBackgroundAt(0,y);
		tp.setForegroundAt(0,Color.white);
		tp.setBackgroundAt(1,gr);
		tp.setForegroundAt(1,Color.white);
		tp.setBackgroundAt(2,r);
		tp.setForegroundAt(2,Color.white);
		p2.add(tp);
	}
	
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}

class Examination extends JPanel implements ActionListener
{
	Examination()
	{
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
	}
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}

class Update extends JPanel implements ActionListener
{
	Update()
	{
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
	}
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}

class ScoreCard extends JPanel implements ActionListener
{
	ScoreCard()
	{	
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
	}
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);		
	}
	public void actionPerformed(ActionEvent e)
	{
		
	}
}