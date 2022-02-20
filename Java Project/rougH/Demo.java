import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame
{
	JPanel jp1,jp2;
	FDemo()
	{
		jp1=new JPanel();
		jp1.setBounds(0,0,700,100);
		jp1.setBackground(Color.red);
		add(jp1);
		jp2=new JPanel();
		jp2.setBounds(0,100,700,700);
		jp2.setBackground(Color.blue);
		add(jp2);
	}
}
class Demo 
{
	public static void main(String ab[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(700,700);
		f.setLocation(100,100);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
} 