package games;

import javax.swing.*;

import java.awt.*;

public class ColorDemo extends JFrame {
  int red = 203;
  int green = 100;
  int blue = 100;
  
  public ColorDemo() {
    super("Draw Demo");
    setSize(300, 100);
    setVisible(true);
  }
  
  @Override
  public void paint(Graphics g) {
    super.paint(g);
    
    g.setColor(new Color(red, green, blue));
    g.drawString("Draw color string.", 50, 40);

    Color color = g.getColor();
    g.drawString("Red:" + color.getRed(), 10, 70);
    g.drawString("Green:" + color.getGreen(), 100, 70);
    g.drawString("Blue:" + color.getBlue(), 200, 70);
  }

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new ColorDemo();
      }
    });
  }
}
