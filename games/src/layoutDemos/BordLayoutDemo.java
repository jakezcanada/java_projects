package layoutDemos;

import java.awt.*;
import javax.swing.*;

public class BordLayoutDemo extends JFrame {
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new BordLayoutDemo();
      }
    });
  }
  
  public BordLayoutDemo() {
    super("Border Layout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container pane = this.getContentPane();
    pane.setLayout(new BorderLayout(0, 0));
    
    JButton btnNorth = new JButton("North");
    JButton btnSouth = new JButton("South");
    JButton btnEast = new JButton("East");
    JButton btnWest = new JButton("West");
    JButton btnCenter = new JButton("Center");
    getContentPane().add(btnNorth, BorderLayout.NORTH);
    getContentPane().add(btnSouth, BorderLayout.SOUTH);
    getContentPane().add(btnEast, BorderLayout.EAST);
    getContentPane().add(btnWest, BorderLayout.WEST);
    getContentPane().add(btnCenter, BorderLayout.CENTER);
    
    this.setSize(400, 200);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
