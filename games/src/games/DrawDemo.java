package games;
import javax.swing.*;

import java.awt.*;


public class DrawDemo extends JFrame {
  
  public DrawDemo() {
    super("Draw Demo");
    
    this.add(new DrawPanel());
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }
  
  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DrawDemo();
      }
    });
  }
}

class DrawPanel extends JPanel {
  public static final int PANEL_WIDTH = 400;
  public static final int PANEL_HEIGHT = 600;
  
  String s = "Using drawString!";
  char[] c = {'c', 'h', 'a', 'r', 's', ' ', '8'};
  byte[] b = {'b', 'y', 't', 'e', '1', '2', '3'};
  
  public DrawPanel() {
    //setBorder(BorderFactory.createLineBorder(Color.black));
      setBorder(BorderFactory.createLoweredBevelBorder());
  }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    
    // draw a line
    g.drawLine(10, 30, 200, 40);

    // draw a rectangle
    g.drawRect(10, 50, 100, 50);
    // draw a filled rectangle
    Color c1 = new Color(245,33,123);
    g.setColor(c1);
    // draw a rounded rectangle
    g.drawRoundRect(10, 120, 50, 50, 10, 20);
    // draw a filled rounded rectangle
    g.fillRoundRect(80, 120, 50, 50, 40, 20);
    // draw a ellipse
    g.drawRoundRect(150, 130, 80, 20, 70, 70);
    // draw a filled square
    g.drawRoundRect(250, 120, 50, 50, 0, 0);
    // draw a circle
    g.drawRoundRect(330, 120, 50, 50, 50, 50);

    g.setColor(Color.yellow);
    // draw a raised 3D rectangle
    g.draw3DRect(10, 190, 50, 50, true);
    // draw a sunk 3D rectangle
    g.draw3DRect(100, 190, 50, 50, false);
    // draw a filled raised 3D rectangle
    g.fill3DRect(200, 190, 50, 50, true);
    // draw a filled sunk 3D rectangle
    g.fill3DRect(300, 190, 50, 50, false);

    g.setColor(Color.black);
    // draw an oval
    g.drawOval(10, 260, 70, 50);
    // draw an filled oval
    g.fillOval(200, 260, 50, 70);

    // draw an arc
    g.drawArc(10, 350, 60, 60, 0, 180);
    // draw solid arc
    g.fillArc(100, 350, 50, 60, 0, 270);
    g.fillArc(200, 350, 50, 60, 0, -110);
    g.fillArc(300, 350, 40, 60, 0, -360);

    // draw a polygon
    int[] xPoints1 = {10, 30, 40, 20, 10, 5, 10};
    int[] yPoints1 = {430, 430, 440, 460, 460, 440, 430};
    g.drawPolygon(xPoints1, yPoints1, 7);
    // draw a filled polygon
    int[] xPoints2 = {100, 120, 130, 110, 100, 95, 90, 100};
    int[] yPoints2 = {430, 430, 440, 460, 460, 440, 420, 430};
    g.fillPolygon(xPoints2, yPoints2, 8);
    
    g.setColor(Color.BLACK);
    g.drawString(s, 30, 520);
    g.drawChars(c, 0, c.length, 30, 540);
    g.drawBytes(b, 0, b.length, 30, 560);
  }
}
