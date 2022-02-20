import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener 
{
	Container cn;
	CardLayout card;
	NewHome nh;
	About ab;
	FDemo()
	{
		cn=getContentPane();
		
		card=new CardLayout();
		setLayout(card);
		
		nh=new NewHome(this);
		cn.add("home",nh);
		ab=new About(this);
		cn.add("About",ab);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==nh.b1)
		{
			card.show("");
		}
	}
}
class Demo5
{
	public static void main(String []ab)
	{
		int w=700,h=500,x=0,y=0;
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setTitle("Abcd");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
}