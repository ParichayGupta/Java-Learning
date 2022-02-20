import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
class Admin extends JPanel
{
	JTabbedPane tb;
	Insert ins;
	AddSubject ads;
	Update upd;
	DeleteSubject dls;
	StudentDetail sd;
	Color c=new Color(200,191,232);
	Color c1=new Color(185,122,87);
 Admin(FDemo f)
 {
	 BorderLayout br=new BorderLayout();
	 setLayout(br);
	tb=new JTabbedPane();
	
	ins=new Insert(f);
	ins.setBackground(c1);
	tb.addTab("Add Question",ins);
	
	upd=new Update(f);
	upd.setBackground(c1);
	tb.add("Update Question",upd);
	
	ads=new AddSubject(f);
	ads.setBackground(c);
	tb.add("Add Subject",ads);
	
	
	dls=new DeleteSubject(f);
	dls.setBackground(c);
	tb.addTab("Delete Subject",dls);
	
	sd=new StudentDetail(f);
	tb.add("Student Information",sd);
	
	add(tb);
	tb.addChangeListener(f);
	
 }
 }
 class Insert extends JPanel
 {
	 JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton b1,b2,b3;
	JComboBox cbb1;
	JTextArea ta;
	ImageIcon ic1;
	Color c=new Color(192,192,192);
	Color c1=new Color(255,51,51);
	Color c3=new Color(200,191,231);
	Font f1,f2;
	Image i;
	
    ImageIcon ii;
    JPanel jp;
		
	Color c2=new Color(47,50,62);
	Font ft1=new Font("Lucida Sans",Font.BOLD,18);
	Font ft2=new Font("Lucida Sans",Font.BOLD,14);	 
	
	 Insert(FDemo f)
	 {
	
	   ii=new ImageIcon("AdminPhoto.png");
		setLayout(null);
		
	    jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,1200,70);
		jp.setBackground(c2);
		add(jp);
		
		l10=new JLabel("Add Question");
		l10.setFont(ft1);
		l10.setForeground(Color.WHITE);
		l10.setBounds(20,25,250,20);
		jp.add(l10);
		
		l11=new JLabel("");
		l11.setFont(ft2);
		l11.setForeground(Color.WHITE);
		l11.setBounds(575,15,150,20);
		jp.add(l11);
		
		l12=new JLabel();
		l12.setIcon(ii);
		l12.setBounds(515,10,50,45);
		jp.add(l12);	
	
	
		 
	
	ic1=new ImageIcon("upload.png");
	
	f1=new Font("Arial Black",Font.BOLD,14);
	
	l1=new JLabel("Enter Serial NO.");
	l1.setForeground(Color.white);
	l1.setBounds(80,130,150,40);
	add(l1);
	
	String s1[]={"Select Subject"};
	cbb1=new JComboBox(s1);
	cbb1.setBackground(Color.black);
	cbb1.setForeground(Color.white);
	cbb1.setBounds(350,130,130,40);
	add(cbb1);
	cbb1.addActionListener(f);
	
	l9=new JLabel("");
	l9.setBounds(350,162,140,30);
	l9.setForeground(new Color(117,0,18));
	add(l9);
	
	tf1=new JTextField(20);
	tf1.setBounds(230,130,80,35);
	add(tf1);
	
	l2=new JLabel("Enter Question");
	l2.setBounds(80,200,150,40);
	l2.setForeground(Color.white);
	add(l2);
	
	ta=new JTextArea();
	ta.setBounds(200,200,350,80);
	add(ta);	

	
	l3=new JLabel("Option A");
	l3.setForeground(Color.WHITE);
	l3.setBounds(70,290,100,40);
	add(l3);
	
	tf2=new JTextField(150);
	tf2.setBounds(40,330,140,50);
	add(tf2);
	
	l4=new JLabel("Option B");
	l4.setBounds(200,290,100,40);
	l4.setForeground(Color.white);
	add(l4);
	
	tf3=new JTextField(150);
	tf3.setBounds(200,330,140,50);
	add(tf3);
	
	
	l5=new JLabel("Option C");
	l5.setBounds(350,290,100,40);
	l5.setForeground(Color.white);
	add(l5);
	
	tf4=new JTextField(150);
	tf4.setBounds(360,330,140,50);
	add(tf4);
	
	
	l6=new JLabel("Option D");
	l6.setBounds(500,290,100,40);
	l6.setForeground(Color.white);
	add(l6);
	
	tf5=new JTextField(150);
	tf5.setBounds(510,330,140,50);
	add(tf5);
	
	l7=new JLabel("Answer");
	l7.setBounds(200,370,100,40);
	l7.setForeground(Color.white);
	add(l7);
	
	tf6=new JTextField(150);
	tf6.setBounds(170,400,140,50);
	add(tf6);
	
	l8=new JLabel("Marks");
	l8.setBounds(350,370,100,40);
	l8.setForeground(Color.white);
	add(l8);
	
	tf7=new JTextField(130);
	tf7.setText("10");
	tf7.setBounds(340,400,130,50);
	add(tf7);
	
	b1=new JButton("",ic1);
	b1.setBounds(270,460,100,50);
	b1.setForeground(Color.white);
	b1.setBackground(c1);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Home");
	
	b2.setBackground(Color.black);
	b2.setForeground(Color.white);
	b2.setBounds(120,460,100,50);
	add(b2);
	b2.addActionListener(f);
	
	b3=new JButton("Admin Registration");
	b3.setBounds(420,460,150,50);
	b3.setBackground(Color.black);
	b3.setForeground(Color.white);
	add(b3);
	b3.addActionListener(f); 
	
	
	tf1.setBackground(Color.BLACK);
	tf1.setForeground(Color.WHITE);
	tf2.setBackground(c3);
	tf3.setBackground(c3);
	tf4.setBackground(c3);
	tf5.setBackground(c3);
	tf6.setBackground(c3);
	tf7.setBackground(c3);
	
	 }
	
	 
 }
 class AddSubject extends JPanel
 {
	 JLabel l1,l2,l3,l4,l5;
	 JTextField t1;
	 JButton b1;
	 Font f1,f2;
	 ImageIcon ii;
	 JPanel jp;
		
	 Color c1=new Color(47,50,62);
	 Font ft1=new Font("Lucida Sans",Font.BOLD,18);
	 Font ft2=new Font("Lucida Sans",Font.BOLD,14); 
	 
	 AddSubject(FDemo f)
	 {
		ii=new ImageIcon("AdminPhoto.png");
		setLayout(null);
		
		
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,1200,70);
		jp.setBackground(c1);
		add(jp);
		
		l3=new JLabel("Add New Subject");
		l3.setFont(ft1);
		l3.setForeground(Color.WHITE);
		l3.setBounds(20,20,250,20);
		jp.add(l3);
		
		l4=new JLabel("");
		l4.setFont(ft2);
		l4.setForeground(Color.WHITE);
		l4.setBounds(570,15,150,20);
		jp.add(l4);
		
		l5=new JLabel();
		l5.setIcon(ii);
		l5.setBounds(515,10,50,45);
		jp.add(l5);
		
	

		 f1=new Font("Britannic Bold",Font.BOLD,28);
		 f2=new Font("Calibri (Body)",Font.BOLD,14);
		 
		 t1=new JTextField("");
		 t1.setBounds(300,140,130,40);
		 add(t1);
		 t1.addActionListener(f);
		 
		 l2=new JLabel("");
		 l2.setFont(f1);
		 l2.setBounds(450,60,200,200);
		 l2.setForeground(Color.red);
		 add(l2);
		 
		 l1=new JLabel("Enter Subject");
		 l1.setFont(f2);
		 l1.setForeground(Color.BLACK);
		 l1.setBounds(200,140,100,40);
		 add(l1);
		 
		 
		 
		 b1=new JButton("ADD");
		 b1.setFont(f2);
		 b1.setBounds(250,210,130,40);
		 b1.setBackground(c1);
		 b1.setForeground(Color.white);
		 add(b1);
		 b1.addActionListener(f);
	 }
	
	 
 }
 class Update extends JPanel
 {
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7;
	JButton b1,b2;
	JComboBox cbb1;
	JTextArea ta;
	Color c,c1;
	Font f1;
	Image i;
	
	ImageIcon ii;
	JPanel jp;
		
	Color c2=new Color(47,50,62);
	Font ft1=new Font("Lucida Sans",Font.BOLD,18);
	Font ft2=new Font("Lucida Sans",Font.BOLD,14);
	
	
	 Update(FDemo f)
	 {
		
		
	    ii=new ImageIcon("AdminPhoto.png");
		setLayout(null);
		
		
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,1200,70);
		jp.setBackground(c2);
		add(jp);
		
		l10=new JLabel("Update Question");
		l10.setFont(ft1);
		l10.setForeground(Color.WHITE);
		l10.setBounds(20,25,250,20);
		jp.add(l10);
		
		l11=new JLabel("");
		l11.setFont(ft2);
		l11.setForeground(Color.WHITE);
		l11.setBounds(575,15,150,20);
		jp.add(l11);
		
		l12=new JLabel();
		l12.setIcon(ii);
		l12.setBounds(515,10,50,45);
		jp.add(l12);	
		
		
		
		
		
		
	
       c1=new Color(255,51,51);
	   c=new Color(177,177,183);

	   Toolkit t=Toolkit.getDefaultToolkit();
	i=t.getImage("Upd.jpg");
	   
	   
	l1=new JLabel("Serial NO.");
	l1.setBounds(100,80,100,40);
	// l1.setForeground(Color.white);
	add(l1);
	
	String s1[]={"Select Subject"};
	cbb1=new JComboBox(s1);
	cbb1.setBackground(Color.black);
	cbb1.setForeground(Color.white);
	cbb1.setBounds(350,80,130,40);
	add(cbb1);
	cbb1.addActionListener(f);
	
	l9=new JLabel("");
	l9.setBounds(350,112,140,30);
	l9.setForeground(Color.red);
	add(l9);
	
	tf1=new JTextField(20);
	tf1.setText("tf1");
	tf1.setBounds(230,85,70,30);
	add(tf1);
	
	l2=new JLabel("Question");
	l2.setBounds(100,160,100,40);
	add(l2);
	
	ta=new JTextArea();
	ta.setBackground(c);
	ta.setBounds(200,160,350,80);
	add(ta);	
	
	l3=new JLabel("Option A");
	l3.setBounds(70,260,100,40);
	add(l3);
	
	tf2=new JTextField(150);
	tf2.setBounds(40,300,140,50);
	add(tf2);
	
	l4=new JLabel("Option B");
	l4.setBounds(200,260,100,40);
	add(l4);
	
	tf3=new JTextField(150);
	tf3.setBounds(200,300,140,50);
	add(tf3);
	
	
	l5=new JLabel("Option C");
	l5.setBounds(350,260,100,40);
	add(l5);
	
	tf4=new JTextField(150);
	tf4.setBounds(360,300,140,50);
	add(tf4);
	
	
	l6=new JLabel("Option D");
	l6.setBounds(500,260,100,40);
	add(l6);
	
	tf5=new JTextField(150);
	tf5.setBounds(510,300,140,50);
	add(tf5);
	
	l7=new JLabel("Anser");
	l7.setBounds(200,340,100,40);
	l7.setForeground(Color.white);
	add(l7);
	
	tf6=new JTextField(150);
	tf6.setBounds(170,370,140,50);
	add(tf6);
	
	l8=new JLabel("Marks");
	l8.setBounds(350,340,100,40);
	l8.setForeground(Color.white);
	add(l8);
	
	tf7=new JTextField(130);
	tf7.setText("10");
	tf7.setBounds(340,370,130,50);
	add(tf7);
	
	
	b1=new JButton("Update");
	b1.setBounds(250,430,100,50);
	b1.setForeground(Color.white);
	b1.setBackground(c1);
	add(b1);
	b1.addActionListener(f);
	
	b2=new JButton("Show");
	b2.setBounds(230,120,70,30);
	add(b2);
	b2.addActionListener(f);
	 }
 
 
}
class DeleteSubject extends JPanel
{
	JLabel l3,l4,l5;
	JComboBox cbb1;
	JButton b1;
	Font f1;
	ImageIcon ii;
	JPanel jp;
	Color c=new Color(200,191,231);
	
	 Color c1=new Color(47,50,62);
	 Font ft1=new Font("Lucida Sans",Font.BOLD,18);
	 Font ft2=new Font("Lucida Sans",Font.BOLD,14);
	DeleteSubject(FDemo f)
	{
		ii=new ImageIcon("AdminPhoto.png");
		setLayout(null);
		
		
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,1200,70);
		jp.setBackground(c1);
		add(jp);
		
		l3=new JLabel("Delete Subject");
		l3.setFont(ft1);
		l3.setForeground(Color.WHITE);
		l3.setBounds(20,20,250,20);
		jp.add(l3);
		
		l4=new JLabel("");
		l4.setFont(ft2);
		l4.setForeground(Color.WHITE);
		l4.setBounds(570,15,150,20);
		jp.add(l4);
		
		l5=new JLabel();
		l5.setIcon(ii);
		l5.setBounds(515,10,50,45);
		jp.add(l5);
		
		 f1=new Font("Calibri (Body)",Font.BOLD,14);
		
		
		String s1[]={"Select Subject"};
		cbb1=new JComboBox(s1);
		cbb1.setBounds(260,140,130,40);
		cbb1.setBackground(c);
		cbb1.setForeground(Color.black);
		add(cbb1);
		
		 b1=new JButton("Delete");
		 b1.setFont(f1);
		 b1.setBackground(Color.black);
		 b1.setForeground(Color.white);
		 b1.setBounds(260,210,130,40);
		 add(b1);
		 b1.addActionListener(f);
	}

}

class StudentDetail extends JPanel
{
	JTable t1;
	ImageIcon ii;
	JComboBox cb1;
	JTextField tf1;
	JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16;
	JPanel jp,jp1,jp2,jp3,jp4,jp5;
	JScrollPane sp;
	JButton b1;
	Color c1=new Color(47,50,62);
	Color c2=new Color(255,127,39);
	Color c3=new Color(112,146,190);
	Color c4=new Color(255,160,98);
	Font f1=new Font("Lucida Sans",Font.BOLD,18);
	Font f2=new Font("Lucida Sans",Font.BOLD,14);
	Font f3=new Font("Lucida Sans",Font.ITALIC,13);
	Font f4=new Font("Lucida Sans",Font.ITALIC,12);
	Font ft2=new Font("Tahoma",Font.BOLD,14);
	Font ft5=new Font("Tahoma",Font.BOLD,14);
	StudentDetail(FDemo f)
	{
		ii=new ImageIcon("AdminPhoto.png");
		
		setLayout(null);
		jp2=new JPanel();
		jp2.setLayout(null);
		jp2.setBounds(0,70,190,600);
		jp2.setBackground(c2);
		add(jp2);
		
		
		jp3=new JPanel();
		jp3.setLayout(null);
		jp3.setBounds(0,4,190,100);
		jp3.setBackground(c4);
		jp2.add(jp3);
		
		jp4=new JPanel();
		jp4.setLayout(null);
		jp4.setBounds(0,108,190,40);
		jp4.setBackground(c4);
		jp2.add(jp4);
		jp4.addMouseListener(f);
		
		
		
		l4=new JLabel("Name:-");
		l4.setBounds(5,10,100,20);
		l4.setFont(ft2);
		jp3.add(l4);
		
		l5=new JLabel("");
		l5.setBounds(80,10,150,20);
		l5.setFont(ft5);
		l5.setForeground(Color.blue);
		jp3.add(l5);
		
		l6=new JLabel("Roll No:-");
		l6.setBounds(5,40,100,20);
		l6.setFont(ft2);
		jp3.add(l6);
		
		l7=new JLabel("");
		l7.setBounds(80,40,100,20);
		l7.setFont(ft5);
		l7.setForeground(Color.blue);
		jp3.add(l7);
		
		l8=new JLabel("More");
		l8.setBounds(30,8,150,30);
		l8.setFont(ft2);
		jp4.add(l8);
		
		jp1=new JPanel();
		jp1.setLayout(null);
		jp1.setBounds(0,70,1200,500);
		jp1.setBackground(c3);
		add(jp1);
		
		jp5=new JPanel();
		jp5.setLayout(null);
		jp5.setBounds(190,180,1200,400);
		jp5.setBackground(c3);
		jp1.add(jp5);	
		
		l9=new JLabel("");
		l9.setBounds(50,0,150,20);
		l9.setFont(ft2);
		
		l10=new JLabel("");
		l10.setBounds(150,0,150,20);
		l10.setFont(ft2);
		
		l11=new JLabel("");
		l11.setBounds(50,50,200,20);
		l11.setFont(ft2);
		
		l12=new JLabel("");
		l12.setBounds(150,50,300,20);
		l12.setForeground(Color.BLUE);
		l12.setFont(f3);
		
		l13=new JLabel("");
		l13.setBounds(50,100,200,20);
		l13.setFont(ft2);
		
		l14=new JLabel("");
		l14.setBounds(150,100,300,20);
		l14.setFont(ft2);
		
		l15=new JLabel("");
		l15.setBounds(50,150,150,20);
		l15.setFont(ft2);
		
		l16=new JLabel("");
		l16.setBounds(150,150,150,20);
		l16.setFont(ft2);
		
		
		jp=new JPanel();
		jp.setLayout(null);
		jp.setBounds(0,0,1200,70);
		jp.setBackground(c1);
		add(jp);
		
		
		
		l1=new JLabel("Student Detail");
		l1.setFont(f1);
		l1.setForeground(Color.WHITE);
		l1.setBounds(20,20,150,20);
		jp.add(l1);
		
		tf1=new JTextField("");
		tf1.setBounds(200,15,250,25);
		tf1.setFont(f3);
		jp.add(tf1);
		
		tf1.addFocusListener(f);
		tf1.addKeyListener(f);
	   
		
		l2=new JLabel();
		l2.setFont(f2);
		l2.setForeground(Color.WHITE);
		l2.setBounds(570,15,150,20);
		jp.add(l2);
		
		l3=new JLabel();
		l3.setIcon(ii);
		l3.setBounds(515,8,50,45);
		jp.add(l3);
		
	}
}




