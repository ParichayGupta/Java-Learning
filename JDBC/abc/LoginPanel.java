import javax.swing.*;

class LoginPanel extends JPanel
{
	JButton b1;
	JTextField tx1;
	JPasswordField tx2;
	JLabel un,up;
	LoginPanel(FDemo f)
	{
		
		setLayout(null);
		
		un=new JLabel("Name");
		un.setSize(120,30);
		un.setLocation(100,100);
		add(un);
		
		tx1=new JTextField();
		tx1.setSize(150,30);
		tx1.setLocation(220,100);
		add(tx1);
		
		up=new JLabel("Password");
		up.setSize(120,30);
		up.setLocation(100,150);
		add(up);
		
		tx2=new JPasswordField(20);
		tx2.setSize(150,30);
		tx2.setLocation(220,150);
		add(tx2);
		
		b1=new JButton("Submit");
		b1.setSize(85,35);
		b1.setLocation(150,200);
		add(b1);
		b1.addActionListener(f);
	}
}
	
