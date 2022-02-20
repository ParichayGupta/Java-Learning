import javax.swing.*;
import java.awt.*;
class AdForgot extends JPanel
{
	JLabel l1,l2,lh;
	JTextField t1,t2;
	JButton b1;
	JComboBox cbb2,cbb3,cbb4;
	Image i;
	Font f1=new Font("Segoe UI Emoji",Font.BOLD,12);
   AdForgot(FDemo f)
   {
    setLayout(null);

	Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("forgot.jpg");
	
	l1=new JLabel("Enter Name");
	l1.setBounds(150,200,100,40);
	l1.setForeground(Color.white);
	l1.setFont(f1);
	add(l1);
	
	l2=new JLabel("Enter DOB");
	l2.setBounds(320,200,100,40);
	l2.setForeground(Color.white);
	l2.setFont(f1);
	add(l2);
	
	t1=new JTextField();
	t1.setBounds(100,250,150,30);
	add(t1);
	
	
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
			
		st3[i]=""+y;
		y++;
		}
	}
	
	
	cbb2=new JComboBox(st);
	cbb2.setBounds(270,250,40,30);
	cbb2.setBackground(Color.black);
	cbb2.setForeground(Color.white);
	add(cbb2);
	
	
	cbb3=new JComboBox(st2);
	cbb3.setBounds(316,250,40,30);
	cbb3.setBackground(Color.black);
	cbb3.setForeground(Color.white);
	add(cbb3);
	
	cbb4=new JComboBox(st3);
	cbb4.setBounds(359,250,60,30);
	cbb4.setBackground(Color.black);
	cbb4.setForeground(Color.white);
	add(cbb4);
	
	b1=new JButton("Next");
	b1.setBounds(450,248,90,35);
	add(b1);
	b1.addActionListener(f);
	
   }
   public void paintComponent(Graphics g)
   {
	   g.drawImage(i,1,1,this);
   }
}