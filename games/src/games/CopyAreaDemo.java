package games;

import javax.swing.*;

import java.awt.*;
import java.awt.geom.*;

public class CopyAreaDemo extends JFrame {

  public CopyAreaDemo() {
    super("Copy Area Demo");
    
    add(new CopyAreaPanel());
    
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    pack();
    setVisible(true);
  }
  
  public static void main(String[] argss) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new CopyAreaDemo();
      }
    });
  }

}//end class CopyAreaDemo
class CopyAreaPanel extends JPanel {
  public static final int PANEL_WIDTH = 300;
  public static final int PANEL_HEIGHT = 200;
  int x = 200;
  int y = 250;
  int width = 50;
  int height = 50;
  int dx = 1;
  int dy = 1;
  public CopyAreaPanel() {
    setBorder(BorderFactory.createLineBorder(Color.black));
  }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
  }
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawRect(20, 10, 50, 50);
    for(int i = 0; i<150; i++){
    	dx++;
    	dy++;
        g.copyArea(0, 0, 300, 300, dx, dy);
    }

  }
}//end class MyPanel
