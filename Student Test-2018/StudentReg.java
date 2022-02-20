import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class StudentReg extends JPanel
{
	JLabel l1,l2,l3,l4,l5,l6,l7,lh;
	JTextField t1,t2;
	JPasswordField p1,p2;
	JComboBox cbb1,cbb2,cbb3,cbb4;
	JRadioButton rb1,rb2;
	ButtonGroup bg;
	JButton b1,b2;
	Image i;
	Color c;
	Border br5,br6;
	Font f1=new Font("Adobe Gothic Std B",Font.BOLD,16);
	Font f2=new Font("Arial",Font.ITALIC,14);
	Font f3=new Font("Arial",Font.BOLD,15);
 StudentReg(FDemo f)
 {
    setLayout(null);
	 c=new Color(72,255,118);
	
	setFont(f1);
	
	br5 = BorderFactory.createLineBorder(Color.RED,2);
	br6 = BorderFactory.createLineBorder(Color.WHITE,2);
	
	
	lh=new JLabel("STUDENT REGISTRATION");
	lh.setForeground(Color.white);
	lh.setBounds(220,40,350,40);
	add(lh);
	
	
	l1=new JLabel("Enter First Name");
	l1.setBounds(200,110,100,30);
	l1.setForeground(Color.white);
	add(l1);
	
	l7=new JLabel("Enter Last Name");
	l7.setBounds(200,160,100,30);
	l7.setForeground(Color.white);
	add(l7);
	
	l2=new JLabel("Enter Password");
	l2.setBounds(200,210,100,30);
	l2.setForeground(Color.white);
	add(l2);
	
	l3=new JLabel("Re-Enter Password");
	l3.setForeground(Color.white);
	l3.setBounds(200,260,130,30);
	add(l3);
	
	
	l5=new JLabel("Date Of Birth");
	l5.setBounds(200,310,100,30);
	l5.setForeground(Color.white);
	add(l5);
	
	l6=new JLabel("Choose Subject");
	l6.setBounds(200,360,100,30);
	l6.setForeground(Color.white);
	add(l6);
	
	
	t1=new JTextField();
	t1.setText("Enter FirstName.");
	t1.setFont(f2);
	t1.setBounds(330,110,160,30);
	add(t1);
	t1.addFocusListener(f);
	
	t2=new JTextField();
	t2.setBounds(330,160,160,30);
	t2.setText("Enter LastName.");
	t2.setFont(f2);
	add(t2);
	t2.addFocusListener(f);
	
	// String s1[]={"Select Subject","Java","C/C++"};
	String s1[]={"Select Subject"};
	cbb1=new JComboBox(s1);
	cbb1.setBackground(Color.black);
	cbb1.setForeground(Color.white);
	cbb1.setBounds(330,360,130,30);
	add(cbb1);
	
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
	
	
	
	String st3[]=new String[101];
	int y=1918;
	for(int i=0;i<=100;i++)
	{
		if(i==0)
		{
			st3[i]="Year";
		}
		else
		{
		y++;
		st3[i]=""+y;
			
		}
	}
	
	
	cbb2=new JComboBox(st);
	cbb2.setBounds(330,310,40,30);
	cbb2.setForeground(Color.white);
	cbb2.setBackground(Color.black);
	add(cbb2);
	
	cbb3=new JComboBox(st2);
	cbb3.setForeground(Color.white);
	cbb3.setBackground(Color.black);
	cbb3.setBounds(380,310,40,30);
	add(cbb3);
	
	cbb4=new JComboBox(st3);
	cbb4.setForeground(Color.white);
	cbb4.setBackground(Color.black);
	cbb4.setBounds(430,310,60,30);
	add(cbb4);
	
	bg=new ButtonGroup();
	
	rb1=new JRadioButton("Male",false);
	rb1.setBackground(Color.black);
	rb1.setForeground(Color.white);
	rb1.setBounds(250,410,60,15);
	bg.add(rb1);
	add(rb1);
	
	rb2=new JRadioButton("Female",false);
	rb2.setBackground(Color.black);
	rb2.setForeground(Color.white);
	rb2.setBounds(380,410,70,15);
	bg.add(rb2);
	add(rb2);
	
	p1=new JPasswordField();
	p1.setBounds(330,210,160,30);
	p1.setForeground(Color.black);
	add(p1);
	
	p2=new JPasswordField();
	p2.setForeground(Color.black);
	p2.setBounds(330,260,160,30);
	add(p2);
	
	
	b1=new JButton("Submit");
	b1.setBounds(225,450,100,45);
	b1.setBackground(c);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Cancel");
	b2.setBackground(c);
	b2.setBounds(365,450,100,45);
	add(b2);
	b2.addActionListener(f);
	
	Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("Backlog.jpg");
 }
 public void paintComponent(Graphics g)
 {
	 g.setColor(Color.white);
	 g.drawImage(i,1,1,this);
	 g.drawRect(145,20,400,500);
 }
}