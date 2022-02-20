import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.plaf.ColorUIResource;
public class Main extends JFrame {
  JTabbedPane tab=new JTabbedPane();
  public Main() {
     setSize(300,300);
     setTitle("Test Tab pane");
     tab.add("First",new myPanel("First"));
     tab.add("Second",new myPanel("Second"));
     tab.add("Third",new myPanel("Third"));
     tab.add("Fourth",new myPanel("Fourth"));
     tab.addChangeListener(new ChangeTab());
     getContentPane().add(tab,BorderLayout.CENTER);
     setVisible(true);
     for(int i=0;i<tab.getTabCount();i++){
          if(i != tab.getSelectedIndex())
            tab.setBackgroundAt(i,Color.orange);
            tab.setForeground(Color.BLACK);
     }
     tab.setOpaque(true);
     UIManager.put("TabbedPane.contentAreaColor ",ColorUIResource.GREEN);
     UIManager.put("TabbedPane.selected",ColorUIResource.GREEN);
     UIManager.put("TabbedPane.background",ColorUIResource.GREEN);
     UIManager.put("TabbedPane.shadow",ColorUIResource.GREEN);
  }

  public static void main(String[] args) {
    Main main = new Main();
  }

  class ChangeTab implements ChangeListener{
    public void stateChanged(ChangeEvent e){
        tab.validate();
        System.out.println(tab.getSelectedIndex());
        for(int i=0;i<tab.getTabCount();i++){
          if(i != tab.getSelectedIndex())
            tab.setBackgroundAt(i,Color.orange);
        }

    }
  }

  class myPanel extends JPanel{
    public myPanel(String str){
       add(new JLabel(str));
    }
  }

}