import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener 
{
	Container cn;
	CardLayout card;
	Home h;
	About ab;
	Login lg;
	Menu m;
	Register rg;
	FDemo()
	{
		cn=getContentPane();
		
		card=new CardLayout();
		setLayout(card);
		
		h=new Home(this);
		cn.add("Home",h);
		ab=new About(this);
		cn.add("About",ab);
		lg=new Login(this);
		cn.add("Login",lg);
		m=new Menu(this);
		cn.add("Menu",m);
		rg=new Register(this);
		cn.add("Register",rg);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		String s1=rg.t1.getText();
		String s2=rg.t2.getText();
		String s3=rg.t3.getText();
		String s4=rg.t4.getText();
		
		if(e.getSource()==h.b1)
		{
			card.show(cn,"Login");
		}
		if(e.getSource()==h.b2)
		{
			card.show(cn,"About");
		}
		if(e.getSource()==ab.b1)
		{
			card.show(cn,"Home");
		}
		if(e.getSource()==lg.b1)
		{
			card.show(cn,"Menu");
		}
		if(e.getSource()==lg.b2)
		{
			card.show(cn,"Register");
		}
		if(e.getSource()==lg.b3)
		{
			card.show(cn,"Home");
		}
		if(e.getSource()==rg.b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String db_url="jdbc:mysql://localhost:3306/newdb?useSSL=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				
				
				if(s1.length()==0 || s2.length()==0 || s3.length()==0 ||  s4.length()==0)
				{
					JOptionPane.showMessageDialog(rg.b1,"Please fill all the above fields");
				}
				else
				{
				String q="insert into NewUser values ('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
				st.executeUpdate(q);
				
				System.out.println("Registered"); 
				}
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		if(e.getSource()==rg.b2)
		{
			card.show(cn,"Login");
		}
	}
}

class Demo
{
	public static void main(String []ab)
	{
		int w=700,h=500,x=0,y=0;
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setTitle("Abcd");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		
	}
}