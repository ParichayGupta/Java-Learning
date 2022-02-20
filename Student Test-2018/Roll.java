import javax.swing.*;
import java.awt.*;
class Roll extends JPanel
{
	JLabel l1,l2,l3,l4,lf1,lf2,lf3,lf4;
	JButton b1,b2;
	Image i;
	Font f1=new Font("Arial Black",Font.BOLD,14);
	Font f2=new Font("Segoe UI",Font.BOLD,14);
  Roll(FDemo f)
  {
	  setLayout(null);
	  
	  
	  Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("roll2.jpg");
	  
	  
    l1=new JLabel("NAME");
	l1.setBounds(180,110,100,50);
	l1.setFont(f2);
    add(l1);
	
	l2=new JLabel("ROLL NO.");
	l2.setBounds(180,170,100,50);
	l2.setForeground(Color.red);
	l2.setFont(f1);
    add(l2);
	
	l3=new JLabel("SUBJECT");
	l3.setBounds(180,230,100,50);
	l3.setFont(f2);
    add(l3);
	
	l4=new JLabel("D-O-B");
	l4.setBounds(180,290,100,50);
	l4.setFont(f2);
    add(l4);
	
	lf1=new JLabel("");
	lf1.setBounds(350,110,100,50);
	lf1.setFont(f2);
	add(lf1);
	
	lf2=new JLabel("");
	lf2.setBounds(350,290,100,50);
	lf2.setFont(f2);
	add(lf2);
	
	lf3=new JLabel("");
	lf3.setBounds(350,230,100,50);
	lf3.setFont(f2);
	add(lf3);
	
	lf4=new JLabel("");
	lf4.setBounds(350,170,100,50);
	lf4.setForeground(Color.red);
	lf4.setFont(f1);
	add(lf4);
	
	
	b1=new JButton("Login");
	b1.setBounds(210,370,80,40);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Home");
	b2.setBounds(320,370,80,40);
	add(b2);
	b2.addActionListener(f);
	
  }
  public void paintComponent(Graphics g)
  {
	  g.drawImage(i,1,1,this);
	  g.drawRect(115,115,375,235);
	  g.drawLine(285,115,285,350);
	  g.drawLine(115,160,490,160);
	  g.drawLine(115,230,490,230);
	  g.drawLine(115,290,490,290);
  }
}