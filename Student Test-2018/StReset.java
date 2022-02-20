import javax.swing.border.*;
import javax.swing.*;
import java.awt.*;
class StReset extends JPanel
{
	JLabel l1,l2,ln,ln2;
	JTextField t1,t2;
	JButton b1,b2;
	Image i;
	Border br;
	Font f1=new Font("Arial Black",Font.BOLD,14);
	Font f2=new Font("Arial Black",Font.BOLD,12);
	Color c=new Color(34,177,76);
   StReset(FDemo f)
   {
   
    setLayout(null);
	
	
	br=BorderFactory.createLineBorder(c,2,true);
	
	Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("forgot4.png");
	
	ln=new JLabel("Dear");
	ln.setBounds(170,120,80,40);
	ln.setForeground(Color.white);
	add(ln);
	
	ln2=new JLabel("");
	ln2.setBounds(220,120,150,40);
	ln2.setForeground(c);
	add(ln2);
	
	
	
	
	l1=new JLabel("New Password:");
	l1.setBounds(150,167,200,40);
	l1.setForeground(Color.white);
	l1.setFont(f2);
	add(l1);
	
	t1=new JTextField();
	t1.setBounds(300,167,220,35);
	t1.setBorder(br);
	t1.setFont(f1);
	add(t1);
    
	l2=new JLabel("Confirm Password:-");
	l2.setForeground(Color.white);
	l2.setBounds(150,227,200,40);
	l2.setFont(f2);
	add(l2);
	
	t2=new JTextField();
	t2.setBounds(300,227,220,35);
	t2.setBorder(br);
	t2.setFont(f1);
	add(t2);
    
   b1=new JButton("Save&Login");
   b1.setBounds(220,320,250,40);
   b1.setFont(f1);
   b1.setBackground(c);
   b1.setForeground(Color.white);
   add(b1);
   b1.addActionListener(f);
    
   
   
   
   }
   public void paintComponent(Graphics g)
   {
	   g.drawImage(i,1,1,this);
   }
}