import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame
{
	JDemo j;
	FDemo()
	{
		j=new JDemo();
		add(j);
		
	}
}
class JDemo extends JPanel
{
	JButton b1;
	JDemo()
	{
		setLayout(null);
		b1=new JButton("Button");
		b1.setBounds(100,100,85,35);
		add(b1);
	}
	public void paintComponent(Graphics g)
	{
		Toolkit t=Toolkit.getDefaultToolkit();
		Image i=t.getImage("Background.png");
		g.drawImage(i,0,0,this);
	}
}
class Demo
{
	public static void main(String []args)	
	{
		int x=0,y=0,w=1000,h=568;
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);	
	}
}