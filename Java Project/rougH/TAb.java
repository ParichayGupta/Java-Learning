import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Label;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

public class TAb {

	private static void createAndShowGUI() {

		// Create and set up the window.
		final JFrame frame = new JFrame("Tabbed Pane Example");

		// Display the window.
		frame.setSize(400, 300);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// set grid layout for the frame
		frame.getContentPane().setLayout(new GridLayout(1, 1));

		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);

		// set the foreground color of this component (all tabs)
		tabbedPane.setForeground(Color.green);

		// set the background color of this component (all tabs)
		tabbedPane.setBackground(Color.red);

		tabbedPane.addTab("Tab1", makePanel("This is tab 1"));
		tabbedPane.addTab("Tab2", makePanel("This is tab 2"));
		tabbedPane.addTab("Tab3", makePanel("This is tab 3"));
		tabbedPane.addTab("Tab4", makePanel("This is tab 4"));

		frame.getContentPane().add(tabbedPane);

		int index = 2; // third tab

		// set foreground color for the specified tab
		tabbedPane.setForegroundAt(index, Color.yellow);

		// set background color for the specified tab
		tabbedPane.setBackgroundAt(index, Color.black);

	}

	private static JPanel makePanel(String text) {
		JPanel p = new JPanel();
		p.add(new Label(text));
		p.setLayout(new GridLayout(1, 1));
		return p;
	}

	public static void main(String[] args) {

  //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.

  javax.swing.SwingUtilities.invokeLater(new Runnable() {

public void run() {

    createAndShowGUI(); 

}

  });
    }

}