import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.util.*;
class StLogin1 extends JPanel
{
	JTabbedPane tb;
	Participate pr;
	Status st;
	DemoRoll dr;
 StLogin1(FDemo f)
 {
	 BorderLayout br=new BorderLayout();
	 setLayout(br);
	
	 
	 tb=new JTabbedPane();
	 
	 st=new Status(f);
	 tb.addTab("Status",st);
	 
	 pr=new Participate(f);
	 tb.addTab("Participate",pr);
	 
	 dr=new DemoRoll(f);
	 tb.addTab("My Account",dr);
	 
	 
	 add(tb);
	 tb.addChangeListener(f);
 }
}

class Status extends JPanel
{
	int bx=150;
	JButton b1;
	JLabel l1,l2,l3,l4;
	Image i;
	Font ft=new Font("Tahoma",Font.BOLD,17);
	Font ft2=new Font("Tahoma",Font.BOLD,14);
	Font ft3=new Font("Calibri",Font.PLAIN,16);
	Font ft4=new Font("Lucida Sans",Font.PLAIN,16);
	Font ft5=new Font("Tahoma",Font.BOLD,14);
	Status(FDemo f)
	{
		setLayout(null);
		
		b1=new JButton("home");
		b1.setBounds(270,bx,100,50);
		add(b1);
		b1.addActionListener(f);
		
		l1=new JLabel("Name:-");
		l1.setBounds(50,10,200,20);
		l1.setFont(ft2);
		add(l1);
		
		l3=new JLabel();
		l3.setBounds(110,10,200,20);
		l3.setFont(ft5);
		l3.setForeground(Color.blue);
		add(l3);
		
		l2=new JLabel("Roll No:-");
		l2.setBounds(400,10,100,20);
		l2.setFont(ft2);
		add(l2);
		
		l4=new JLabel();
		l4.setBounds(460,10,100,20);
		l4.setFont(ft5);
		l4.setForeground(Color.blue);
		add(l4);
		
		
	}
	
		
	boolean b=false;
	boolean c=false;
	int ini=0;
	int x=50;
	int y=100;
	int j=120;
	int t=120;
	int t1=120;
	int t2=120;
	int t3=120;
	int t4=120;
	int t5=120;
	int t6=120;
	int t7=120;
	int t8=120;
	int exist=0;
	int ds1=20;
	int ds2=110;
	int ds3=170;
	int ds4=230;
	int ds5=270;
	int ds6=315;
	int ds7=410;
	int ds8=490;
	int ds9=580;
	String temp="Your Status Will Appear Here..";
	String sa="Subject";
	String sa2="Attend";
	String sa3="Wrong";
	String sa4="Mark";
	String sa5="Total";
	String sa6="Duration";
	String sa7="Accuracy";
	String sa8="Date";
	String sa9="Time";
	
	ArrayList al1=new ArrayList();
	ArrayList al2=new ArrayList();
	ArrayList al3=new ArrayList();
	ArrayList al4=new ArrayList();
	ArrayList al5=new ArrayList();
	ArrayList al6=new ArrayList();
	ArrayList al7=new ArrayList();
	ArrayList al8=new ArrayList();
	ArrayList al9=new ArrayList();
	
	public void paintComponent(Graphics g)
	{
		g.setFont(ft3);
		if(exist==0)
		{
			g.setFont(ft4);
			g.drawString(temp,250,250);
		}
		else
		{
			
		}
		if(b)
		{
			for(int i=100;i<=x;i+=50)
			{
		     g.drawRect(10,i,650,50);
			 g.drawLine(80,50,80,y);
			g.drawLine(150,50,150,y);
			g.drawLine(210,50,210,y);
			g.drawLine(260,50,260,y);
			g.drawLine(310,50,310,y);
			g.drawLine(400,50,400,y);
			g.drawLine(485,50,485,y);
			g.drawLine(570,50,570,y);
			}
			
				
			for(Object i:al1)
			{
			g.drawString(""+i,ds1,t);
			t+=50;
			}
			for(Object i:al2)
			{
			g.drawString(""+i,ds2,t1);
			t1+=50;
			}
		   for(Object i:al3)
		   {
			g.drawString(""+i,ds3,t2);
			t2+=50;
		   }
		   for(Object i:al4)
		   {
			g.drawString(""+i,ds4,t3);   
		   t3+=50;
		   }
		   for(Object i:al5)
		   {
			g.drawString(""+i,ds5,t4);
		   t4+=50;
		   }
		   for(Object i:al6)
		   {
			   
			g.drawString(""+i,ds6,t5);
		   t5+=50;
		   }
		   for(Object i:al7)
		   {
			   
			g.drawString(""+i,ds7,t6);
		   t6+=50;
		   }
		   for(Object i:al8)
		   {
			g.drawString(""+i,ds8,t7);
			   
		   t7+=50;
		   }
		   for(Object i:al9)
		   {
			g.drawString(""+i,ds9,t8);
			   
		   t8+=50;
		   }
			
			
			/**********Header***********/
			
			
			
			g.setFont(ft);
			g.drawRect(10,50,650,50);
			g.drawString(sa,15,80);
			g.drawString(sa2,85,80);
			g.drawString(sa3,150,80);
			g.drawString(sa4,213,80);
			g.drawString(sa5,263,80);
			g.drawString(sa6,320,80);
			g.drawString(sa7,405,80);
			g.drawString(sa8,500,80);
			g.drawString(sa9,590,80);
			
			g.setFont(ft2);
			g.drawLine(80,50,80,100);
			g.drawLine(150,50,150,100);
			g.drawLine(210,50,210,100);
			g.drawLine(260,50,260,100);
			g.drawLine(310,50,310,100);
			g.drawLine(400,50,400,100);
			g.drawLine(485,50,485,100);
			g.drawLine(570,50,570,100);
		
			
	    }
		
	}
	
}
class Participate extends JPanel
{
	JButton b1;
	JComboBox cbb1;
	JLabel l1;
	Image i;
	Color c;
	Font f1=new Font("Arial Rounded MT Bold",Font.BOLD,72);
	Participate(FDemo f)
	{
		setLayout(null);
		 c=new Color(128,128,255);
		
		Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("Participate.jpg");
		
		b1=new JButton("Start");
		b1.setBounds(290,280,100,40);
		b1.setBackground(c);
		b1.setForeground(Color.white);
		add(b1);
		b1.addActionListener(f);
		
		l1=new JLabel("");
		l1.setBounds(285,230,194,30);
		l1.setForeground(Color.red);
		add(l1);
		
		String s1[]={"Select Subject"};
		cbb1=new JComboBox(s1);
		cbb1.setBounds(280,200,130,40);
		cbb1.setBackground(c);
		cbb1.setForeground(Color.white);
		add(cbb1);
		cbb1.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(i,-1,-1,this);
		g.drawLine(470,100,570,100);
		g.drawLine(570,100,570,450);
		g.drawLine(120,100,220,100);
		g.drawLine(120,100,120,450);
		g.drawLine(120,450,570,450);
	}
}


class DemoRoll extends JPanel
{
	JLabel l1,l2,l3,l4,l6,l5,l7,lf1,lf2;
	JLabel l8,l9,l10,l11,l12,l13;
	JTextField lf3,lf4,lf5,lf6,lf7;
	JButton b1,b3;
	Border br;
	JPanel jp1,jp2,jp3,jp4,jp5,jp6;
	ImageIcon i;
	Color c1=new Color(63,72,204);
	Color c2=new Color(195,195,195);
	Font f1=new Font("Arial Black",Font.BOLD,14);
	Font f2=new Font("Segoe UI",Font.BOLD,14);
	Font f3=new Font("Segoe UI",Font.ITALIC,14);
	Font ft1=new Font("Lucida Sans",Font.BOLD,16);
	
  DemoRoll(FDemo f)
  {
	  setLayout(null);
	  i=new ImageIcon("AdminPhoto.png");
	  
	  jp1=new JPanel();
	  jp1.setBounds(0,0,1200,70);
	  jp1.setBackground(c1);
	  jp1.setForeground(Color.BLACK);
	  jp1.setLayout(null);
	  add(jp1);
	  
	  l8=new JLabel();
	  l8.setIcon(i);
	  l8.setBounds(10,8,50,45);
	  jp1.add(l8);
	  
	  l9=new JLabel("");
	  l9.setBounds(65,12,150,20);
	  l9.setFont(ft1);
	  
	  
	  l10=new JLabel("");
	  l10.setBounds(70,30,150,25);
	  l10.setFont(ft1);
	  
	  
	  jp2=new JPanel();
	  jp2.setBounds(0,71,190,500);
	  jp2.setBackground(c2);
	  jp2.setLayout(null);
	  add(jp2);
	  
	  jp3=new JPanel();
	  jp3.setBounds(2,5,182,40);
	  jp3.setBackground(Color.WHITE);
	  jp3.setForeground(Color.BLACK);
	  jp3.setLayout(null);
	  jp2.add(jp3);
	  jp3.addMouseListener(f);
	  
	  
	  
	  jp4=new JPanel();
	  jp4.setBounds(2,50,182,40);
	  jp4.setBackground(Color.WHITE);
	  jp4.setLayout(null);
	  jp2.add(jp4);
	  jp4.addMouseListener(f);
	  
	  jp5=new JPanel();
	  jp5.setBounds(2,95,182,40);
	  jp5.setBackground(Color.WHITE);
	  jp5.setLayout(null);
	  jp2.add(jp5);
	  jp5.addMouseListener(f);
	  
	  
	  l11=new JLabel("Profile >");
	  l11.setBounds(10,10,150,25);
	  l11.setFont(ft1);
	  jp3.add(l11);
	  
	  l12=new JLabel("Setting >");
	  l12.setBounds(10,10,150,25);
	  l12.setFont(ft1);
	  jp4.add(l12);
	  
	  l13=new JLabel("LogOut");
	  l13.setBounds(10,10,150,25);
	  l13.setFont(ft1);
	  jp5.add(l13);
	  
	    jp6=new JPanel();
		jp6.setLayout(null);
		jp6.setBounds(190,70,500,500);
		jp6.setBackground(Color.WHITE);
		add(jp6);
	  
	l4=new JLabel("");
	l4.setBounds(50,50,100,50);
	l4.setFont(f2);
					
	
	lf4=new JTextField();
	lf4.setBounds(50,90,200,30);
	lf4.setEditable(false);
	lf4.setFont(f3);
	
	l5=new JLabel("");
	l5.setBounds(50,130,100,50);
	l5.setFont(f2);
					
	
	
	lf5=new JTextField();
	lf5.setBounds(50,170,200,30);
	lf5.setEditable(false);
	lf5.setFont(f3);
	
	
	
	l6=new JLabel("");
	l6.setBounds(50,200,100,50);
	l6.setFont(f2);
					
	
	
	lf6=new JTextField();
	lf6.setBounds(50,240,200,30);
	lf6.setEditable(false);
	lf6.setFont(f3);
	
	l7=new JLabel("");
	l7.setBounds(50,270,100,50);
	l7.setFont(f2);
	
	
	lf7=new JTextField();
	lf7.setBounds(50,310,420,30);
	lf7.setEditable(false);
	lf7.setFont(f3);

	b1=new JButton("Save");
	b1.setBounds(50,350,80,40);
	b1.addActionListener(f);
	
	
	b3=new JButton("Edit");
	b3.setBounds(250,350,80,40);
	b3.addActionListener(f);
	  
   
	
	
	
  }
}
