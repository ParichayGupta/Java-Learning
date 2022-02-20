import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 
class NewHome extends JPanel
{
	JButton b1;
	
	NewHome(Fdemo f)
	{	
		b1=new JButton("Login");
		b1.setSize(85,35);
		b1.setLocation(320,450);
		add(b1);
		
		
		b2=new JButton("About");
		b2.setSize(85,35);
		b2.setLocation(450,450);
		add(b2);
	}
}

class About extends JPanel
{
	About(FDemo f)
	{
		
	}
}