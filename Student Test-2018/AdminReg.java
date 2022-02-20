import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class AdminReg extends JPanel
{
	JLabel l1,l2,l3,l4,l5,l6,lh;
	JTextField t1,t2;
	JPasswordField p1,p2;
	JComboBox cbb1,cbb2,cbb3,cbb4;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JButton b1,b2;
	Image i;
	Border br,br1,br2,br3,br4,br5,br6;
	Font f1=new Font("Adobe Gothic Std B",Font.BOLD,16);
    Font f2=new Font("Arial",Font.ITALIC,14);
	Font f3=new Font("Arial",Font.BOLD,15);
 AdminReg(FDemo f)
 {
    setLayout(null);
	
	setFont(f1);
	br = BorderFactory.createEtchedBorder(EtchedBorder.RAISED);
	br1 = BorderFactory.createEtchedBorder(EtchedBorder.LOWERED);
	br2=BorderFactory.createRaisedBevelBorder();
	br3=BorderFactory.createLoweredBevelBorder();
	br4 = BorderFactory.createEmptyBorder();
	br5 = BorderFactory.createLineBorder(Color.RED,2);
	br6 = BorderFactory.createLineBorder(Color.WHITE,2);
	
	Color c=new Color(0,0,0);
	Color c2=new Color(179,232,255);
	
	Toolkit t5=Toolkit.getDefaultToolkit();
	i=t5.getImage("Admin.jpg");
	
	lh=new JLabel("ADMIN REGISTRATION");
	lh.setForeground(Color.black);
	lh.setBounds(200,80,350,40);
	add(lh);
	
	
	l1=new JLabel("Enter FullName");
	l1.setBounds(150,150,100,30);
	add(l1);
	
	l2=new JLabel("Enter Password");
	l2.setBounds(150,200,100,30);
	add(l2);
	
	l3=new JLabel("Re-Enter Password");
	l3.setBounds(150,250,130,30);
	add(l3);
	
	
	l5=new JLabel("Date Of Birth");
	l5.setBounds(150,300,100,30);
	add(l5);
	
	l6=new JLabel("Choose Subject");
	l6.setBounds(150,350,100,30);
	add(l6);
	
	
	t1=new JTextField();
	t1.setText("Enter FullName.");
	t1.setBorder(br1);
	t1.setFont(f2);
	t1.setBounds(280,150,200,30);
	add(t1);
	t1.addFocusListener(f);
	
	String s1[]={"Select Subject"};
	cbb1=new JComboBox(s1);
	cbb1.setBounds(280,350,170,30);
	add(cbb1);
	cbb1.setBackground(c);
	cbb1.setForeground(Color.white);
	
	String st2[]=new String[13];
	int m=1;
	for(int i=0;i<=12;i++)
	{
		if(i==0)
		{
			
		st2[i]="M";
		}
		else
		{
			
		st2[i]=""+m;
		m++;
		}
	}
	
	String st[]=new String[32];
	int s=1;
	for(int i=0;i<=31;i++)
	{
		if(i==0)
		{
			
		st[i]="D";
		}
		else
		{
			
		st[i]=""+s;
		s++;
		}
	}
	
	
	
	String st3[]=new String[102];
	int y=1918;
	for(int i=0;i<=101;i++)
	{
		if(i==0)
		{
			
		st3[i]="Year";
		}
		else
		{
			
		st3[i]=""+y;
		y++;
		}
	}
	
	
	cbb2=new JComboBox(st);
	cbb2.setBounds(280,300,50,30);
	add(cbb2);
	cbb2.setBackground(c);
	cbb2.setForeground(Color.white);
	
	
	cbb3=new JComboBox(st2);
	cbb3.setBounds(340,300,50,30);
	add(cbb3);
	cbb3.setBackground(c);
	cbb3.setForeground(Color.white);
	
	cbb4=new JComboBox(st3);
	cbb4.setBounds(390,300,70,30);
	cbb4.setBackground(c);
	cbb4.setForeground(Color.white);
	add(cbb4);
	
	bg=new ButtonGroup();
	
	rb1=new JRadioButton("Male",false);
	rb1.setBounds(220,400,80,15);
	bg.add(rb1);
	add(rb1);
	rb1.setBackground(c2);
	rb1.setForeground(Color.black);
	
	rb2=new JRadioButton("Female",false);
	rb2.setBounds(350,400,90,15);
	bg.add(rb2);
	add(rb2);
	rb2.setBackground(c2);
	rb2.setForeground(Color.black);
	
	p1=new JPasswordField();
	p1.setBorder(br2);
	p1.setBounds(280,200,200,30);
	add(p1);
	
	p2=new JPasswordField();
	p2.setBounds(280,250,200,30);
	p2.setBorder(br2);
	add(p2);
	
	
	b1=new JButton("Submit");
	b1.setBounds(350,450,100,50);
	add(b1);
	b1.setBackground(Color.black);
	b1.setForeground(Color.white);
	b1.addActionListener(f);
	
	b2=new JButton("Cancel");
	b2.setBounds(220,450,100,50);
	b2.setBackground(Color.black);
	b2.setForeground(Color.white);
	add(b2);
	b2.addActionListener(f);
	
 }
 public void paintComponent(Graphics g)
 {
	 g.drawImage(i,0,0,this);
	 g.drawRect(130,50,400,500);
 }
}