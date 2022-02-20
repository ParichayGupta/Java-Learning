import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener
{
	Container cn;
	CardLayout card;
	HomeDemo hd;
	About ab;
	LoginDemo lg;
	Register rg;
	MenuDemo mg;
	FDemo()
	{
		cn=getContentPane();
		card=new CardLayout();
		setLayout(card);
		hd=new HomeDemo(this);
		cn.add("Home",hd);
		ab=new About(this);
		cn.add("About",ab);
		lg=new LoginDemo(this);
		cn.add("Login",lg);
		rg=new Register(this);
		cn.add("Register",rg);
		mg=new MenuDemo(this);
		cn.add("Menu",mg);
	}
	public void actionPerformed(ActionEvent e)
	{	String q=lg.t1.getText();
		String q1=lg.t2.getText();
	
	if(e.getSource()==lg.b1)
		{
		try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String db_url="jdbc:mysql://localhost:3306/Softwaves?useSSL=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				
				q="Select * from regis";
						
				ResultSet rs=st.executeQuery(q);
				rs.next();
				
				if(q1.equals(rs.getString()))
				{
					card.show(cn,"Menu");
				}
				else
				{
					JOptionPane.showMessageDialog(lg.b1,"Invalid UserName And Password");
				}
				
				con.close();
				}
				catch(Exception e1)
				{
					System.out.println(e1);
				}
	
		}
		if(e.getSource()==hd.b1)
		{
			card.show(cn,"Login");
		}
		if(e.getSource()==hd.b2)
		{
			card.show(cn,"About");
		}
		
		if(e.getSource()==ab.b1)
		{
			card.show(cn,"Home");
		}
		
		if(e.getSource()==lg.b2)
		{
			card.show(cn,"Register");
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
		int w=700,h=500,x,y;
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setTitle("TEST");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}