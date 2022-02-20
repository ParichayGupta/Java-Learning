import java.awt.*;
import javax.swing.*;
class PDemo extends JPanel
{
	PDemo()
	{
		
	}
		boolean b=false;
	public void paintComponent(Graphics g)
	{
		if(b)
		{
		int x=85;
		 int y=80;
		 int w1=5;
		 int h1=5;
			for(int i=1;i<=70;i++)
			 {
			 try
			 {
				 Thread.sleep(30);
			 }
			 catch(Exception e)
			 {
				 
			 }
				 g.fillRect(x,y,w1,h1);			 
			 
		 h1=h1+5; 
			 } 
			 	
		}
		
	}

}