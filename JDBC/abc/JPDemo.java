import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class JPdemo extends JPanel implements ActionListener
{
	JButton b1,b2;
	JPdemo(FDemo f)
	{
		setLayout(new FlowLayout());
		b1=new JButton("Button 2");
		add("B",b1);
		b2=new JButton("Print");
		add("B2",b2);
		b1.addActionListener(f);
		b2.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		System.out.println("Softwaves");
	}
}