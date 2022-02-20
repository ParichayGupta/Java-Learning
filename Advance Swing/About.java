import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class About extends JPanel
{
	JButton b1;
	About(FDemo f)
	{
		setLayout(null);
		
		// b1=new JButton("Login");
		// b1.setBounds(100,100,85,35);
		// add(b1);
		// b1.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("login.png");
		g.drawImage(i,0,0,this);
	}
	
}
