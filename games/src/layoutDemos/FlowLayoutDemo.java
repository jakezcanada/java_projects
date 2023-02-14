package layoutDemos;
import java.awt.*;
import javax.swing.*;

public class FlowLayoutDemo extends JFrame {
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new FlowLayoutDemo();
      }
    });
  }
  
  public FlowLayoutDemo() {
    super("Flow Layout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    Container pane = this.getContentPane();
    pane.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));
    
    JButton btnNewButton = new JButton("Button 1");
    getContentPane().add(btnNewButton);
    
    JButton btnNewButton_1 = new JButton("Button 2");
    getContentPane().add(btnNewButton_1);
    
    JButton btnNewButton_2 = new JButton("Button 3");
    getContentPane().add(btnNewButton_2);
    
    JButton btnNewButton_3 = new JButton("Button 4");
    getContentPane().add(btnNewButton_3);
    
    JButton btnNewButton_4 = new JButton("Button 5");
    getContentPane().add(btnNewButton_4);
    
    JButton btnNewButton_5 = new JButton("Button 6");
    getContentPane().add(btnNewButton_5);
    
    JButton btnNewButton_6 = new JButton("Button 7");
    getContentPane().add(btnNewButton_6);
    
    JButton btnNewButton_7 = new JButton("Button 8");
    getContentPane().add(btnNewButton_7);
    
    JButton btnNewButton_8 = new JButton("Button 9");
    getContentPane().add(btnNewButton_8);
    
    this.pack();
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }
}
