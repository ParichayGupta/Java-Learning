import javax.swing.*;
import java.awt.*;
import javax.swing.border.*;
class Forroll extends JPanel
{
	JLabel l1;
	JTextField t1;
	JButton b1;
	Image i;
	Font f1=new Font("Segoe UI",Font.BOLD,14);
	Border br;
    Forroll(FDemo f)
	{
		setLayout(null);
		
		Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("roll1.jpg");
		
		br=BorderFactory.createLineBorder(Color.black,2,true);
		
	 l1=new JLabel("Enter Name");
	 l1.setBounds(180,180,100,50);
	 l1.setFont(f1);
	 l1.setForeground(Color.white);
	 add(l1);
	 
	 t1=new JTextField(20);
	 t1.setFont(f1);
	 t1.setBorder(br);
	 t1.setBounds(335,190,130,40);
	 add(t1);
	 // t1.addKeyListener(f);
	 t1.addActionListener(f);
	 
	 b1=new JButton("Show");
	 b1.setBounds(280,260,80,40);
	 add(b1);
	 b1.addActionListener(f);
	 
	 
	}
	public void paintComponent(Graphics g)
	{
		g.drawImage(i,1,1,this);
	}
}