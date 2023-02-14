package layoutDemos;

import javax.swing.*;

import java.awt.*;

public class DrawImageDemo extends JFrame {
  
  public DrawImageDemo() {
    super("Draw Image Demo");
    
    this.add(new DrawImagePanel());
    
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.pack();
    this.setVisible(true);
  }

  public static void main(String args[]) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new DrawImageDemo();
      }
    });
  }
}//end class DrawImageDemo

class DrawImagePanel extends JPanel {
  public static final int PANEL_WIDTH = 300;
  public static final int PANEL_HEIGHT = 200;
  
  Insets insets;
  Image img;
  int width, height;
  
  public DrawImagePanel() {
    setBorder(BorderFactory.createLineBorder(Color.black));
    
    MediaTracker tracker = new MediaTracker(this);
    img = Toolkit.getDefaultToolkit().getImage("img/tiger.gif");

    try {
      tracker.addImage(img, 0);
      tracker.waitForID(0);
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

    width = img.getWidth(this);
    height = img.getHeight(this);
  }
  
  @Override
  public Dimension getPreferredSize() {
    return new Dimension(width + insets.left, height + insets.top);
  }
  
  @Override
  public void addNotify() {
    super.addNotify();
    insets = getInsets();
    setBounds(0, 0, width + insets.left, height + insets.top);
  }
  
  @Override
  public void paintComponent(Graphics g) {
    super.paintComponent(g);
    g.drawImage(img, insets.left, insets.top, this);
    System.out.println("drawing image...");
    System.out.println(g.drawImage(img, insets.left, insets.top, this));
  }
  
}
