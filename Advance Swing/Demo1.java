import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener
{
	JButton b1,b2,b3,b4;
	Container cn;
	JPdemo jp1;
	CardLayout card;
	FDemo()
	{
		cn = getContentPane();
		card = new CardLayout();
		setLayout(card);
		b1=new JButton("Button 1");
	    cn.add("A",b1);
		jp1=new JPdemo(this);
		cn.add(jp1);
		b3=new JButton("Button 3");
	    cn.add("C",b3);
		b4=new JButton("Button 4");
	    cn.add("D",b4);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		card.next(cn);
	}
}
class Demo1
{
	public static void main(String []ab)
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}