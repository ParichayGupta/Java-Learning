import javax.swing.*;

class HomePanel extends JPanel
{
	JButton b1;
	HomePanel(FDemo f)
	{
		
		b1=new JButton("Login");
		add(b1);
		b1.addActionListener(f);

	}
}