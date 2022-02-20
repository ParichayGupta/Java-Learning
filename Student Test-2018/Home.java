import javax.swing.*;
import java.awt.*;
class Home extends JPanel
{
	JLabel l1;
	JButton b1,b2,b3;
	Image i,i2;
	ImageIcon ic1,ic2,ic3;
	Font f1=new Font("Constantia",Font.BOLD,26);
	Font f2=new Font("Segoe UI Black",Font.BOLD,16);
	Color c,c1,c2;
 Home(FDemo f)
   {
	   setLayout(null);
	   c=new Color(113,0,17);
	   c1=new Color(153,217,234);
	   
	   Toolkit t4=Toolkit.getDefaultToolkit();
	   
	   ImageIcon ic=new ImageIcon();
	   i=t4.getImage("sirt.png");
	  
	ic1=new ImageIcon("user.png");
	ic2=new ImageIcon("home.png");   
	ic3=new ImageIcon("adicon.png");   
	   
    l1=new JLabel("Student Test-2018");
	l1.setForeground(c);
	l1.setFont(f1);
	l1.setBounds(225,-15,300,100);
	add(l1);
	
	
	b1=new JButton("Admin",ic3);
	b1.setFont(f2);
	b1.setBounds(70,420,140,50);
	b1.setBackground(Color.WHITE);
	b1.setForeground(Color.red);
	b1.setVerticalTextPosition(SwingConstants.CENTER);
    b1.setHorizontalTextPosition(SwingConstants.LEFT);
	b1.setBorder(BorderFactory.createEmptyBorder(10,1,1,1));
	add(b1);
	b1.addActionListener(f);
	b1.addMouseListener(f);
	
	b2=new JButton("Login",ic1);
	b2.setBounds(270,420,140,50);
	b2.setFont(f2);
	b2.setBackground(Color.WHITE);
	b2.setForeground(Color.red);
	b2.setVerticalTextPosition(SwingConstants.CENTER);
    b2.setHorizontalTextPosition(SwingConstants.LEFT);
	b2.setBorder(BorderFactory.createEmptyBorder(10,1,1,1));
	add(b2);
	b2.addActionListener(f);
	b2.addMouseListener(f);
	
	b3=new JButton("Get RollNo.");
	b3.setBounds(470,420,140,50);
	b3.setFont(f2);
	b3.setBackground(Color.WHITE);
	b3.setForeground(Color.red);
	b3.setVerticalTextPosition(SwingConstants.CENTER);
    b3.setHorizontalTextPosition(SwingConstants.LEFT);
	b3.setBorder(BorderFactory.createEmptyBorder(10,1,1,1));
	add(b3);
	b3.addActionListener(f);
	b3.addMouseListener(f);
   }
   public void paintComponent(Graphics g)
   {
	   g.drawImage(i,0,0,this);
   }
}