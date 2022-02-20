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
		cn.add("Menu",mp);
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
			if(s1.equals("Parichay") && s2.equals("123"))
			{
				card.next(cn);
			}
			else
			{
				JOptionPane.showMessageDialog(lp.b1,"Invalid UserName And Password");
				lp.tx1.setText("");
				lp.tx2.setText("");
			}
		}	
	}
}
	
class Demo4
{
	public static void main(String []ab)
	{
		int w=700;
		int h=500;
		int x=0;
		int y=0;
		
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		Image i=t.getImage("icon.png");
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setTitle("Softwaves Developers");
		Font f1=new Font("Microsoft Sans Serif",Font.ITALIC,(20));
		f.setFont(f1);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setIconImage(i);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}