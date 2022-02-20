import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class testTabbedPane extends JFrame
{
JTabbedPane tabPane;
JPanel indexPanel, thesPanel,classPanel,confPanel,gramPanel;
Color color1 = new Color(20,83,162);
Color colorTab= new Color(69,92,159);
public testTabbedPane()
{
tabPane=new JTabbedPane();
tabPane.setBackground(colorTab);
//UIManager.put("tabPane.selected", Color.black);
indexPanel= new JPanel();
thesPanel= new JPanel();
classPanel= new JPanel();
confPanel = new JPanel();
gramPanel = new JPanel();
indexPanel.setBackground(color1);
thesPanel.setBackground(color1);
classPanel.setBackground(color1);
confPanel.setBackground(color1);
gramPanel.setBackground(color1);
Icon indexIcon= new ImageIcon("index.gif");
Icon thesisIcon= new ImageIcon("thesis.gif");
Icon classIcon= new ImageIcon("class.gif");
Icon confIcon= new ImageIcon("conf.gif");
Icon gramerIcon= new ImageIcon("gramer.gif");
tabPane.addTab("Index",indexIcon,indexPanel);
tabPane.addTab("Thesas",thesisIcon,thesPanel);
tabPane.addTab("Class",classIcon,classPanel);
tabPane.addTab("Confugration",confIcon,confPanel);
tabPane.addTab("Grammer",gramerIcon,gramPanel);
Container cont= getContentPane();    
cont.add(tabPane,BorderLayout.CENTER);

addWindowListener(new WindowAdapter(){
public void windowClosing(WindowEvent e){
System.exit(0);
}});
setSize(200,300);
show();
}
public static void main(String[] s)    
{
new testTabbedPane();
}
}