import javax.swing.*;
import java.awt.*;
class AdLogin extends JPanel
{
	JLabel l1,l2,lh,l3;
	JTextField t1;
	JPasswordField p1;
	JButton b1,b2;
	Image i;
	ImageIcon ic1,ic2;
	Font f1=new Font("Adobe Gothic Std B",Font.BOLD,16);
	Font f2=new Font("Adobe Gothic Std B",Font.BOLD,22);
	Font f3=new Font("Arial",Font.ITALIC,14);
	Font f4=new Font("Arial",Font.BOLD,15);
	Color c;
 AdLogin(FDemo f)
 {
	 
    setLayout(null);
	
	ic1=new ImageIcon("back2.jpg");
	ic2=new ImageIcon("login.png");
	
	Toolkit t2=Toolkit.getDefaultToolkit();
	i=t2.getImage("Admin.jpg");
	

	
	
	setFont(f1);
	
	
	lh=new JLabel("ADMIN");
	lh.setBounds(290,80,100,40);
	add(lh);
	
	
	l1=new JLabel("Enter UserName");
	l1.setBounds(200,150,100,40);
	add(l1);
	
	l2=new JLabel("Enter Password");
	l2.setBounds(200,210,100,40);
	add(l2);
	
	l3=new JLabel("Forgot Password");
	l3.setBounds(290,330,100,40);
	add(l3);
	l3.addMouseListener(f);
	
	t1=new JTextField("Enter UserName.");
	t1.setFont(f3);
	t1.setBounds(300,150,130,40);
	add(t1);
	t1.addFocusListener(f);
	
	p1=new JPasswordField();
	p1.setBounds(300,210,130,40);
	add(p1);
	p1.addActionListener(f);
	
	b1=new JButton("",ic2);
	b1.setBounds(330,280,70,40);
	b1.setBackground(Color.cyan);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("",ic1);
	b2.setBounds(220,280,70,40);
	b2.setBackground(Color.cyan);
	add(b2);
	b2.addActionListener(f);
	
	Toolkit t=Toolkit.getDefaultToolkit();
	 t.getImage("Back1.jpg");
 }
 public void paintComponent(Graphics g)
 {
	 g.drawImage(i,1,1,this);
	 g.drawRect(150,50,350,400);
 }
}