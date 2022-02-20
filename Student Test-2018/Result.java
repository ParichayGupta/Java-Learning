import javax.swing.*;
import java.awt.*;
class Result extends JPanel
{
	JLabel lh,l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JButton b1,b2;
	Image i;
	Font f1=new Font("Arial Black",Font.BOLD,12);
	Font f2=new Font("Arial Black",Font.BOLD,18);
    Result(FDemo f)
    {
		setLayout(null);
		Toolkit t=Toolkit.getDefaultToolkit();
		i=t.getImage("Admin.jpg");
		
		b1=new JButton("Menu");
		b1.setBounds(200,480,100,40);
		add(b1);
		b1.addActionListener(f);
		
		b2=new JButton("Save Result");
		b2.setBounds(350,480,100,40);
		add(b2);
		b2.addActionListener(f);
		
		l1=new JLabel("Result");
		l1.setBounds(260,10,100,50);
		add(l1);
		l1.setFont(f2);
		
	  
    	
		
		
		/**********************************/
		
		l1=new JLabel("Name");
		l1.setBounds(160,50,100,50);
		add(l1);
		
		l2=new JLabel("Attempt");
		l2.setBounds(160,150,140,50);
		add(l2);
		
		l3=new JLabel("Wrong Answer");
		l3.setBounds(160,200,100,50);
		add(l3);
		
		l4=new JLabel("Marks Obtain");
		l4.setBounds(160,250,100,50);
		add(l4);
		
		l5=new JLabel("Total Marks");
		l5.setBounds(160,300,100,50);
		add(l5);
		
		l6=new JLabel("");
		l6.setBounds(350,50,100,50);
		
		add(l6);
		
		l7=new JLabel("");
		l7.setBounds(350,150,100,50);
		add(l7);
		
		l8=new JLabel("");
		l8.setBounds(350,200,100,50);
		add(l8);
		
		l9=new JLabel("");
		l9.setBounds(350,250,100,50);
		add(l9);
		
		l10=new JLabel("");
		l10.setBounds(350,300,100,50);
		add(l10);
		
		l11=new JLabel("TotalTime");
		l11.setBounds(160,350,100,50);
		add(l11);
		
		l12=new JLabel("");
		l12.setBounds(350,350,100,50);
		l12.setForeground(Color.red);
		add(l12);
		
		l13=new JLabel("Accuracy:");
		l13.setBounds(160,400,100,50);
		add(l13);
		
		l14=new JLabel("");
		l14.setBounds(350,400,100,50);
		add(l14);
		
//sub=160,100,100,50
//sub2=350,100,100,50

		l15=new JLabel("Subject:");
		l15.setBounds(160,100,100,50);
		add(l15);
		
		l16=new JLabel("");
		l16.setBounds(350,100,100,50);
		add(l16);
		
		
		/************************************/
		
		// l11=new JLabel("TotalTime");
		// l11.setBounds(160,300,100,50);
		// add(l11);
		
		// l12=new JLabel("");
		// l12.setBounds(350,300,100,50);
		// l12.setForeground(Color.red);
		// add(l12);

		
		// l13=new JLabel("Accuracy:");
		// l13.setBounds(160,350,100,50);
		// add(l13);
		
		// l14=new JLabel("");
		// l14.setBounds(350,350,100,50);
		// add(l14);
		
		// l15=new JLabel("Subject:");
		// l15.setBounds(160,400,100,50);
		// add(l15);
		
		// l16=new JLabel("");
		// l16.setBounds(350,400,100,50);
		// add(l16);
		
		l1.setFont(f1);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f1);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f1);
		l8.setFont(f1);
		l9.setFont(f1);
		l10.setFont(f1);
		l11.setFont(f1);
		l12.setFont(f1);
		l13.setFont(f1);
		l14.setFont(f1);
		l15.setFont(f1);
		l16.setFont(f1);
		
		
		
		
    }
	public void paintComponent(Graphics g)
	{
		g.setColor(new Color(245,61,14));
		g.drawImage(i,1,1,this);
		
		g.drawRect(150,60,400,50);//top1
		g.drawRect(150,110,400,50);//top2
		g.drawRect(150,160,400,50);//top3
		g.drawRect(150,210,400,50);//top4
		g.drawRect(150,260,400,50);//top5
		g.drawRect(150,310,400,50);//top6
		g.drawRect(150,360,400,50);//top7
		g.drawRect(150,410,400,50);//top7
		g.drawLine(300,60,300,460);//line
	}
}