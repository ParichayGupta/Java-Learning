import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame implements ActionListener
{

	Container cn;
	HomePanel hp;
	LoginPanel lp;
	MenuPanel mp;
	CardLayout card;
	FDemo()
	{
		cn = getContentPane();
		card = new CardLayout();
		setLayout(card);
		hp=new HomePanel(this);
		cn.add("Home",hp);
		lp=new LoginPanel(this);
		cn.add("Login",lp);
		mp=new MenuPanel(this);
		cn.add(mp);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==hp.b1)
		{
			card.next(cn);
		}	
		if(e.getSource()==lp.b1)
		{
			String s1=lp.tx1.getText();
			String s2=lp.tx2.getText();
			if(s1.equals("abc") && s2.equals("123"))
			{
				card.next(cn);
			}
			else
			{
				//System.out.println("Invalid UserName And Password"); //Display in cmd
				//JOptionPane.showMessageDialoge(null,"Invalid UserName And Password"); // Display at the crnter of the screen 
				JOptionPane.showMessageDialog(lp.b1,"Invalid UserName And Password"); //Display at Submit Button
				lp.tx1.setText("");
				lp.tx2.setText("");
			}
		}
		
		
	}
}
class Demo2
{
	public static void main(String []ab)
	{
		FDemo f = new FDemo();
		f.setVisible(true);
		f.setSize(500,500);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}