import javax.swing.*;
import java.awt.*;

class FDemo extends JFrame
{
	JPDemo jp;
	FDemo()
	{
		jp=new JPDemo();
		add(jp);
	}
}
class JPDemo extends JPanel
{
	ImageIcon img1,img2,img3;
	Image dot,head,food;
	JPDemo()
	{
		setBackground(Color.gray);
		img1=new ImageIcon("dot.png");
		dot=img1.getImage();	
		img2=new ImageIcon("head.png");
		head=img2.getImage();
		// img3=new ImageIcon("food.png");
		// food=img3.getImage();
	}
	public void paintComponent(Graphics g)
	{
			super.paintComponent(g);
			
			g.setColor(Color.white);
			g.drawRect(20,10,860,50);
			g.drawImage(dot,100,100,this);
			g.drawImage(head,120,100,this);
			// g.drawImage(food,100,100,this);
	}
}

class Demo
{
	public static void main(String args[])
	{
			FDemo f=new FDemo();
			f.setVisible(true);
			f.setBounds(100,20,900,700);
			f.setResizable(false);
			f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}