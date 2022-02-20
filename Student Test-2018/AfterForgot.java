import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
class AfterForgot extends JPanel
{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;
	Image i;
	Border br;
	Font f1=new Font("Arial Black",Font.BOLD,14);
	Font f2=new Font("Arial Black",Font.BOLD,12);
   AfterForgot(FDemo f)
   {
   
    setLayout(null);
	
	
	br=BorderFactory.createLineBorder(Color.cyan,2,true);
	
	Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("forgot3.png");
	
	l1=new JLabel("New Password:");
	l1.setBounds(220,167,200,40);
	l1.setForeground(Color.white);
	l1.setFont(f2);
	add(l1);
	
	t1=new JTextField();
	t1.setBounds(220,200,250,35);
	t1.setBorder(br);
	add(t1);
    
	l2=new JLabel("Re-enter Password:");
	l2.setForeground(Color.white);
	l2.setBounds(220,227,200,40);
	l2.setFont(f2);
	add(l2);
	
	t2=new JTextField();
	t2.setBounds(220,260,250,35);
	t2.setBorder(br);
	add(t2);
    
   b1=new JButton("Submit");
   b1.setBounds(220,320,250,40);
   b1.setFont(f1);
   b1.setBackground(Color.red);
   b1.setForeground(Color.white);
   add(b1);
   b1.addActionListener(f);
    
   b2=new JButton("Cancel");
   b2.setBounds(220,380,250,40);
   b2.setFont(f1);
   b2.setBackground(Color.gray);
   b2.setForeground(Color.white);
   add(b2);
   b2.addActionListener(f);
   
   
   
   }
   public void paintComponent(Graphics g)
   {
	   g.drawImage(i,1,1,this);
   }
}