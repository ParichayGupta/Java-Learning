import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

class FDemo extends JFrame implements ActionListener
{
	Container cn;
	CardLayout card;
	Home hp;
	About ab;
	Register rg;
	Admin ap;
	User up;
	
	FDemo()
	{
		cn=getContentPane();
		
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		card=new CardLayout();
		setLayout(card);
		
		hp=new Home(this,up);
		cn.add("Home",hp);
		ab=new About(this);
		cn.add("About",ab);	
		rg=new Register(this);
		cn.add("Register",rg);
		ap=new Admin(this);
		cn.add("AdminPanel",ap);
		up=new User(this);
		cn.add("UserPanel",up);
	}
	
	public void actionPerformed(ActionEvent e)
	{
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		String s1=hp.t1.getText();
		String s2=hp.t2.getText();
		String s3="Admin";
		String s4=hp.t1.getText();
		
		if(e.getSource()==hp.b1)
		{
			 try
			 {
				 Class.forName("com.mysql.cj.jdbc.Driver");
				 
				 String db_url="jdbc:mysql://localhost:3306/Project?useSSL=false";
				 String db_uname="root";
				 String db_upass="root";
				 
				 Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				 
				 Statement st=con.createStatement();
				 
				 s1="select * from user where UNAME='"+s1+"'";
				 
				 ResultSet rs=st.executeQuery(s1);
				 
				 while(rs.next())
				 {
					if(s2.equals(rs.getString(2)))
					{
						s4=rs.getString(1);
						
						if(s4.equals(s3))
						{
							card.show(cn,"AdminPanel");
							ap.l2.setText(rs.getString(1));
						}
						else
						{
							card.show(cn,"UserPanel");
							up.l2.setText(rs.getString(1));
						}
					}
					else
					{
						JOptionPane.showMessageDialog(hp.b1,"Invalid UserName or Password");
						hp.t1.setText("");
						hp.t2.setText("");
					}
				}	
				hp.t1.setText("");
				hp.t2.setText("");	
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
		if(e.getSource()==hp.b2)
		{
			card.show(cn,"About");
		}
		if(e.getSource()==hp.b3)
		{
			card.show(cn,"Register");
		}
		if(e.getSource()==rg.b2)
		{
			card.show(cn,"Home");
		}
		if(e.getSource()==ab.b1)
		{
			card.show(cn,"Home");
		}	
		if(e.getSource()==ap.b1)
		{
			int a=JOptionPane.showConfirmDialog(ap.b1,"Are You Sure? \nYou want to Logout.");
			if(a==JOptionPane.YES_OPTION)
			{
				card.show(cn,"Home");
			}
		}
		if(e.getSource()==up.b1)
		{
			int c=JOptionPane.showConfirmDialog(up.b1,"Are you Sure? \nYou want to Logout");
			
			if(c==JOptionPane.YES_OPTION)
			{
				card.show(cn,"Home");
			}
		}
	}
} 
class Project
{
	
	public static void main(String []ab)
	{
		int w=800,h=700,x=0,y=0;
		Toolkit t=Toolkit.getDefaultToolkit();
		Dimension d=t.getScreenSize();
		x=(d.width-w)/2;
		y=(d.height-h)/2;
		
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setSize(w,h);
		f.setLocation(x,y);
		f.setResizable(false);
		f.setTitle("Examination");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}