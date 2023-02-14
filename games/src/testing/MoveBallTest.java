package testing;
import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
public class MoveBallTest extends JFrame {
	public static final int PANEL_WIDTH = 2000;
	public static final int PANEL_HEIGHT = 1200;
	public static final Color FIXED_COLOR = Color.YELLOW;
	public static final int speed = 20;
	public DrawPanel p =  new DrawPanel();
	public  static String testme = "";
	public  String testme2;
	public static void main(String[] args) {
		MoveBallTest f = new MoveBallTest();
		f.start();
		String testyou;
		MoveBallTest.testme("4");
		
	}
	public static void testme(final String testme){
		MoveBallTest.testme = testme;
	}
	@Override
	public Dimension getPreferredSize() {
	
		return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
	}
	public MoveBallTest() {
		super("Move Ball");
	    add(p);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.pack();
	    this.setVisible(true);
	}
	public void keyPressed(KeyEvent e) {
	    int keyCode = e.getKeyCode();
	    switch( keyCode ) { 
	        case KeyEvent.VK_UP:
	            	System.out.println("done");
	            break;
	        case KeyEvent.VK_DOWN:
	            // handle down 
	            break;
	        case KeyEvent.VK_LEFT:
	            // handle left
	            break;
	        case KeyEvent.VK_RIGHT :
	            // handle right
	            break;
	     }
	} 
	public void start() {
		int x = 0;
		int y = 0;
		boolean togglex = true;
		boolean toggley = true;
		while(true) {
			p.x = x;
			p.y = y;
			p.repaint();
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=this.getSize().width;
			int h=this.getSize().height;
			if(x==0 || togglex){
				x += speed;
				togglex = true;
			}
			if(x==w-60 || !togglex){
				x += -speed;
				togglex = false;
			}
			if(y==0 || toggley){
				y += speed;
				toggley = true;
			}
			if(y==h-60 || !toggley){
				y += -speed;
				toggley = false;
			}
			try {
				Thread.sleep(2);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		} 
	}
}
	
class DrawPanel extends JPanel {

	
	public int x;
	public int y;

	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.setColor(MoveBallTest.FIXED_COLOR);
		g.fillOval(x, y, 30, 30);
		g.setColor(Color.BLACK);
		g.fillRect(15, 75, 30, 100);
	}
}