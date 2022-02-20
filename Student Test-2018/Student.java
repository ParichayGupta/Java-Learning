import javax.swing.*;
import java.awt.*;
class Student extends JPanel
{
 JButton b1;
 Student(FDemo f)
 {
  b1=new JButton("Start");
  add(b1);
  b1.addActionListener(f);
 }
 
}