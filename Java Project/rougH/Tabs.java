import javax.swing.JFrame;

import javax.swing.JLabel;

import javax.swing.JTabbedPane;

import javax.swing.JPanel;

import javax.swing.SwingUtilities;

import javax.swing.UIManager;

import java.awt.BorderLayout;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import java.awt.event.KeyEvent;

import javax.swing.JButton;

import java.util.Random;
public class Tabs extends JPanel implements ActionListener {
    public Tabs() {


        JTabbedPane tabbedPane = new JTabbedPane();
        tabbedPane.addTab("LLP", null, new ButtonsPanel(),"Does Nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_1);
 

        tabbedPane.addTab("POS", null, new ButtonsPanel(), "Does Nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_2);
        tabbedPane.addTab("Test", null, new ButtonsPanel(), "Does Nothing");
        tabbedPane.setMnemonicAt(0, KeyEvent.VK_3);
        add(tabbedPane);
        tabbedPane.setTabLayoutPolicy(JTabbedPane.SCROLL_TAB_LAYOUT);

    }
    private static void createAndShowGUI() {
        JFrame frame = new JFrame("RBA Test Application");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new Tabs(), BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {

 

          public void run() {

                UIManager.put("swing.boldMetal", Boolean.FALSE);

 

                createAndShowGUI();

 

            }

        });

 
    }

 
  
    @Override

    public void actionPerformed(ActionEvent arg0) {

  

    }

 

    class ButtonsPanel extends JPanel {

 

          

        ButtonsPanel() {

            add(new JButton("Initialize"));

           add(new JButton("Connect"));

            add(new JButton("Disconnect"));

            add(new JButton("Shut Down"));

            add(new JButton("Port Settings"));

        }

    }

}
