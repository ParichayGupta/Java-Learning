import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener
{
	JButton b1;
	Container cn;
	
	FDemo()
	{
		cn = getContentPane();
		setLayout(new FlowLayout());
		
		b1=new JButton("Click");
	    cn.add(b1);
		b1.addActionListener(this);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		cn.setBackground(Color.blue);
	}
}
class Demo
{
	public static void main(String []ab)
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}