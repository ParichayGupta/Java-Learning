import javax.swing.*;
import java.awt.*;
class Question extends JPanel
{
	JLabel l1,l2,l3,l4,l5,l6;
	JRadioButton rb1,rb2,rb3,rb4;

	JButton b1,b2,b3;
	ButtonGroup bg;
	Image i;
	ImageIcon ic1,ic2,ic3;
	Color c1,c2;
	Font f1=new Font("Arial Black",Font.BOLD,14);
	Font f2=new Font("Arial Black",Font.PLAIN,12);
 Question(FDemo f)
 {
	 setLayout(null);
	 
	  bg=new ButtonGroup();
	Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("Question.jpg");

	c1=new Color(240,58,68); 
	c2=new Color(108,112,253); 
	 
    l1=new JLabel("");
	l1.setFont(f2);
	l1.setBounds(200,150,500,100);
	add(l1);
	 
    l2=new JLabel("");
	l2.setFont(f1);
	l2.setBounds(538,90,50,30);
	add(l2);
	 
    l3=new JLabel("");
	l3.setFont(f1);
	l3.setBounds(590,90,50,30);
	add(l3);
	 
	l4=new JLabel("");
	l4.setFont(f1);
	l4.setBounds(60,140,100,30);
	add(l4);
	
    l5=new JLabel("");
	l5.setFont(f1);
	l5.setBounds(50,90,100,30);
	add(l5);
	

	l6=new JLabel("");
	l6.setFont(new Font("calibri",Font.BOLD,18));
	l6.setBounds(550,145,100,30);
	add(l6);
	
	
	 String a1="A";
	 String a2="B";
	 String a3="C";
	 String a4="D";
	 
	 rb1=new JRadioButton(a1+"");
	 rb1.setFont(f2);
	 rb1.setBounds(230,235,200,15);
	 rb1.setBackground(Color.white);
	 bg.add(rb1);
	 
	 rb2=new JRadioButton("");
	 rb2.setFont(f2);
	 rb2.setBounds(230,265,200,15);
	 rb2.setBackground(Color.white);
	 bg.add(rb2);
	 
	 rb3=new JRadioButton("");
	 rb3.setFont(f2);
	 rb3.setBounds(230,295,200,15);
	 rb3.setBackground(Color.white);
	 bg.add(rb3);
	 
	 rb4=new JRadioButton("");
	 rb4.setBounds(230,325,200,15);
	 rb4.setFont(f2);
	 rb4.setBackground(Color.white);
	 bg.add(rb4);
	 
	 add(rb1);
	 add(rb2);
	 add(rb3);
	 add(rb4);
	
     rb1.addActionListener(f);
	 rb2.addActionListener(f);
	 rb3.addActionListener(f);
	 rb4.addActionListener(f);
	 
	b1=new JButton("Next");
	b1.setBounds(350,380,100,50);
	b1.setBackground(c1);
	b1.setForeground(Color.white);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Previous");
	b2.setBounds(200,380,100,50);
	add(b2);
	b2.setBackground(c1);
	b2.setForeground(Color.white);
	b2.addActionListener(f);
	
	b3=new JButton("Home");
	b3.setBounds(270,445,100,50);
	b3.setBackground(c2);
	b3.setForeground(Color.white);
	b3.setVisible(false);
	add(b3);
	b3.addActionListener(f);
 }
 public void paintComponent(Graphics g)
 {
	 g.drawImage(i,1,1,this);
 }
}