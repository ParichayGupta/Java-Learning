import javax.swing.*;
import java.awt.*;

class A extends JFrame implements Runnable
{
	int i=1;
	JLabel l1,l2;
	A()
	{
		Thread t1=new Thread(this);
		t1.start();
	}
	public void run()
	{
		setLayout(null);
		int x=100;
		for(i=1;i<=10;i++)
		{
			String s1=Integer.toString(i);
			l1=new JLabel(s1);
			l1.setBounds(x,100,30,30);
			add(l1);
			x=x+40;
			try{Thread.sleep(50);} catch(Exception e){}
		}
		int xx=150;
		for(i=100;i<=110;i++)
		{
			String s1=Integer.toString(i);
			l1=new JLabel(s1);
			l1.setBounds(xx,100,30,30);
			add(l1);
			x=x+40;
			try{Thread.sleep(50);} catch(Exception e){}
		}
	}
}
class MultiThreading
{
	public static void main(String args[])
	{
		A a=new A();
		a.setVisible(true);
		a.setBounds(200,200,900,500);
		a.setDefaultCloseOperation(a.EXIT_ON_CLOSE);
	}	
}