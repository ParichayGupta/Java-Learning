import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.regex.*;

class Register extends JPanel implements ActionListener
{
	JLabel l1,l2,l3,l4,l5;
	JTextField t1,t5,t4;
	JPasswordField t2,t3;
	JButton b1,b2;
	
	Register(FDemo f)
	{
		setLayout(null);
		
		Font fo1=new Font("Microsoft Tai Le",Font.PLAIN,15);
		Font fo2=new Font("Microsoft Tai Le",Font.BOLD,15);
		Font fo3=new Font("Microsoft Tai Le",Font.BOLD,50);
		
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		
		l1=new JLabel("User Name");
		l1.setBounds(280,250,80,15);
		l1.setForeground(b);
		l1.setFont(fo1);
		add(l1);
		
		t1=new JTextField();
		t1.setBounds(280,270,250,25);
		add(t1);
		
		l2=new JLabel("Create Password");
		l2.setBounds(280,300,150,15);
		l2.setForeground(b);
		l2.setFont(fo1);
		add(l2);
		
		t2=new JPasswordField();
		t2.setBounds(280,320,250,25);
		add(t2);
		
		l3=new JLabel("Confirm Password");
		l3.setBounds(280,350,150,15);
		l3.setForeground(b);
		l3.setFont(fo1);
		add(l3);
		
		t3=new JPasswordField();
		t3.setBounds(280,370,250,25);
		add(t3);
		
		l4=new JLabel("Contact No");
		l4.setBounds(280,400,150,15);
		l4.setForeground(b);
		l4.setFont(fo1);
		add(l4);
		
		t4=new JTextField();
		t4.setBounds(280,420,250,25);
		add(t4);
		
		b1=new JButton("Register");
		b1.setBounds(280,490,250,25);
		b1.setBackground(b);
		b1.setForeground(Color.white);
		b1.setFont(fo2);
		b1.setBorder(BorderFactory.createEmptyBorder());
		add(b1);
		b1.addActionListener(this);
		
		
		b2=new JButton("Existing User - Login");
		b2.setBounds(280,450,250,30);
		b2.setBorderPainted(false);
		b2.setForeground(b);
		b2.setBorder(BorderFactory.createEmptyBorder());
		b2.setOpaque(true);
		b2.setContentAreaFilled(false);
		b2.setFont(fo2);
		add(b2);
		b2.addActionListener(f);	
	
		l5=new JLabel("Registration");
		l5.setBounds(30,30,500,90);
		l5.setFont(fo3);
		l5.setForeground(r);
		add(l5);
	}
	public void paintComponent(Graphics g)
	{
		Color y=new Color(251,188,5);
		Color b=new Color(66,133,244);
		Color gr=new Color(52,168,83);
		Color r=new Color(234,67,53);
		
		
		g.setColor(Color.white);
		g.fillRect(0,0,800,700);
		g.setColor(y);
		g.fillRect(0,0,800,150);
		g.setColor(b);
		g.drawRect(260,230,290,315);
		
	}
	public void actionPerformed(ActionEvent e)
	{
		String s1=t1.getText();
		String s2=t2.getText();
		String s3=t3.getText();
		String s4=t4.getText();
		Pattern p=Pattern.compile("^0?[6-9]\\d{9}$");
		Matcher m=p.matcher(s4);
				
		if(e.getSource()==b1)
		{
			try
			{
				Class.forName("com.mysql.cj.jdbc.Driver");
				
				String db_url="jdbc:mysql://localhost:3306/Project?useSSL=false";
				String db_uname="root";
				String db_upass="root";
				
				Connection con=DriverManager.getConnection(db_url,db_uname,db_upass);
				
				Statement st=con.createStatement();
				
				if (s1.length()>4 || s2.length()>8 || s3.length()>8 && (s4.length()<=12 || s4.length()>9))
				{
					if(s2.equals(s3))
					{
						if(m.find())
						{
							String q="insert into user values('"+s1+"','"+s2+"','"+s3+"','"+s4+"')";
							st.executeUpdate(q);
				
							JOptionPane.showMessageDialog(b1,"Registered Successfully");
						}
						else
						{
							JOptionPane.showMessageDialog(t4,"Invalid Number");
						}
					}
					else
					{
						JOptionPane.showMessageDialog(b1,"Password Doesn't match");
					}
				}
				else
				{
					JOptionPane.showMessageDialog(b1,"Please fill the above fields");
				}
				t1.setText("");
				t2.setText("");
				t3.setText("");
				t4.setText("");
					
				con.close();
			}
			catch(Exception e1)
			{
				System.out.println(e1);
			}
		}
	}
}