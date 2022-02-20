import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class FDemo extends JFrame implements ActionListener
{
	JButton b[]=new JButton[9];
	int k,c;
	FDemo()
	{	
			GridLayout g=new GridLayout(3,3);
			setLayout(g);
			for(int i=0;i<3;i++)
			{
				for(int j=0;j<3;j++)
				{
					b[k]=new JButton("");
					add(b[k]);
					b[k].addActionListener(this);
					k++;
				}
			}
		
	}
	public void actionPerformed(ActionEvent e)
	{
		JButton b1=(JButton)e.getSource();
		{
			if(c%2==0)
			{
				b1.setLabel("X");
			}
			else
			{
				b1.setLabel("O");
			}
			b1.removeActionListener(this);
			c++;
			
			if(
			(b[0].getLabel()=="X" && b[1].getLabel()=="X" && b[2].getLabel()=="X") ||
			(b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[5].getLabel()=="X") || 
			(b[6].getLabel()=="X" && b[7].getLabel()=="X" && b[8].getLabel()=="X") ||
			(b[0].getLabel()=="X" && b[3].getLabel()=="X" && b[6].getLabel()=="X") || 
			(b[1].getLabel()=="X" && b[4].getLabel()=="X" && b[7].getLabel()=="X") ||
			(b[3].getLabel()=="X" && b[4].getLabel()=="X" && b[8].getLabel()=="X"))
			{
				System.out.println("Player 1 Wins");
			}
			else if(
			(b[0].getLabel()=="O" && b[1].getLabel()=="O" && b[2].getLabel()=="O") ||
			(b[3].getLabel()=="O" && b[4].getLabel()=="O" && b[5].getLabel()=="O") || 
			(b[6].getLabel()=="O" && b[7].getLabel()=="O" && b[8].getLabel()=="O") ||
			(b[0].getLabel()=="O" && b[3].getLabel()=="O" && b[6].getLabel()=="O") || 
			(b[1].getLabel()=="O" && b[4].getLabel()=="O" && b[7].getLabel()=="O") ||
			(b[3].getLabel()=="O" && b[5].getLabel()=="O" && b[8].getLabel()=="O"))
			{
				System.out.println("Player 2 wins");
			}
		}
	}
}
class Tictactoe
{
	public static void main(String args[])
	{
		FDemo f=new FDemo();
		f.setVisible(true);
		f.setBounds(100,10,600,600);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}