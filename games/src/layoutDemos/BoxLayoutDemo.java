package layoutDemos;

import java.awt.*;
import javax.swing.*;

public class BoxLayoutDemo extends JFrame {
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BoxLayoutDemo();
      }
    });
  }
  
  public BoxLayoutDemo() {
    super("Box Layout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container pane = this.getContentPane();
    pane.setLayout(new BoxLayout(pane, BoxLayout.Y_AXIS));
    
    addButton("Button 1", pane);
    addButton("Button 2", pane);
    addButton("Button 3", pane);
    addButton("Button 4", pane);
    addButton("Long-Named Button 4", pane);
    addButton("5", pane);

    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
  
  public void addButton(String name, Container cntnr) {
    JButton btn = new JButton(name);
    btn.setAlignmentX(Component.CENTER_ALIGNMENT);
    cntnr.add(btn);
  }
}
