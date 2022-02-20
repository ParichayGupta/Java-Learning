import javax.swing.*;
import javax.swing.event.*;
import javax.swing.table.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class Admin extends JPanel 
{
	Instructions ins;
	Question que;
	User_Details ud;
	JTabbedPane tp;
	JPanel p1,p2;
	JLabel l1,l2;
	JButton b1;
	
	Admin(FDemo f)
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
		
		ins=new Instructions();
		que=new Question();
		ud=new User_Details();		
		
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
		
		l2=new JLabel();
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
		p2.setBounds(0,100,800,700);
		add(p2);
		p2.setLayout(new BorderLayout());
		
		tp=new JTabbedPane(tp.LEFT);
		tp.setFont(fo2);
		tp.setBackground(Color.black);
		tp.addTab("Instructions",ins);
		tp.addTab("Question",que);
		tp.addTab("User Details",ud);
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
}

class Instructions extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
	Instructions()
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
		
		l1=new JLabel("Instructions");
		l1.setBounds(225,25,150,40);
		l1.setForeground(y);
		l1.setFont(fo4);
		add(l1);
		
		String s1="Hey Admin, Welcome ...   You have to Conduct test for the users";                                          
		l2=new JLabel(s1);
		l2.setBounds(50,80,750,20);
		l2.setForeground(gr);
		l2.setFont(fo1);
		add(l2);
		
		String s2="You can Add Questions in these Simple Steps...";
		l3=new JLabel(s2);
		l3.setBounds(50,120,750,20);
		l3.setForeground(Color.black);
		l3.setFont(fo1);
		add(l3);
		
		String s3="Step 1-> Go to Add_Question tab.";
		l4=new JLabel(s3);
		l4.setBounds(50,140,750,20);
		l4.setForeground(Color.black);
		l4.setFont(fo1);
		add(l4);
		
		String s4="Step 2->Select the Subject in which you want to add Question.";
		l5=new JLabel(s4);
		l5.setBounds(50,160,750,20);
		l5.setForeground(Color.black);
		l5.setFont(fo1);
		add(l5);
		
		String s5="Step 3->Write the Question in the Question TextArea.";
		l6=new JLabel(s5);
		l6.setBounds(50,180,750,20);
		l6.setForeground(Color.black);
		l6.setFont(fo1);
		add(l6);
		
		String s6="Step 4-> Give the four Options to choose on of them";
		l7=new JLabel(s6);
		l7.setBounds(50,200,750,20);
		l7.setForeground(Color.black);
		l7.setFont(fo1);
		add(l7);
		
		String s7="Step 5-> Give the Correct option.";
		l8=new JLabel(s7);
		l8.setBounds(50,220,750,20);
		l8.setForeground(Color.black);
		l8.setFont(fo1);
		add(l8);
		
		String s8="NOTE:- The Correct Option must be from the four options ";
		l9=new JLabel(s8);
		l9.setBounds(50,240,750,20);
		l9.setForeground(r);
		l9.setFont(fo1);
		add(l9);
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
class Question extends JPanel implements ActionListener
{
	JTabbedPane tp;
	JComboBox cb1;
	Add_Ques aq;
	Del_Ques dq;
	JLabel l1,l2,l3,l4,l5;
	Question()
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
		
		String languages[]={"C","C++","Java","Aptitude"};        
        
		JComboBox cb1=new JComboBox(languages);    
        cb1.setBounds(50,100,90,20);
		add(cb1);
	
		
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
	
	class Add_Ques extends JPanel implements ActionListener
	{
		Add_Ques()
		{
			Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
			Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
			Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
			Font fo4=new Font("Microsoft Tai Le",Font.BOLD,25);
		
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
	class Del_Ques extends JPanel implements ActionListener
	{
		Del_Ques()
		{
			Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
			Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
			Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
			Font fo4=new Font("Microsoft Tai Le",Font.BOLD,25);
		
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
}
				
class User_Details extends JPanel implements ActionListener
{
	JTable table;
	User_Details()
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
	
		table=new JTable();
		table.setSize(200,200);
		table.setLocation(200,200);
		table.addColumn("User");
		table.addColumn("Aggrigate");
		table.addColumn("Overall");
		table.addColumn("User");
		add(table);
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
