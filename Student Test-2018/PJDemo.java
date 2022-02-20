import java.awt.*;
import javax.swing.*;
class PJDemo extends JPanel
{
JButton b1;
	PJDemo(FDemo f)
	{
	   setLayout(new FlowLayout());
		b1=new JButton("click");
		add(b1);
		b1.addActionListener(f);
	}

}