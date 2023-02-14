package layoutDemos;

import javax.swing.*;

import java.awt.*;

public class GridLayoutDemo extends JFrame {

  public GridLayoutDemo() {
    super("Grid Layout Demo");
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    Container pane = this.getContentPane();
    pane.setLayout(new GridLayout(3, 2));

    JButton b1 = new JButton("1");
    JButton b2 = new JButton("2");
    JButton b3 = new JButton("3");
    JButton b4 = new JButton("4");
    JButton b5 = new JButton("5");
    JButton b6 = new JButton("6");
    JButton b7 = new JButton("7");
    JButton b8 = new JButton("8");
    JButton b9 = new JButton("9");
    add(b1);
    add(b2);
    add(b3);
    add(b4);
    add(b5);
    add(b6);
    add(b7);
    add(b8);
    add(b9);
    this.setSize(300, 200);
    this.setLocationRelativeTo(null);
    this.setVisible(true);
  }

  public static void main(String args[]) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GridLayoutDemo();
      }
    });
  }
}