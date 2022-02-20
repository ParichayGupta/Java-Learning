import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener
{
    Container cn;
	HomePanel hp;
	LoginPanel lp;
	MenuPanel mp;
	Register rg;
	About ab;
	CardLayout card;
	FDemo()
	{  
		cn=getContentPane();
		card = new CardLayout();
		setLayout(card);
		hp=new HomePanel(this);
		cn.add("Home",hp);
		lp=new LoginPanel(this);
		cn.add("Login",lp);
		mp=new MenuPanel(this);
		cn.add("Menu",mp);
		rg=new Register(this);
		cn.add("Register",rg);
		ab=new About(this);
		cn.add("About",ab);
		
	}
	
	public void actionPerformed(ActionEvent e)
	{

		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
		
				String db_url="jdbc:mysql://Localhost:3306/mydb?useSSL=false";
				String db_uname="root";
				String db_upass="root";
		
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
		
				Statement st=con.createStatement();
		
				String UNAME="select UNAME from user";
				String UPASS="select UPASS from user";
				st.executeQuery(UNAME);
				st.executeQuery(UPASS);
		
				con.close();	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		 
		 
		if(e.getSource()==hp.b1)
		{
			card.next(cn);
		}	
		if(e.getSource()==lp.b1)
		{
			String s1=lp.tx1.getText();
			String s2=lp.tx2.getText();
			if(s1.equals("a") && s2.equals("123"))
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
		if(e.getSource()==lp.b2)
		{
			card.show(cn,"Register");
		}
		if(e.getSource()==rg.b2)
		{
			card.show(cn,"Login");
		}
		if(e.getSource()==hp.b2)
		{
			card.show(cn,"About");
		}
		if(e.getSource()==ab.b1)
		{
			card.show(cn,"Home");
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
		Image i=t.getImage("Google.png");
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setTitle("Softwaves Developers");
		f.setLocation(x,y);
		f.setIconImage(i);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		}
}