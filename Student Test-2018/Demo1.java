import javax.swing.*;
import javax.swing.table.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TreeSet;
import java.util.ArrayList;
class FDemo extends JFrame implements ActionListener,ChangeListener,FocusListener,MouseListener,KeyListener
{
	CardLayout card;
	Container cn=getContentPane();
	Roll rl;
	Forroll fr;
	Home hm;
	Student st;
	Admin ad;
	Question q1;
	StLogin stlog;
	AdLogin adlog;
	AdminReg adreg;
    StudentReg streg;
	StLogin1 stlog1;
	AdForgot adf;
	AfterForgot af;
    StForgot stf;	
	StReset sr;
	Result gr;

	Font f1=new Font("@Kozuka Gothic Pr6N B",Font.BOLD,14);
	Font f2=new Font("Arial Black",Font.BOLD,12);
	Font fh=new Font("Arial Black",Font.BOLD,18);
	Font f3=new Font("Adobe Gothic Std B",Font.BOLD,16);
	Font fst=new Font("Calibri",Font.BOLD,14);
	FDemo()
	{
		setFont(f1);
		setFont(f2);
		card=new CardLayout();
		setLayout(card);
		
		hm=new Home(this);
		cn.add("Home",hm);
		
		sr=new StReset(this);
		cn.add("StReset",sr);
		
		fr=new Forroll(this);
		cn.add("Forroll",fr);
		
		rl=new Roll(this);
		cn.add("Roll",rl);
		
		gr=new Result(this);
		cn.add("Result",gr);
		
		adf=new AdForgot(this);
		cn.add("Forgot",adf);
		
		af=new AfterForgot(this);
		cn.add("AfterForgot",af);
		
		stf=new StForgot(this);
		cn.add("forgot2",stf);
		
		st=new Student(this);
		cn.add("student",st);
		
		stlog=new StLogin(this);
		cn.add("stlogin",stlog);
		
		streg=new StudentReg(this);
		cn.add("streg",streg);
		
		ad=new Admin(this);
		cn.add("admin",ad);
		
		adlog=new AdLogin(this);
		cn.add("adLogin",adlog);
		
		adreg=new AdminReg(this);
		cn.add("adminreg",adreg);
		
		q1=new Question(this);
		cn.add("question",q1);
		
		stlog1=new StLogin1(this);
		cn.add("stlogin1",stlog1);

		
		
stlog.l1.setFont(f1);		
stlog.l2.setFont(f1);
stlog.b1.setFont(f2);		
stlog.b2.setFont(f2);
adlog.lh.setFont(fh);		
stlog.lh.setFont(fh);	
	
streg.lh.setFont(fh);		
adreg.lh.setFont(fh);		

ad.ins.ta.setFont(f2);
ad.ins.tf1.setFont(f1);
ad.ins.tf2.setFont(fst);
ad.ins.tf3.setFont(fst);
ad.ins.tf4.setFont(fst);
ad.ins.tf5.setFont(fst);
ad.ins.tf6.setFont(f2);
ad.ins.l1.setFont(f1);
ad.ins.l2.setFont(f1);
ad.ins.l3.setFont(f1);
ad.ins.l4.setFont(f1);
ad.ins.l5.setFont(f1);
ad.ins.l6.setFont(f1);
ad.ins.l7.setFont(f1);
ad.ins.l8.setFont(f1);
ad.ins.cbb1.setFont(f1);
ad.dls.cbb1.setFont(f1);
ad.ins.setForeground(Color.white);
stlog1.setBackground(Color.gray);
ad.upd.l1.setFont(f1);
ad.upd.l2.setFont(f1);
ad.upd.l3.setFont(f1);
ad.upd.l4.setFont(f1);
ad.upd.l5.setFont(f1);
ad.upd.l6.setFont(f1);
ad.upd.l7.setFont(f1);
ad.upd.l8.setFont(f1);
ad.upd.cbb1.setFont(f1);
ad.upd.ta.setFont(f2);
ad.upd.tf1.setFont(f1);
ad.upd.tf2.setFont(fst);
ad.upd.tf3.setFont(fst);
ad.upd.tf4.setFont(fst);
ad.upd.tf5.setFont(fst);
ad.upd.tf6.setFont(f2);
	}
	
    
	
	     int z;//MAX
	     int ts;
		 int accuracy;
		 String oas;
	     int totaltime1;
	     int totaltime2;
		 String sd2;
		 int timetaken;
		 
		 
	/***********************Timer***********************/
	ActionListener ac=new ActionListener()
	{
	public void actionPerformed(ActionEvent Ae)
	{
			
		if(ts==0)
			{
		String name=stlog.t1.getText();
		q1.l6.setText("00");
		card.show(cn,"Result");

		gr.l6.setText(namelog);
		gr.l16.setText(oas);
		gr.l7.setText(""+attempt);
		gr.l8.setText(""+wrong);
		gr.l9.setText(""+result);
		gr.l10.setText(""+outof);
		
		accuracy=result*100;
		accuracy=accuracy/outof;
		gr.l14.setText(""+accuracy+" %");
			
		
		totaltime1=ts;
		timetaken=totaltime2-totaltime1;
		
		if(timetaken>=60)
		{
			int tr1=timetaken/60;
			int tr2=timetaken%60;
			gr.l12.setText(""+tr1+":"+tr2+" mm:ss");
			
		}
		else
		{
			gr.l12.setText("00:"+timetaken+" mm:ss");
		}
		
		result=0;
		outof=0;
		wrong=0;
		attempt=0;
		q1.b3.setVisible(false);
		q1.bg.clearSelection();
		ts=0;
		totaltime1=0;
		totaltime2=0;
		timetaken=0;
		
		
		tim.stop();
			}
			else
			{
				if(ts<=5)
				{
				q1.l6.setForeground(Color.red);	
				q1.l6.setFont(new Font("calibri",Font.BOLD,22));
				}
				else
				{
			    q1.l6.setFont(new Font("calibri",Font.BOLD,18));
				q1.l6.setForeground(Color.black);	
				}
				q1.l6.setText(""+ts+" Sec");
			    ts--;
		    }
	}	
	};
	
	Timer tim=new Timer(1000,ac);

	/***********************Timer***********************/
	
		 
	     
		 int x=0;
	     static int z0=0;
	     static int z1=0;
	     static int z2=0;
	     static int z3=0;
	     static int z4=0;
	     static int z5=0;
	     static int z6=0;
	     static int z7=0;
	     
	     int y=0;
		 int c=0;
         int nq=0;
		 int max,max2;
		 int cmax,cmax2;
		 int pmax,mmax;
		 static int p=0;
		 int result=0;
		 int outof=0;
		 int attempt=0;
		 int wrong=0;
		 
		 
		 
		String sname1=new String();
		String sroll1=new String();
	    String namelog=new String();
	    String passlog=new String();
		String sub=new String();
		String dob=new String();
		String pn=new String();
		String em=new String();
		String add=new String();
		String sd=new String();
		String statustable=new String();
 	
		/************************Mouse Listener*****************************/
		public void mouseEntered(MouseEvent me2)
		{
			if(me2.getSource()==ad.sd.jp4)
			{
				ad.sd.jp4.setBackground(Color.WHITE);
			}
			if(me2.getSource()==stlog1.dr.jp3)
			{
				stlog1.dr.l11.setForeground(Color.WHITE);
				stlog1.dr.jp3.setBackground(stlog1.dr.c1);
			}
			if(me2.getSource()==stlog1.dr.jp4)
			{
				stlog1.dr.l12.setForeground(Color.WHITE);
				stlog1.dr.jp4.setBackground(stlog1.dr.c1);
			}
			if(me2.getSource()==stlog1.dr.jp5)
			{
				stlog1.dr.l13.setForeground(Color.WHITE);
				stlog1.dr.jp5.setBackground(stlog1.dr.c1);
			}
		}
		public void mousePressed(MouseEvent me4)
		{
			if(me4.getSource()==ad.sd.jp4)
			{
				String more1=ad.sd.l7.getText();
				
				if(more1.length()>0)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						String url="jdbc:mysql://localhost:3306/exam";
						String name="root";
						String pass="root";
						Connection con=DriverManager.getConnection(url,name,pass);
						String q1="select * from sreg where ID='"+more1+"'";
						
						Statement st=con.createStatement();
						ResultSet rs=st.executeQuery(q1);
						
						if(rs.next())
						{
							String more2=rs.getString(7);
							String more3=rs.getString(8);
							String more4=rs.getString(9);
							String more5=rs.getString(3);
							
							ad.sd.l9.setText("Contact No:-");
							ad.sd.l11.setText("Email Id:-");
							ad.sd.l13.setText("Address:-");
							ad.sd.l15.setText("DOB:-");
							if(more2!=null)
							{
							ad.sd.l10.setFont(ad.sd.ft2);	
							ad.sd.l10.setForeground(Color.BLACK);		
							ad.sd.l10.setText(more2);
							}
							else
							{
							ad.sd.l10.setFont(ad.sd.ft2);	
							ad.sd.l10.setForeground(Color.RED);	
							ad.sd.l10.setText("Not Update Yet");
							}
							if(more3!=null)
							{
							ad.sd.l12.setFont(ad.sd.f3);	
							ad.sd.l12.setForeground(Color.BLUE);	
							ad.sd.l12.setText(more3);
								
							}
							else
							{
							ad.sd.l12.setFont(ad.sd.ft2);	
							ad.sd.l12.setForeground(Color.RED);	
							ad.sd.l12.setText("Not Update Yet");
							}
							if(more4!=null)
							{
							ad.sd.l14.setFont(ad.sd.ft2);	
							ad.sd.l14.setForeground(Color.BLACK);		
							ad.sd.l14.setText(more4);
								
							}
							else
							{
							ad.sd.l14.setFont(ad.sd.ft2);	
							ad.sd.l14.setForeground(Color.RED);		
							ad.sd.l14.setText("Not Update Yet");
								
							}
							if(more5!=null)
							{
							ad.sd.l16.setFont(ad.sd.ft2);	
							ad.sd.l16.setForeground(Color.BLACK);		
							ad.sd.l16.setText(more5);
								
							}
							else
							{
							ad.sd.l16.setFont(ad.sd.ft2);	
							ad.sd.l16.setForeground(Color.RED);		
							ad.sd.l16.setText("Not Update Yet");
							}
							ad.sd.jp5.setLayout(null);
		                    ad.sd.jp5.setBounds(210,180,457,200);
							ad.sd.jp5.setVisible(true);
		                    ad.sd.jp5.setBackground(Color.WHITE);
		                    ad.sd.jp1.add(ad.sd.jp5);
							
							ad.sd.jp5.add(ad.sd.l9);
							ad.sd.jp5.add(ad.sd.l10);
							ad.sd.jp5.add(ad.sd.l11);
							ad.sd.jp5.add(ad.sd.l12);
							ad.sd.jp5.add(ad.sd.l13);
							ad.sd.jp5.add(ad.sd.l14);
							ad.sd.jp5.add(ad.sd.l15);
							ad.sd.jp5.add(ad.sd.l16);
							
							
						}
						
						con.close();
						
					}
					catch(Exception e)
					{
						System.out.println(e);
					}
				}
				
				
			}
			if(me4.getSource()==stlog1.dr.jp3)
			{
				String temp1=stlog1.dr.l10.getText();
				String temp2=temp1.substring(1,8);
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q1="select * from sreg where ID='"+temp2+"'";
					
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(q1);
					
					if(rs.next())
					{
						
					stlog1.dr.l4.setText("DOB:-");
					stlog1.dr.l5.setText("Contact No.:-");
					stlog1.dr.l6.setText("Email ID:-");
					stlog1.dr.l7.setText("Address:-");	
						
						
					stlog1.dr.lf4.setText(dob);	
					stlog1.dr.lf5.setText(pn);	
					stlog1.dr.lf6.setText(em);	
					stlog1.dr.lf7.setText(add);	
					
					stlog1.dr.jp6.setLayout(null);
		            stlog1.dr.jp6.setBounds(190,70,500,500);
					stlog1.dr.jp6.setVisible(true);
		            stlog1.dr.jp6.setBackground(Color.WHITE);
		            stlog1.dr.add(stlog1.dr.jp6);
							
				
					
					stlog1.dr.jp6.add(stlog1.dr.b1);
					stlog1.dr.jp6.add(stlog1.dr.b3);
					stlog1.dr.jp6.add(stlog1.dr.l4);
					stlog1.dr.jp6.add(stlog1.dr.l5);
					stlog1.dr.jp6.add(stlog1.dr.l6);
					stlog1.dr.jp6.add(stlog1.dr.l7);
					stlog1.dr.jp6.add(stlog1.dr.lf4);
					stlog1.dr.jp6.add(stlog1.dr.lf5);
					stlog1.dr.jp6.add(stlog1.dr.lf6);
					stlog1.dr.jp6.add(stlog1.dr.lf7);
				
					
					}
					
					
				}
				catch(Exception e)
				{
					System.out.println(e);
				}
			}
			if(me4.getSource()==stlog1.dr.jp4)
			{
				String temp1=stlog1.dr.l12.getText();
			}
			if(me4.getSource()==stlog1.dr.jp5)
			{
				card.show(cn,"Home");
				stlog1.dr.jp6.setVisible(false);
				stlog1.st.x=50;
			stlog1.st.y=100;
			stlog1.st.t=120;
			stlog1.st.t1=120;
			stlog1.st.t2=120;
			stlog1.st.t3=120;
			stlog1.st.t4=120;
			stlog1.st.t5=120;
			stlog1.st.t6=120;
			stlog1.st.t7=120;
			stlog1.st.t8=120;
			stlog1.st.exist=0;
			stlog1.st.al1.clear();
			stlog1.st.al2.clear();
			stlog1.st.al3.clear();
			stlog1.st.al4.clear();
			stlog1.st.al5.clear();
			stlog1.st.al6.clear();
			stlog1.st.al7.clear();
			stlog1.st.al8.clear();
			stlog1.st.al9.clear();
			
			stlog1.st.ds1=20;
			stlog1.st.ds2=110;
			stlog1.st.ds3=170;
			stlog1.st.ds4=230;
			stlog1.st.ds5=270;
			stlog1.st.ds6=315;
			stlog1.st.ds7=410;
			stlog1.st.ds8=490;
			stlog1.st.ds9=580;
			
			stlog1.st.c=false;
			}
		}
		public void mouseClicked(MouseEvent me5)
		{
		
		}
		public void mouseExited(MouseEvent me1)
		{
			if(me1.getSource()==ad.sd.jp4)
			{
				ad.sd.jp4.setBackground(ad.sd.c4);
			}
			if(me1.getSource()==stlog1.dr.jp3)
			{
				stlog1.dr.l11.setForeground(Color.BLACK);
				stlog1.dr.jp3.setBackground(Color.WHITE);
			}
			if(me1.getSource()==stlog1.dr.jp4)
			{
				stlog1.dr.l12.setForeground(Color.BLACK);
				stlog1.dr.jp4.setBackground(Color.WHITE);
			}
			if(me1.getSource()==stlog1.dr.jp5)
			{
				stlog1.dr.l13.setForeground(Color.BLACK);
				stlog1.dr.jp5.setBackground(Color.WHITE);
			}
		}
		public void mouseReleased(MouseEvent me3)
		{
			if(me3.getSource()==adlog.l3)
			{
			card.show(cn,"Forgot");
				
			}
			if(me3.getSource()==stlog.l3)
			{
				stlog.p1.setText("");
				card.show(cn,"forgot2");
			}
		}
	
		
		
		
		
		
		
		
		/************************KeyListener Listener*****************************/
		String sdroll=new String();
		String rollst=new String();
	    Object th[]={"Subject","Attempt","Recently Attempt","Show Detail"};
				
		public void keyPressed(KeyEvent ke)
		{
			
		}
		public void keyReleased(KeyEvent ke)
		{
			
			int kc=ke.getKeyCode();
			String kt=ke.getKeyText(kc);
			if(kt.equals("Enter"))
			{
			sdroll=ad.sd.tf1.getText();
			rollst=sdroll+"reg";
				if(sdroll.length()>=5)
				{
					try
					{
						Class.forName("com.mysql.jdbc.Driver");
						String url="jdbc:mysql://localhost:3306/exam";
						String name="root";
						String pass="root";
						Connection con=DriverManager.getConnection(url,name,pass);
						String q1="select * from sreg where ID='"+sdroll+"'";
						String q2="select * from "+rollst+"";
						
					 Statement st=con.createStatement();
					 ResultSet rs=st.executeQuery(q1);
					 
					if(rs.next())
					{
						String it1=rs.getString(1);
						String it2=rs.getString(6);
						ad.sd.l5.setText(it1+" "+it2);
						ad.sd.l7.setText(sdroll);
						
			   
					}
                    else
					{
							ad.sd.l5.setText("");
							ad.sd.l7.setText("");
						ad.sd.l9.setText("");
							ad.sd.l11.setText("");
							ad.sd.l13.setText("");
							ad.sd.l15.setText("");
							ad.sd.l10.setText("");
							ad.sd.l12.setText("");
							ad.sd.l14.setText("");
							ad.sd.l16.setText("");
						ad.sd.jp1.setVisible(false);
						ad.sd.jp4.setVisible(false);
						ad.sd.jp3.setVisible(false);
					}						
				ResultSet rs2=st.executeQuery(q2);
				ArrayList <Object>al=new ArrayList<Object>();
	            TreeSet <Object>ts=new TreeSet<Object>();
				DefaultTableModel dt=new DefaultTableModel();
				if(rs2.next())
				{
				rs2.previous();
				 dt.addColumn("Subject");
				 dt.addColumn("Attempt");
				 
				while(rs2.next())
				{
				al.add(rs2.getString(1));
				ts.add(rs2.getString(1));
				}
				
				
				
				Object ob1[]=al.toArray();
				Object ob2[]=ts.toArray();
				Object ob3[]=new Object[ob2.length];
				Object ob4[]=new Object[2];
				
				
				int count=0;
				int notatt=0;
				for(int i=0;i<ob2.length;i++)
				{
					count=0;
					notatt=0;
					for(int j=0;j<ob1.length;j++)
					{
						if(ob2[i].equals(ob1[j]))
						{
							notatt=1;
							ob3[i]=++count;
						}
						else if(notatt==0)
						{
							ob3[i]=0;
						}
					}
				}
				 dt.setRowCount(0);
				for(int i=0;i<ob3.length;i++)
				{
				
					ob4[0]=ob2[i];
					ob4[1]=ob3[i];
					dt.addRow(ob4);
				}
				
				 ad.sd.t1=new JTable();
				 ad.sd.t1.setRowHeight(20);
				 ad.sd.t1.setModel(dt);
                 ad.sd.jp1.add(ad.sd.t1);
	  
	             ad.sd.sp=new JScrollPane(ad.sd.t1);
	             ad.sd.sp.setBounds(210,20,460,150);
	             ad.sd.jp1.add(ad.sd.sp);
				ad.sd.jp1.setVisible(true);
				ad.sd.l9.setText("");
							ad.sd.l11.setText("");
							ad.sd.l13.setText("");
							ad.sd.l15.setText("");
							ad.sd.l10.setText("");
							ad.sd.l12.setText("");
							ad.sd.l14.setText("");
							ad.sd.l16.setText("");
							ad.sd.jp3.setVisible(true); 
				            ad.sd.jp4.setVisible(true);
				            ad.sd.jp5.setVisible(false);
				}
				else
				{
					ad.sd.jp1.setVisible(false);
					JOptionPane.showMessageDialog(null,"Data Not Found!");
					ad.sd.l9.setText("");
						    ad.sd.l5.setText("");
							ad.sd.l7.setText("");

							ad.sd.l11.setText("");
							ad.sd.l13.setText("");
							ad.sd.l15.setText("");
							ad.sd.l10.setText("");
							ad.sd.l12.setText("");
							ad.sd.l14.setText("");
							ad.sd.l16.setText("");
						ad.sd.jp1.setVisible(false);
						ad.sd.jp3.setVisible(false);
						ad.sd.jp4.setVisible(false);
				}

					
					}
					catch(Exception e)
					{
						System.out.println(e);
						JOptionPane.showMessageDialog(null,"Student not Found with this RollNo.");
						ad.sd.l5.setText("");
						ad.sd.l7.setText("");
						ad.sd.jp1.setVisible(false);
						ad.sd.jp4.setVisible(false);
						ad.sd.jp3.setVisible(false);
					}
					
				}
				else
				{
					JOptionPane.showMessageDialog(ad.sd.jp1,"Insert Valid Roll No.");
				   ad.sd.l5.setText("");
							ad.sd.l7.setText("");
				   ad.sd.l9.setText("");
							ad.sd.l11.setText("");
							ad.sd.l13.setText("");
							ad.sd.l15.setText("");
							ad.sd.l10.setText("");
							ad.sd.l12.setText("");
							ad.sd.l14.setText("");
							ad.sd.l16.setText("");
						ad.sd.jp1.setVisible(false);
				   ad.sd.jp3.setVisible(false); 
				   ad.sd.jp4.setVisible(false); 
				}
			}
			
			
		}
		public void keyTyped(KeyEvent ke)
		{
			
		}
		
		
		
	
		
		
		/************************Focus Listener*****************************/
		public void focusGained(FocusEvent fe2)
		{
			 
			 String sf2="Enter RollNo.";
			 String sf3="Enter UserName.";
			 String sf4="Enter FullName.";
			 String sf5="Enter FirstName.";
			 String sf6="Enter LastName.";
		 if(fe2.getSource()==stlog.t1)
		 {
			String s1=stlog.t1.getText();
			if(s1.equals(sf2))
			{
				stlog.t1.setText("");
				stlog.t1.setFont(stlog.f2);
			}				
		 }			 
		
		 if(fe2.getSource()==adlog.t1)
		 {
			  String s1=adlog.t1.getText();
			if(s1.equals(sf3))
			{
				adlog.t1.setText("");
				adlog.t1.setFont(adlog.f4);
			}				
		 }
		 if(fe2.getSource()==adreg.t1)
		 {
			  String s1=adreg.t1.getText();
			if(s1.equals(sf4))
			{
				adreg.t1.setText("");
				adreg.t1.setFont(adreg.f3);
			}				
		 }
		 if(fe2.getSource()==streg.t1)
		 {
			  String s1=streg.t1.getText();
			if(s1.equals(sf5))
			{
				streg.t1.setText("");
				streg.t1.setFont(streg.f3);
			}				
		 }
		 if(fe2.getSource()==streg.t2)
		 {
			  String s1=streg.t2.getText();
			if(s1.equals(sf6))
			{
				streg.t2.setText("");
				streg.t2.setFont(streg.f3);
			}				
		 }			 
		}
		
		public void focusLost(FocusEvent fe)
		{
			 if(fe.getSource()==stlog.t1)
			 {
			 String s1=stlog.t1.getText();
			 if(s1.length()==0)
			  {
				stlog.t1.setFont(stlog.f1);
				stlog.t1.setText("Enter RollNo.");
			  } 
			 }
			 if(fe.getSource()==adlog.t1)
			 {
				 String s1=adlog.t1.getText();
			    if(s1.length()==0)
			    {
				  adlog.t1.setFont(adlog.f3);
				  adlog.t1.setText("Enter UserName.");
			    }
			 }
			 if(fe.getSource()==adreg.t1)
			 {
				 String s1=adreg.t1.getText();
			    if(s1.length()==0)
			    {
				  adreg.t1.setFont(adreg.f2);
				  adreg.t1.setText("Enter FullName.");
			    }
			 }
			 if(fe.getSource()==streg.t1)
			 {
				 String s1=streg.t1.getText();
			    if(s1.length()==0)
			    {
				  streg.t1.setFont(streg.f2);
				  streg.t1.setText("Enter FirstName.");
			    }
			 }
			 if(fe.getSource()==streg.t2)
			 {
				 String s1=streg.t2.getText();
			    if(s1.length()==0)
			    {
				  streg.t2.setFont(streg.f2);
				  streg.t2.setText("Enter LastName.");
			    }
			 }
		}
		
		
		
		/************************Change Listener*****************************/
		public void stateChanged(ChangeEvent ce)
		{
		int x=stlog1.tb.getSelectedIndex();
		int x1=ad.tb.getSelectedIndex();
		int y=stlog1.pr.cbb1.getSelectedIndex();
		String s1=""+stlog1.pr.cbb1.getItemAt(y);
		    
			stlog1.st.t=120;
			stlog1.st.t1=120;
			stlog1.st.t2=120;
			stlog1.st.t3=120;
			stlog1.st.t4=120;
			stlog1.st.t5=120;
			stlog1.st.t6=120;
			stlog1.st.t7=120;
			stlog1.st.t8=120;
			stlog1.st.ds1=20;
			stlog1.st.ds2=110;
			stlog1.st.ds3=170;
			stlog1.st.ds4=230;
			stlog1.st.ds5=270;
			stlog1.st.ds6=315;
			stlog1.st.ds7=410;
			stlog1.st.ds8=490;
			stlog1.st.ds9=580;
			
		if(x1==0&&z0==0)
		{
			
			
			try
			{
			    Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,name,pass);
			    String q="show tables";
			    Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s=new String();
				while(rs.next())
				{
					s=rs.getString(1);
					if(s.endsWith("reg"))
					{
						
					}		
					else
					{
					ad.ins.cbb1.addItem(s);
					}
					z0++;
		        }
			}
			catch(Exception ex1)
			{
				System.out.println(ex1);
			}
		}
		
		
		
		if(x1==2&&z1==0)
		{
			try
			{
			    Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,name,pass);
			    String q="show tables";
			    Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s=new String();
				while(rs.next())
				{
					s=rs.getString(1);
					if(s.endsWith("reg"))
					{
						
					}		
					else
					{
					ad.upd.cbb1.addItem(s);
					}
		        }
				z1++;
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		
		if(x1==3)
		{
			if(z2==0)
			{
				
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="show tables";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s=new String();
				while(rs.next())
				{
					s=rs.getString(1);
					if(s.endsWith("reg"))
					{
						
					}		
					else
					{
					ad.dls.cbb1.addItem(s);
					}
				}
				z2++;
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
			}
		}
		if(x==1&&z3<=0)
		{
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="show tables";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s=new String();
				while(rs.next())
				{
					s=rs.getString(1);
					if(s.endsWith("reg")||s.equals(s1))
					{
						
					}
					else
					{
					stlog1.pr.cbb1.addItem(s);
					}
					z3++;
				}
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
		}
		
		
		
		
		
		/************************Action Listener*****************************/
					 
					 

		
	public void actionPerformed(ActionEvent e)
	{
	
		
		
		if(e.getSource()==stlog1.dr.b3)
		{
			stlog1.dr.lf4.setEditable(true);
			stlog1.dr.lf5.setEditable(true);
			stlog1.dr.lf6.setEditable(true);
			stlog1.dr.lf7.setEditable(true);
			
		}
		
		if(e.getSource()==stlog1.dr.b1)
		{
			 dob=stlog1.dr.lf4.getText();
			 pn=stlog1.dr.lf5.getText();
			 em=stlog1.dr.lf6.getText();
			 add=stlog1.dr.lf7.getText();
			if(sub.length()>=1&&dob.length()>=1&&pn.length()>=1&&em.length()>=1&&add.length()>=1)
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="update sreg set DOB='"+dob+"',CN='"+pn+"',EMAIL='"+em+"',ADDRESS='"+add+"'where NAME='"+namelog+"'";
					
					Statement st=con.createStatement();
					st.executeUpdate(q);
					
		           stlog1.dr.lf4.setEditable(false);
			       stlog1.dr.lf5.setEditable(false);
			       stlog1.dr.lf6.setEditable(false);
			       stlog1.dr.lf7.setEditable(false);
					
					
					con.close();
					
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
			}
			
		}
		
		if(e.getSource()==stf.b1)
		{
			String sname=stf.t1.getText();
			String sroll=stf.t2.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				
				String q="select * from sreg where NAME='"+sname+"' AND ID='"+sroll+"'";
				
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery(q);
				rs.next();
				sname1=rs.getString(1);
				sroll1=rs.getString(5);
				String last=rs.getString(6);
				if(sname.equals(sname1)&&sroll.equals(sroll1))
				{
					card.show(cn,"StReset");
					sr.ln2.setText(sname1.toUpperCase()+" "+last.toUpperCase());
				}
				
			con.close();	
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(stf.b1,"Enter Valid Detail");
			}
		}
		if(e.getSource()==sr.b1)
		{
			String pass1=sr.t1.getText();
			String pass2=sr.t2.getText();
			if(pass1.length()>=2&&pass2.length()>=2&&pass1.equals(pass2))
			{
			try
			{
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/exam";
			 String name="root";
			 String pass="root";
			 
			 Connection con=DriverManager.getConnection(url,name,pass);
			 
			 String q="update  sreg set PASSWORD='"+pass1+"' where NAME='"+sname1+"' AND ID='"+sroll1+"'";
			 
			 Statement st=con.createStatement();
			 st.executeUpdate(q);
			 JOptionPane.showMessageDialog(sr.b1,"Password Reset Successfully");
			 card.show(cn,"stlogin");
			 con.close();
			}
			 catch(Exception ex)
			 {
				 JOptionPane.showMessageDialog(sr.b1,"Fill Valid Detail");
			 }
			}
			else
			{
			JOptionPane.showMessageDialog(sr.b1,"!!!Fill Same Password");	
			}
		}
		
		if(e.getSource()==stf.b2)
		{
			card.show(cn,"stlogin");
		}
		
		
		if(e.getSource()==rl.b1)
		{
			card.show(cn,"stlogin");
		}
		
		if(e.getSource()==rl.b2)
		{
			card.show(cn,"Home");
		}
		if(e.getSource()==gr.b1)
		{
			card.show(cn,"stlogin1");
		}
		if(e.getSource()==gr.b2)
		{
			String l1=gr.l6.getText();
			String l2=gr.l7.getText();
			String l3=gr.l8.getText();
			String l4=gr.l9.getText();
			String l5=gr.l10.getText();
			String l6=gr.l12.getText();
			String l7=gr.l14.getText();
			String l8=gr.l16.getText();
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				String q1="insert into "+statustable+"(SUB,ATT,WAN,MARK,TOTAL,TIME,ACC,DATE,STTIME)VALUES('"+l8+"','"+l2+"','"+l3+"','"+l4+"','"+l5+"','"+l6+"','"+l7+"','"+sd+"','"+sd2+"')";
				
				Statement st=con.createStatement();
				st.executeUpdate(q1);
				card.show(cn,"stlogin1");
				con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			
		}
		if(e.getSource()==hm.b3)
		{
			card.show(cn,"Forroll");
		}
		if(e.getSource()==fr.b1||e.getSource()==fr.t1)
		{
		 String name1=fr.t1.getText();
		 if(name1.length()!=0)
		 {
			 try
			 {
				 Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="select * from sreg where NAME='"+name1+"'";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				rs.next();
				String name2=rs.getString(1);
				String dob=rs.getString(3);
				String subject=rs.getString(4);
				String roll=rs.getString(5);
				card.show(cn,"Roll");
				rl.lf1.setText(name2);
				rl.lf2.setText(dob);
				rl.lf3.setText(subject);
				rl.lf4.setText(roll);
				con.close();
			 }
			 catch(Exception ep)
			 {
				 JOptionPane.showMessageDialog(fr.b1,"Enter Valid Name");
			 }
		 }
		 
		}
		
		if(e.getSource()==af.b2)
		{
			adf.t1.setText("");
			adf.cbb2.setSelectedIndex(0);
			adf.cbb3.setSelectedIndex(0);
			adf.cbb4.setSelectedIndex(0);
			card.show(cn,"adLogin");
		}
		else
		if(e.getSource()==af.b1)
		{
			String af1=af.t1.getText();
			String af2=af.t2.getText();
			String af3=adf.t1.getText();
			if(af1.equals(af2))
			{
				
			try
			{
			Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="update Areg set PASSWORD='"+af1+"' where NAME='"+af3+"'";
				Statement st=con.createStatement();
				st.executeUpdate(q);
				JOptionPane.showMessageDialog(af.b1,"Password Reset Successfull");
				con.close();
			}
			catch(Exception ex1)
			{
				
			}
			}
			else
			{
				JOptionPane.showMessageDialog(af.b1,"Enter Same Password");
			}
		}
		else
		
		if(e.getSource()==adf.b1)
		{
			String fs1=adf.t1.getText();
			String fs2=""+adf.cbb2.getItemAt(adf.cbb2.getSelectedIndex());
			String fs3=""+adf.cbb3.getItemAt(adf.cbb3.getSelectedIndex());
			String fs4=""+adf.cbb4.getItemAt(adf.cbb4.getSelectedIndex());
			String fs5=new String(fs2+"/"+fs3+"/"+fs4);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
				String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="Select * from Areg where NAME='"+fs1+"' AND DOB='"+fs5+"'";
				Statement st=con.createStatement();
				
				ResultSet rs=st.executeQuery(q);
				rs.next();
				String n=rs.getString(1);
				String d=rs.getString(3);
				String p=rs.getString(2);
				if(n.equals(fs1)&&d.equals(fs5))
				{
					card.show(cn,"AfterForgot");
				}
			}
			catch(Exception ex)
			{
				JOptionPane.showMessageDialog(adf.t1,"Enter Valid Name and DOB");
			}
		}
		else
		if(e.getSource()==stlog.b3)
		{
			card.show(cn,"Home");
			stlog.p1.setText("");
		}
		else
		if(e.getSource()==ad.dls.b1)
		{
			String s1=""+ad.dls.cbb1.getItemAt(ad.dls.cbb1.getSelectedIndex());
			if(s1.equals("Select Subject"))
			{
				JOptionPane.showMessageDialog(ad.dls.b1,"Select Subject First");
			}
			else
			{
				
			try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/exam";
			 String name="root";
			 String pass="root";
			Connection con=DriverManager.getConnection(url,name,pass);
			String q="drop table "+s1+"";
			Statement st=con.createStatement();
			st.executeUpdate(q);
			
			JOptionPane.showMessageDialog(ad.ins.tf2,"Subject Deleted");
			ad.ins.cbb1.removeAllItems();
			ad.upd.cbb1.removeAllItems();
			ad.dls.cbb1.removeItem(s1);
			stlog1.pr.cbb1.removeAllItems();
			adreg.cbb1.removeAllItems();
			streg.cbb1.removeAllItems();
			z0=0;
			z1=0;
			z3=0;
			z5=0;
			z6=0;
			con.close();
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
			}
		}
		else
		if(e.getSource()==stlog1.st.b1)
		{
			card.show(cn,"Home");
			stlog1.dr.jp6.setVisible(false);
			stlog1.st.x=50;
			stlog1.st.y=100;
			stlog1.st.t=120;
			stlog1.st.t1=120;
			stlog1.st.t2=120;
			stlog1.st.t3=120;
			stlog1.st.t4=120;
			stlog1.st.t5=120;
			stlog1.st.t6=120;
			stlog1.st.t7=120;
			stlog1.st.t8=120;
			stlog1.st.exist=0;
			stlog1.st.al1.clear();
			stlog1.st.al2.clear();
			stlog1.st.al3.clear();
			stlog1.st.al4.clear();
			stlog1.st.al5.clear();
			stlog1.st.al6.clear();
			stlog1.st.al7.clear();
			stlog1.st.al8.clear();
			stlog1.st.al9.clear();
			
			stlog1.st.ds1=20;
			stlog1.st.ds2=110;
			stlog1.st.ds3=170;
			stlog1.st.ds4=230;
			stlog1.st.ds5=270;
			stlog1.st.ds6=315;
			stlog1.st.ds7=410;
			stlog1.st.ds8=490;
			stlog1.st.ds9=580;
			
			stlog1.st.c=false;
			
		}
		else
		if(e.getSource()==ad.ins.cbb1)
		{
			String s1=""+ad.ins.cbb1.getItemAt(ad.ins.cbb1.getSelectedIndex()); 
			
			if(s1.equals("Select Subject"))
			{
				ad.ins.l9.setText("Please Choose Subject");
			    ad.ins.tf1.setText("0");

				
			}
			else
			{
				ad.ins.l9.setText("");
				try
		        {
			       Class.forName("com.mysql.jdbc.Driver");
			       String url="jdbc:mysql://localhost:3306/exam";
			       String uname="root";
			       String upass="root";
			
			       Connection con=DriverManager.getConnection(url,uname,upass);
			       String qi="select MAX(SNO) from "+s1+"";
			       Statement st=con.createStatement();
			       ResultSet rs=st.executeQuery(qi);
			       rs.next();
			       String s=new String();
			       s=rs.getString(1);
			       max2=Integer.parseInt(s);
			       max2++;
			       ad.ins.tf1.setText(""+max2);
			       con.close();
			
		        }
		         catch(Exception ex1)
		        {
		        	System.out.println(ex1);
		        }
	        }
			
        }
		else
		if(e.getSource()==adlog.b2)
		{
		    adlog.p1.setText("");
			card.show(cn,"Home");
			
		}
		else
		if(e.getSource()==streg.b2)
		{
			streg.t1.setText("");
			streg.p1.setText("");
			streg.p2.setText("");
			streg.cbb1.setSelectedItem("Select Subject");
			streg.cbb2.setSelectedItem("D");
			streg.cbb3.setSelectedItem("M");
			streg.cbb4.setSelectedItem("Year");
			card.show(cn,"stlogin");
			
		}
		else
		if(e.getSource()==adreg.b2)
		{
			card.show(cn,"admin");
		}
		else
			
		
		if(e.getSource()==stlog.b2)
		{
			card.show(cn,"streg");
			if(z5==0)
			{
				
			stlog.t1.setText("");
		    stlog.p1.setText("");
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
			       String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="show tables";
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s2=new String();
				int r=0;
				while(rs.next())
				{
					s2=rs.getString(1);
					if(s2.endsWith("reg"))
					{
						
					}
					else
					{
						streg.cbb1.addItem(s2);
					}
					
				}
				z5++;
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			}
		}
		else
		if(e.getSource()==hm.b1)
		{
			card.show(cn,"adLogin");
			
			
		}
		else
		if(e.getSource()==ad.ins.b3)
		{
			card.show(cn,"adminreg");
			if(z6==0)
			{
				
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
                String url="jdbc:mysql://localhost:3306/exam";
				String name="root";
				String pass="root";
				
				Connection con=DriverManager.getConnection(url,name,pass);
				String q="show tables";
				
				Statement st=con.createStatement();
				ResultSet rs=st.executeQuery(q);
				String s=new String();
				while(rs.next())
				{
					s=rs.getString(1);
					
					if(s.endsWith("reg"))
					{
						
					}
					else
					{
						adreg.cbb1.addItem(s);
					}
				}
					z6++;
				con.close();
				
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
			}
		}
		else
		if(e.getSource()==stlog.b1||e.getSource()==stlog.p1)
		{
			 String n=stlog.t1.getText();
			 passlog=stlog.p1.getText();
			
			try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select * from SREG where ID='"+n+"' AND PASSWORD='"+passlog+"'";
				    Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(q);
					if(rs.next())
					{
					 namelog=rs.getString(1);
					
				    String rolln=rs.getString(5);
				    String last=rs.getString(6);
				   	      String p=rs.getString(2);
					      dob=rs.getString(3);
					      sub=rs.getString(4);
					      pn=rs.getString(7);
					      em=rs.getString(8);
					      add=rs.getString(9);
						 stlog1.dr.l9.setText(namelog+" "+last);
						 stlog1.dr.l10.setText("["+rolln+"]");
						 stlog1.dr.jp1.add(stlog1.dr.l9);
						 stlog1.dr.jp1.add(stlog1.dr.l10);
				     card.show(cn,"stlogin1");
					 stlog.p1.setText("");
					 stlog1.st.l3.setText(namelog+" "+last);
					 stlog1.st.l4.setText(rolln);

					 
					 statustable=rolln+"reg";
					 
					 
					 String q1="select * from "+statustable+"";
					 ResultSet rs2=st.executeQuery(q1);
                      int bx=150;
					 while(rs2.next())
					 {
						 bx+=50;
						 stlog1.st.b1.setBounds(270,bx,100,50);
						 stlog1.st.exist=1;
						 stlog1.st.b=true;
					     String a1=rs2.getString(1);
					     String a2=rs2.getString(2);
					     String a3=rs2.getString(3);
					     String a4=rs2.getString(4);
					     String a5=rs2.getString(5);
					     String a6=rs2.getString(6);
					     String a7=rs2.getString(7);
					     String a8=rs2.getString(8);
					     String a9=rs2.getString(9);
						 stlog1.st.al1.add(""+a1);
						 stlog1.st.al2.add(""+a2);
						 stlog1.st.al3.add(""+a3);
						 stlog1.st.al4.add(""+a4);
						 stlog1.st.al5.add(""+a5);
						 stlog1.st.al6.add(""+a6);
						 stlog1.st.al7.add(""+a7);
						 stlog1.st.al8.add(""+a8);
						 stlog1.st.al9.add(""+a9);
						 
						 
						
						 stlog1.st.x+=50;
						 stlog1.st.y+=50;
					
					 }
					  
					}
					else
					{
						JOptionPane.showMessageDialog(stlog.b1,"Invalid Username or Password");
					}
					con.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
					JOptionPane.showMessageDialog(stlog.b1,"Invalid Username or Password");
				}
			
		}
		else
	if(e.getSource()==ad.ins.b2)
	{
		
		ad.ins.tf1.setText("");
		ad.ins.cbb1.setSelectedItem("Select Subject");
		ad.ins.ta.setText("");
		ad.ins.tf2.setText("");
		ad.ins.tf3.setText("");
		ad.ins.tf4.setText("");
		ad.ins.tf5.setText("");
		ad.ins.tf6.setText("");
		ad.ins.tf7.setText("");
		card.show(cn,"Home");
	}
	else
	if(e.getSource()==hm.b2)
	{
		card.show(cn,"stlogin");
		
	}
	else
	if(e.getSource()==adlog.b1||e.getSource()==adlog.p1)
	{

		
		ad.upd.tf1.setText("0");
		String s1=adlog.t1.getText();
		String s2=adlog.p1.getText();
			try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select * from AREG where NAME='"+s1+"'";
					String q2="show tables";
				    Statement st=con.createStatement();
					ResultSet rs,rs2;
					rs=st.executeQuery(q);
					rs.next();
					String n=rs.getString(1);
					String p=rs.getString(2);
					if(n.equals(s1)&&p.equals(s2))
					{
				
		             card.show(cn,"admin");
					 
					 ad.sd.jp1.setVisible(false);
					ad.sd.l9.setText("");
					ad.sd.tf1.setText("");
						    ad.sd.l5.setText("");
							ad.sd.l7.setText("");

							ad.sd.l11.setText("");
							ad.sd.l13.setText("");
							ad.sd.l15.setText("");
							ad.sd.l10.setText("");
							ad.sd.l12.setText("");
							ad.sd.l14.setText("");
							ad.sd.l16.setText("");
						ad.sd.jp1.setVisible(false);
						ad.sd.jp3.setVisible(false);
						ad.sd.jp4.setVisible(false);
					 
					 
					 ad.ins.l11.setText(""+s1);
					 ad.sd.l2.setText(""+s1);
					 ad.upd.l11.setText(""+s1);
					 ad.ads.l4.setText(""+s1);
					 ad.dls.l4.setText(""+s1);
		             adlog.p1.setText("");
                     ad.ins.tf1.setText("0");
					 if(z0==0)
					 {
						 
					rs2=st.executeQuery(q2);
					 String sb=new String();
					while(rs2.next())
					{
						sb=rs2.getString(1);
						if(sb.endsWith("reg"))
						{
							
						}
						else
						{
							ad.ins.cbb1.addItem(sb);
						}
					}
					z0++;
					 }
					 }
					 
					else
					{
						JOptionPane.showMessageDialog(adlog.b1,"Invalid Username or Password");
					}
					
					con.close();
					}
				
				catch(Exception ex)
				{
					JOptionPane.showMessageDialog(adlog.b1,"Invalid Username or Password");
				}
	}
	else
	if(e.getSource()==stlog1.pr.cbb1)
	{
		String s1=""+stlog1.pr.cbb1.getItemAt(stlog1.pr.cbb1.getSelectedIndex());
	
		if(s1.equals("Select Subject"))
		{
			stlog1.pr.l1.setText("Choose Subject First!");
		}
		else
		{
			stlog1.pr.l1.setText("");
		}
		
		
		
	}
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	/*****************Test Start****************/
	else
	if(e.getSource()==stlog1.pr.b1)
	{
	 String s1=""+stlog1.pr.cbb1.getItemAt(stlog1.pr.cbb1.getSelectedIndex());
	 
	 
	 if(s1.equals("Select Subject"))
	 {
		 
	 }
	 else
	 {
		 oas=s1;
		 card.show(cn,"question");
		 
		 
		 try
		 {
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/exam";
			 String name="root";
			 String pass="root";
			 Connection con=DriverManager.getConnection(url,name,pass);
			 String q="select * from "+s1+"";
			 String q2="select MIN(SNO) from "+s1+"";
			 String q3="select MAX(SNO) from "+s1+"";
			 String q4="select MARKS from "+s1+"";
			 Statement st=con.createStatement();
			 ResultSet rs=st.executeQuery(q);
			 rs.next();
			 
			 String s2=rs.getString(2);
			 String s3=rs.getString(3);
			 String s4=rs.getString(4);
			 String s5=rs.getString(5);
			 String s6=rs.getString(6);
			 
			 ResultSet rs1=st.executeQuery(q2);
			 rs1.next();
			 String s7=rs1.getString(1);
			  y=Integer.parseInt(s7);
			
					
					DateFormat df=new SimpleDateFormat("dd/MM/YYY");
					DateFormat df2=new SimpleDateFormat("hh:mm a");
					Date d=new Date();
					
					sd=df.format(d);
				    sd2=df2.format(d);
					
					q1.l5.setText(""+sd);
					
					
			        q1.l2.setText(""+y);
			        q1.l4.setText(""+s1);
					
			        q1.l1.setText(y+". "+s2);
			        q1.rb1.setText(""+s3);
		           	q1.rb2.setText(""+s4);
			        q1.rb3.setText(""+s5);
			        q1.rb4.setText(""+s6);
									
					
					ResultSet rs2=st.executeQuery(q3);
					rs2.next();
					String s8=rs2.getString(1);
					z=Integer.parseInt(s8);
			        q1.l3.setText(""+z);
					ts=z*10;
					totaltime2=ts;
					
					
					
					ResultSet rs3=st.executeQuery(q4);
					String outs=new String();
					int ms=0;
					while(rs3.next())
					{
					outs=rs3.getString(1);
				    ms=Integer.parseInt(outs);
					outof=outof+ms;
					}
					tim.start();
					
		 }
		 catch(Exception ex)
		 {
			 System.out.println(ex);
		 }
	 }
	}
	else
	if(e.getSource()==q1.rb1||e.getSource()==q1.rb2||e.getSource()==q1.rb3||e.getSource()==q1.rb4)
	{
		attempt++;
		String ans=e.getActionCommand();
		
	  String ss=""+stlog1.pr.cbb1.getItemAt(stlog1.pr.cbb1.getSelectedIndex());
	  try
	  {
		 Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select ANSWER from "+ss+" where SNO='"+y+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(q); 
					rs.next();
					String ans1=rs.getString(1);
					int ag=0;
					if(ans1.equals(ans))
					{
						result+=10;
					}
					else
					{
						wrong++;
					}
	  }
	  catch(Exception ex)
	  {
		  
	  }
	
	}
	if(e.getSource()==q1.b1)
	{
		if(y>=1&&y<z)
		{
			y++;
			q1.bg.clearSelection();
		String ss=""+stlog1.pr.cbb1.getItemAt(stlog1.pr.cbb1.getSelectedIndex());
		try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select * from "+ss+" where SNO='"+y+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(q);
					rs.next();
					String s2=rs.getString(2);
					String s3=rs.getString(3);
					String s4=rs.getString(4);
					String s5=rs.getString(5);
					String s6=rs.getString(6);	
					
					
					
					q1.l2.setText(""+y);
					q1.l1.setText(y+". "+s2);
			        q1.rb1.setText(""+s3);
		           	q1.rb2.setText(""+s4);
			        q1.rb3.setText(""+s5);
			        q1.rb4.setText(""+s6);
					
					if(y==z)
					{
						q1.b3.setVisible(true);
    		   	        
					}
				}
				catch(Exception e2)
				{
					System.out.println(e2);
				}
		}
	}
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
	/*****************Get Result(b3)****************/
    else	
	if(e.getSource()==q1.b3)
	{
		
		String name=stlog.t1.getText();
		
		card.show(cn,"Result");
       q1.l6.setText("00 Sec");
		gr.l6.setText(namelog);
		gr.l16.setText(oas);
		gr.l7.setText(""+attempt);
		gr.l8.setText(""+wrong);
		gr.l9.setText(""+result);
		gr.l10.setText(""+outof);
		
		accuracy=result*100;
		accuracy=accuracy/outof;
		gr.l14.setText(""+accuracy+" %");
			
		
		totaltime1=ts;
		timetaken=totaltime2-totaltime1;
		
		if(timetaken>=60)
		{
			int tr1=timetaken/60;
			int tr2=timetaken%60;
			gr.l12.setText(""+tr1+":"+tr2+" mm:ss");
			
		}
		else
		{
			gr.l12.setText("00:"+timetaken+" mm:ss");
		}
		
		result=0;
		outof=0;
		wrong=0;
		attempt=0;
		q1.b3.setVisible(false);
		
		ts=0;
		totaltime1=0;
		totaltime2=0;
		timetaken=0;
		q1.bg.clearSelection();
		
		tim.stop();
	}
	if(e.getSource()==q1.b2)
	{
		if(y>1&&y<=z)
		{
		String ss=""+stlog1.pr.cbb1.getItemAt(stlog1.pr.cbb1.getSelectedIndex());
			y--;
		try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select * from "+ss+" where SNO='"+y+"'";
					Statement st=con.createStatement();
					ResultSet rs=st.executeQuery(q);
					rs.next();
					String s2=rs.getString(2);
					String s3=rs.getString(3);
					String s4=rs.getString(4);
					String s5=rs.getString(5);
					String s6=rs.getString(6);	
					
					q1.l2.setText(""+y);
					q1.l1.setText(y+". "+s2);
			        q1.rb1.setText(""+s3);
		           	q1.rb2.setText(""+s4);
			        q1.rb3.setText(""+s5);
			        q1.rb4.setText(""+s6);
					
				}
				catch(Exception e2)
				{
					System.out.println(e2);
				}
				
		}
	}
	else
	if(e.getSource()==ad.ins.b1)
	{
		String s1=ad.ins.tf1.getText();
		int i=Integer.parseInt(s1);
		if(s1=="0")
		{
			JOptionPane.showMessageDialog(ad.ins.tf5,"Fill all field...");
		}
		else
		{
			
			
		String s2=ad.ins.ta.getText();
		String s3=ad.ins.tf2.getText();
		String s4=ad.ins.tf3.getText();
		String s5=ad.ins.tf4.getText();
		String s6=ad.ins.tf5.getText();
		String s7=ad.ins.tf6.getText();
		String s8=ad.ins.tf7.getText();
		String s9=""+ad.ins.cbb1.getItemAt(ad.ins.cbb1.getSelectedIndex()); 

		if(s1.length()>=1&&s2.length()>=1&&s3.length()>=1&&s4.length()>=1&&s5.length()>=1&&s6.length()>=1&&s7.length()>=1&&s7.length()>=1&&s8.length()>=1)
		{
			if(s9.equals("Select Subject"))
			{
				ad.ins.l9.setText("Please Choose Subject");
				ad.ins.tf1.setText("");
			}
			else
			{
				ad.ins.l9.setText("");
				
					try
		{
			 Class.forName("com.mysql.jdbc.Driver");
			 String url="jdbc:mysql://localhost:3306/exam";
			 String name="root";
			 String pass="root";
			Connection con=DriverManager.getConnection(url,name,pass);
			String q="insert into "+s9+"(SNO,QUESTION,OP1,OP2,OP3,OP4,ANSWER,MARKS)VALUES('"+s1+"','"+s2+"','"+s3+"','"+s4+"','"+s5+"','"+s6+"','"+s7+"','"+s8+"')";
			Statement st=con.createStatement();
			st.executeUpdate(q);
			
			JOptionPane.showMessageDialog(ad.ins.tf2,"Question Inserted on Serial No. "+s1);
			max++;
			i=Integer.parseInt(s1);
			i++;
	    ad.ins.tf1.setText(""+i);
		ad.ins.cbb1.setSelectedItem("");
		ad.ins.ta.setText("");
		ad.ins.tf2.setText("");
		ad.ins.tf3.setText("");
		ad.ins.tf4.setText("");
		ad.ins.tf5.setText("");
		ad.ins.tf6.setText("");
		ad.ins.tf7.setText("10");
			con.close();
			
		}
		catch(Exception e2)
		{
			System.out.println(e2);
		}
		}
		}
		else
		{
			JOptionPane.showMessageDialog(ad.ins.ta,"Filling all Field is mandatory..");
		}
		}
	}
	else
	if(e.getSource()==streg.b1)
	{
		String date="D";
		String month="M";
		String year="Year";
		String sub="Select Subject";
		String s1=streg.t1.getText();
		String s8=streg.t2.getText();
		String s2=streg.p1.getText();
		String s3=streg.p2.getText();
		String s4=""+streg.cbb1.getItemAt(streg.cbb1.getSelectedIndex());
		String s5=""+streg.cbb2.getItemAt(streg.cbb2.getSelectedIndex());
		String s6=""+streg.cbb3.getItemAt(streg.cbb3.getSelectedIndex());
		String s7=""+streg.cbb4.getItemAt(streg.cbb4.getSelectedIndex());
		if(s1.length()==0||s2.length()==0||s3.length()==0||s8.length()==0)
		{
			JOptionPane.showMessageDialog(streg.p2,"Filling all Field is mandatory..");
		}
		
		else if(s1.length()>0&&s2.length()>0&&s3.length()>0&&s8.length()>0)
		{
		   if(s2.compareTo(s3)!=0)
			{
				JOptionPane.showMessageDialog(streg.p2,"fill Same Password");
			}
			 else if(s5.equals(date)||s6.equals(month)||s7.equals(year))
			{
			JOptionPane.showMessageDialog(streg.cbb2,"Choose Birth Detail");
			}
			else if(s4.compareTo(sub)==0)
			{
				JOptionPane.showMessageDialog(streg.cbb1,"Choose Subject");
			}
			 else if(s2.equals(s3))
			{
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="insert into SREG(NAME,PASSWORD,DOB,SUBJECT,LAST)VALUES('"+s1+"','"+s2+"','"+s5+"/"+s6+"/"+s7+"','"+s4+"','"+s8+"')";
				    Statement st=con.createStatement();
					st.executeUpdate(q);
			
			JOptionPane.showMessageDialog(streg.b1,"Registration Succesfull");
			  
			  String q2="select * from sreg where NAME='"+s1+"' AND PASSWORD='"+s2+"' AND DOB='"+s5+"/"+s6+"/"+s7+"' AND SUBJECT='"+s4+"'";
			  ResultSet rs=st.executeQuery(q2);
			  
			  if(rs.next())
			  {
				String name2=rs.getString(1);
				String dob=rs.getString(3);
				String subject=rs.getString(4);
				String roll=rs.getString(5);
				card.show(cn,"Roll");
				rl.lf1.setText(name2);
				rl.lf2.setText(dob);
				rl.lf3.setText(subject);
				rl.lf4.setText(roll);
				
				
			  String q3="create table "+roll+"reg(SUB varchar(20),ATT varchar(20),WAN varchar(20),MARK varchar(20),TOTAL varchar(20),TIME varchar(20),ACC varchar(20),DATE varchar(20),STTIME varchar(20))"; 
				
				 st.executeUpdate(q3);
				
			  }
			  else
			  {
				  System.out.println("unknown");
			  }
			  
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			 streg.t1.setText("");
			 streg.p1.setText("");
			 streg.p2.setText("");
			 streg.cbb1.setSelectedItem("Select Subject");
			 streg.cbb2.setSelectedItem("D");
			 streg.cbb3.setSelectedItem("M");
			 streg.cbb4.setSelectedItem("Year");
			}
			
		}
	}
	else
	if(e.getSource()==adreg.b1)
	{
		String temp="Enter FullName.";
		String date="D";
		String month="M";
		String year="Year";
		String sub="Select Subject";
		String s1=adreg.t1.getText();
		String s2=adreg.p1.getText();
		String s3=adreg.p2.getText();
		String s4=""+adreg.cbb1.getItemAt(adreg.cbb1.getSelectedIndex());
		String s5=""+adreg.cbb2.getItemAt(adreg.cbb2.getSelectedIndex());
		String s6=""+adreg.cbb3.getItemAt(adreg.cbb3.getSelectedIndex());
		String s7=""+adreg.cbb4.getItemAt(adreg.cbb4.getSelectedIndex());
		if(s1.length()==0||s1.equals(temp)||s2.length()==0||s3.length()==0)
		{
			if(s1.length()==0||s1.equals(temp))
			{
			adreg.t1.setBorder(adreg.br5);
			}
			else
			{
			adreg.t1.setBorder(adreg.br6);
			}
			if(s2.length()==0)
			{
			adreg.p1.setBorder(adreg.br5);
			}
			else
			{
			adreg.p1.setBorder(adreg.br6);
			}
			if(s3.length()==0)
			{
			adreg.p2.setBorder(adreg.br5);
			}
			else
			{
			adreg.p2.setBorder(adreg.br6);
			}
		}
		
		else if(s1.length()>0&&s2.length()>0&&s3.length()>0)
		{
		   if(s2.compareTo(s3)!=0)
			{
				JOptionPane.showMessageDialog(adreg.p1,"fill Same Password");
				adreg.p1.setBorder(adreg.br5);
				adreg.p2.setBorder(adreg.br5);
			}
			 else if(s5.equals(date)||s6.equals(month)||s7.equals(year))
			{
				adreg.p1.setBorder(adreg.br6);
				adreg.p2.setBorder(adreg.br6);
			JOptionPane.showMessageDialog(adreg.b1,"Choose Birth Detail");
			}
			else if(s4.compareTo(sub)==0)
			{
				JOptionPane.showMessageDialog(adreg.b1,"Choose Subject");
			}
			 else if(s2.equals(s3))
			{
				
				try
				{
					Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="insert into AREG(NAME,PASSWORD,DOB,SUBJECT)VALUES('"+s1+"','"+s2+"','"+s5+"/"+s6+"/"+s7+"','"+s4+"')";
				    Statement st=con.createStatement();
					st.executeUpdate(q);
					con.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			JOptionPane.showMessageDialog(adreg.b1,"Registration Succesfull");	
			 adreg.p1.setBorder(adreg.br6);
			 adreg.p2.setBorder(adreg.br6);
             adreg.t1.setBorder(adreg.br6);
			 adreg.t1.setFont(adreg.f2);
			 adreg.t1.setText("Enter FullName.");
			 adreg.p1.setText("");
			 adreg.p2.setText("");
			 adreg.cbb1.setSelectedItem("Select Subject");
			 adreg.cbb2.setSelectedItem("D");
			 adreg.cbb3.setSelectedItem("M");
			 adreg.cbb4.setSelectedItem("Year");
			}
			
		}
		
	}
	else
	if(e.getSource()==ad.ads.b1||e.getSource()==ad.ads.b1)
	{
		String s1=ad.ads.t1.getText();
		if(s1.length()==0)
		{
			ad.ads.l2.setText("!");
		}
		else
		{
			try
			{
				    Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="create table "+s1+"(SNO INT(4),QUESTION VARCHAR(1000),OP1 VARCHAR(30),OP2 VARCHAR(30),OP3 VARCHAR(30),OP4 VARCHAR(30),ANSWER VARCHAR(30),MARKS VARCHAR(4))";
				    Statement st=con.createStatement();
					st.executeUpdate(q);
					JOptionPane.showMessageDialog(null,"Subject Added Successfully");
					ad.ads.t1.setText("");
					stlog1.pr.cbb1.removeAllItems();
					ad.dls.cbb1.removeAllItems();
					ad.ins.cbb1.removeAllItems();
					ad.upd.cbb1.removeAllItems();
					adreg.cbb1.removeAllItems();
					streg.cbb1.removeAllItems();
					z0=0;
					z1=0;
					z2=0;
					z3=0;
					z4=0;
					z5=0;
					z6=0;
					con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
	else
	if(e.getSource()==ad.upd.b2)
	{
		String s1=""+ad.upd.cbb1.getItemAt(ad.upd.cbb1.getSelectedIndex());
		if(s1.equals("Select Subject"))
		{
			JOptionPane.showMessageDialog(ad.upd.ta,"Select Subject First");
		}
		else
		{
			String sn=ad.upd.tf1.getText();
			int sn1=Integer.parseInt(sn);
			try
			{
				Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="select * from "+s1+" where SNO='"+sn+"'";
					String q1="select MAX(SNO) from "+s1+"";
				    Statement st=con.createStatement();
					ResultSet rs2=st.executeQuery(q1);
					rs2.next();
					String smax=rs2.getString(1);
					int sno=Integer.parseInt(smax);
					if(sn1<=sno&&sn1>0)
					{
					ResultSet rs=st.executeQuery(q);
					rs.next();
					String s2=rs.getString(2);
					String s3=rs.getString(3);
					String s4=rs.getString(4);
					String s5=rs.getString(5);
					String s6=rs.getString(6);
					String s7=rs.getString(7);
					String s8=rs.getString(8);
					
					ad.upd.ta.setText(""+s2);
					ad.upd.tf2.setText(""+s3);
					ad.upd.tf3.setText(""+s4);
					ad.upd.tf4.setText(""+s5);
					ad.upd.tf5.setText(""+s6);
					ad.upd.tf6.setText(""+s7);
					ad.upd.tf7.setText(""+s8);
					
					}
					else
					{
						JOptionPane.showMessageDialog(ad.upd.ta,"There are no Record found!!");
					}
					con.close();
			}
			catch(Exception ex)
			{
				System.out.println(ex);
			}
		}
	}
	else
	if(e.getSource()==ad.upd.b1)
	{
		String s=""+ad.upd.cbb1.getItemAt(ad.upd.cbb1.getSelectedIndex());
		String s1=ad.upd.tf1.getText();
		String s2=ad.upd.ta.getText();
		String s3=ad.upd.tf2.getText();
		String s4=ad.upd.tf3.getText();
		String s5=ad.upd.tf4.getText();
		String s6=ad.upd.tf5.getText();
		String s7=ad.upd.tf6.getText();
		String s8=ad.upd.tf7.getText();
		
		
		if(s1.length()>0&&s2.length()>0&&s3.length()>0&&s4.length()>0&&s5.length()>0&&s6.length()>0&&s7.length()>0&&s8.length()>0)
		{
			if(s.equals("Select Subject"))
			{
			}
			else
			{
				try
			{
				Class.forName("com.mysql.jdbc.Driver");
					String url="jdbc:mysql://localhost:3306/exam";
					String name="root";
					String pass="root";
					Connection con=DriverManager.getConnection(url,name,pass);
					String q="update "+s+" set SNO='"+s1+"',QUESTION='"+s2+"',OP1='"+s3+"',OP2='"+s4+"',OP3='"+s5+"',OP4='"+s6+"',ANSWER='"+s7+"',MARKS='"+s8+"'where SNO='"+s1+"'";
				    Statement st=con.createStatement();
					st.executeUpdate(q);
					JOptionPane.showMessageDialog(ad.upd.ta,"Question Updated");
					
					ad.upd.ta.setText("");
					ad.upd.tf2.setText("");
					ad.upd.tf3.setText("");
					ad.upd.tf4.setText("");
					ad.upd.tf5.setText("");
					ad.upd.tf6.setText("");
					ad.upd.tf7.setText("");
					
					con.close();
					}
					catch(Exception ex)
			{
				System.out.println(ex);
			}
			}
			
			}
		else
		{
			JOptionPane.showMessageDialog(ad.upd.ta,"Filling all the Field");
			
		}
	}		
		/************************Action Listener*****************************/
 }

}

class Demo1
{
public static void main(String []ar)
{
FDemo f=new FDemo();
f.setVisible(true);
f.setBounds(100,100,700,600);
f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
}
}