import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
  
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.event.MouseInputAdapter;
  
 
public class Hyperlink extends JButton {
 
private Color focusColor = Color.blue;
 
public Hyperlink(String text) {
super(text);
setBorderPainted(false);
setContentAreaFilled(false);
setFocusPainted(false);
setOpaque(false);
addMouseListener(new RolloverListener());
}
 
public void setFocusColor(Color focusColor) {
this.focusColor = focusColor;
}
 
public Color getFocusColor() {
return focusColor;
}
 
private final class RolloverListener extends MouseInputAdapter {
  
private Color origColor;
 
public void mouseEntered(MouseEvent e) {
origColor = getForeground();
setForeground(focusColor);
}
  
public void mouseExited(MouseEvent e) {
if (getForeground() == focusColor) {
setForeground(origColor);
}
}
}
 
 
public static void main(String[] args) {
JFrame f = new JFrame();
f.getContentPane().setLayout(new FlowLayout());
JButton hyperlink = new Hyperlink("link");
f.getContentPane().add(hyperlink);
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
f.setSize(300, 300);
f.setLocationRelativeTo(null);
f.setVisible(true);
}
}