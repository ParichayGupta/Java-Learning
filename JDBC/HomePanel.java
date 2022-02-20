import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class HomePanel extends JPanel
{
	JButton b1;
	HomePanel(FDemo f)
	{
		setLayout(null);
		b1=new JButton("Login");
		b1.setBounds(300,300,85,35);
		add(b1);
		b1.addActionListener(f);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t= Toolkit.getDefaultToolkit();
		Image i=t.getImage("homepanel.png");
		g.drawImage(i,0,0,this);
	}
}