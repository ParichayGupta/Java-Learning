import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
class StLogin extends JPanel
{
	JLabel l1,l2,lh,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2,b3;
	Image i;
	ImageIcon ic1,ic2,ic3;
	Color c;
	Font f1=new Font("Arial",Font.ITALIC,14);
	Font f2=new Font("Arial",Font.BOLD,15);
    StLogin(FDemo f)
 {
    setLayout(null);
	
 Toolkit t=Toolkit.getDefaultToolkit();
 i=t.getImage("Backlog.jpg");
 
 c=new Color(72,255,118);
 
 ic3=new ImageIcon("Homeicon.jpg"); 
 
    lh=new JLabel("STUDENT");
	lh.setForeground(Color.white);
	lh.setBounds(280,80,200,40);
	add(lh);
	
	l1=new JLabel("RollNo:");
	l1.setForeground(Color.white);
	l1.setBounds(200,150,130,40);
	add(l1);
	
	l2=new JLabel("Password:");
	l2.setForeground(Color.white);
	l2.setBounds(200,210,130,40);
	add(l2);
	
	
	
	t1=new JTextField();
	t1.setText("Enter RollNo.");
	t1.setFont(f1);
	t1.setBounds(320,150,140,30);
	add(t1);
	t1.addFocusListener(f);
	
	p1=new JPasswordField();
	p1.setBounds(320,210,140,30);
	add(p1);
	p1.addFocusListener(f);
	p1.addActionListener(f);
	
	l3=new JLabel("<html><u>Forgot Password?</u></html>");
	l3.setForeground(Color.white);
	l3.setBounds(320,240,130,40);
	l3.setFont(f1);
	add(l3);
	l3.addMouseListener(f);
	
	
	
	
	b1=new JButton("Login");
	b1.setBorderPainted(false);
	b1.setFocusPainted(false);
	b1.setBounds(200,280,270,40);
	b1.setBackground(c);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Registration");
	b2.setBounds(200,330,270,40);
	b2.setBackground(c);
	add(b2);
	b2.addActionListener(f);
	
	b3=new JButton("",ic3);
	b3.setBounds(290,380,100,50);
	b3.setBorderPainted(false);
	b3.setFocusPainted(false);
	b3.setContentAreaFilled(false);
	b3.setBackground(c);
	add(b3);
	b3.addActionListener(f);
	
 }
 public void paintComponent(Graphics g)
 {
	 g.setColor(Color.white);
	 g.drawImage(i,1,1,this);
	 g.drawRect(160,50,350,400);
 }
}