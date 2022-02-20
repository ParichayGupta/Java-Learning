import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class FDemo extends JFrame
{
	JPDemo jp1;
	FDemo()
	{
		jp1=new JPDemo();
		add(jp1);
	}
}

class JPDemo extends JPanel
{
	ImageIcon img1,img2,img3,img4,img5,img6,img7;img8,img9;
	Image logo,board,play,start;
	Image player1,player2,player11,player12;
	Image dice,dice1;
	JButton b1,b2,b3,b4;
	JTextField tx1,tx2,tx3;	
	JPDemo()
	{
		setBackground(Color.black);
		
		img1=new ImageIcon("sll.png");
		img2=new ImageIcon("sl.jpg");
		img3=new ImageIcon("play.png");
		img4=new ImageIcon("");
		img5=new ImageIcon("");
		img6=new ImageIcon("");
		img7=new ImageIcon("");
		img8=new ImageIcon("");
		img9=new ImageIcon("");
	
		logo=img1.getImage();
		board=img2.getImage();
		play=img3.getImage();
		
		setLayout(null);
		b1=new JButton("About");
		b1.setBounds(50,180,100,30);
		add(b1);
		
		b2=new JButton("Reset");
		b2.setBounds(50,220,100,30);
		add(b2);
		
		Font f=new Font("TimesNewRoman",Font.ITALIC,20);
		
		tx1=new JTextField("Start Game");
		tx1.setBounds(50,270,150,35);
		add(tx1);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(f);
		
		tx2=new JTextField("Player 1");
		tx2.setBounds(50,310,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		tx2=new JTextField("Player 2");
		tx2.setBounds(50,350,150,35);
		add(tx2);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(f);
		
		b3=new JButton("Roll");
		b3.setBounds(50,500,100,30);
		add(b3);
		b3.setFont(f);
		b3.setForeground(Color.red);
		
		b4=new JButton(img3);
		b4.setBounds(20,560,150,60);
		add(b4);
		b4.setFont(f);
		b4.setForeground(Color.red);
		}
		public void paintComponent(Graphics g)
		{
			super.paintComponent(g);
			g.setColor(Color.DARK_GRAY);
			g.fillRect(0,0,200,735);
			
			g.drawImage(logo,0,0,this);
			g.drawImage(board,200,0,this);
			g.drawImage(play,20,560,this);
		}
}
class Demo
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setResizable(false);
		f.setBounds(200,3,990,735);
		f.setTitle("Snake And Ladders");
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}
