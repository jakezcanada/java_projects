package layoutDemos;

import javax.swing.*;

import java.awt.*;

public class GridBagLayoutDemo extends JFrame {

  public static void main(String[] args) {
    EventQueue.invokeLater(new Runnable() {
      public void run() {
        new GridBagLayoutDemo();
      }
    });
  }

  public GridBagLayoutDemo() {
    super("Grid Bag Layout Demo I");
    this.setLayout(new GridBagLayout());
    addGridBagPanes();
    pack();
    setLocationRelativeTo(null);
    setVisible(true);
  }

  private void addGridBagPanes() {
    //top panel
    JPanel panel1 = new JPanel();
    panel1.setBackground(Color.green);
    this.add(panel1, new GBC(0, 0, 2, 1).setFill(GBC.BOTH).setIpad(200, 10).setWeight(100, 100));
    //left panel
    JPanel panel2 = new JPanel();
    panel2.setBackground(Color.YELLOW);
    this.add(panel2, new GBC(0, 1, 1, 2).setFill(GBC.BOTH).setIpad(70, 100).setWeight(10, 100));
    //right panel
    JPanel panel3 = new JPanel();
    panel3.setBackground(Color.WHITE);
    this.add(panel3, new GBC(1, 1).setFill(GBC.BOTH).setIpad(130, 100).setWeight(100, 100));
    //second bottom panel
    JPanel panel4 = new JPanel();
    panel4.setBackground(Color.LIGHT_GRAY);
    this.add(panel4, new GBC(1, 2, 2, 1).setFill(GBC.BOTH).setIpad(200, 50).setWeight(100, 10));
    //first bottom panel
    JPanel panel5 = new JPanel();
    panel5.setBackground(Color.CYAN);
    this.add(panel5, new GBC(0, 3, 2, 1).setFill(GBC.BOTH).setIpad(200, 20).setWeight(100, 10));
  }
}// end class GridBagLayoutDemo1

/**
 * GBC Class
 */
class GBC extends GridBagConstraints {
  //Init top left position
  public GBC(int gridx, int gridy) {
    this.gridx = gridx;
    this.gridy = gridy;
  }

  //Init top left position size
  public GBC(int gridx, int gridy, int gridwidth, int gridheight) {
    this.gridx = gridx;
    this.gridy = gridy;
    this.gridwidth = gridwidth;
    this.gridheight = gridheight;
  }

  //set anchor side
  public GBC setAnchor(int anchor) {
    this.anchor = anchor;
    return this;
  }

  //set fill mode
  public GBC setFill(int fill) {
    this.fill = fill;
    return this;
  }

  //set resizing weight
  public GBC setWeight(double weightx, double weighty) {
    this.weightx = weightx;
    this.weighty = weighty;
    return this;
  }

  //set extenal fill gap
  public GBC setInsets(int gap) {
    this.insets = new Insets(gap, gap, gap, gap);
    return this;
  }

  //set extenal fill gap
  public GBC setInsets(int top, int left, int bottom, int right) {
    this.insets = new Insets(top, left, bottom, right);
    return this;
  }

  //set internal size
  public GBC setIpad(int ipadx, int ipady) {
    this.ipadx = ipadx;
    this.ipady = ipady;
    return this;
  }
}// end class GBC
