import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
 class FDemo extends JFrame
 {
	 JPDemo jp;
	FDemo()
	{
		jp=new JPDemo();
		add(jp);
	}
 }
 class JPDemo extends JPanel implements ActionListener,KeyListener
 {
	 ImageIcon img1,img2,img3;
	 Image dot,head,food;
	 int x[]=new int[100];
	 int y[]=new int[100];
	 int dots=5;
	 boolean start=false;
	 int r1,r2;
	 boolean left=false,right=true,up=false,down=false;
	 
	 JPDemo()
	 {
		 x[0]=120;
		 y[0]=100;
		 x[1]=100;
		 y[1]=100;
		 x[2]=80;
		 y[2]=100;
		 x[3]=60;
		 y[3]=100;
	     x[4]=40;
		 y[4]=100;
		 
		 setBackground(Color.black);
		 img1=new ImageIcon("dot.png");
		 dot=img1.getImage();
		 img2=new ImageIcon("head.png");
		 head=img2.getImage();
		 img3=new ImageIcon("dot.png");
		 food=img3.getImage();
		 
		 Timer t=new Timer(120,this);
		 t.start();
		 addKeyListener(this);
		 setFocusable(true);
	 }
	 public void paintComponent(Graphics g)
	 {
		 
		 super.paintComponent(g);
		 
		 for(int i=0;i<dots;i++)
		 {
			 if(i==0)
			 g.drawImage(head,x[i],y[i],this);
			else
			 g.drawImage(dot,x[i],y[i],this);
		 }
		g.drawImage(food,r1,r2,this);
	 }
	 public void randomDemo()
	 {
		r1=(int)Math.round(Math.random()*30+1);
		r1=r1*20;	
		r2=(int)Math.round(Math.random()*30+1);
		r2=r2*20;	
	 }
	 public void actionPerformed(ActionEvent e)
	 {
				if(start)
				{
					if(left)
					{
						x[0]=x[0]-20;
					}
					if(right)
					{	
						x[0]=x[0]+20;
					}
					if(up)
					{
						y[0]=y[0]-20;
					}
					if(down)
					{
						y[0]=y[0]+20;
					}
				}
				repaint();
				
	 }
	 public void keyReleased(KeyEvent e)
	 {
		 
	 }
	 public void keyPressed(KeyEvent e)
	 {
		 start=true;
		 if(e.getKeyCode()==KeyEvent.VK_RIGHT)
		 {
			 right=true;
			 left=false;
			 up=false;down=false;
		 }
	 }
	 public void keyTyped(KeyEvent e)
	 {
		 
	 }
 }
 
 class Demo3
 {
	 public static void main(String args[])
	 {
		 FDemo f=new FDemo();
		 f.setVisible(true);
		 f.setBounds(100,20,700,700);
		 f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	 }
 }