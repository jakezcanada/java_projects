package games2;
import java.awt.*;
import java.awt.event.*;
import java.util.logging.Level;
import java.util.logging.Logger;


import javax.swing.*;

import org.jnativehook.GlobalScreen;
import org.jnativehook.keyboard.NativeKeyEvent;
import org.jnativehook.keyboard.NativeKeyListener;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;


public class Pong extends JFrame implements NativeMouseInputListener, NativeKeyListener,Runnable{
	public static final int PANEL_WIDTH = 400;
	public static final int PANEL_HEIGHT = 300;
	static boolean PLAYER_1_UP = false;
	static boolean PLAYER_1_DOWN = false;
	static boolean PLAYER_2_UP = false;
	static boolean PLAYER_2_DOWN = false;
	public DrawPanel p =  new DrawPanel();
	
	public static void main(String[] args) {
		
		Logger logger = Logger.getLogger(GlobalScreen.class.getPackage().getName());
		logger.setLevel(Level.OFF);
		
		Pong f = new Pong();
		try{
			GlobalScreen.registerNativeHook();
			// Construct the example object.

			// Add the appropriate listeners
			GlobalScreen.addNativeKeyListener(f);
			GlobalScreen.addNativeMouseListener(f);
			GlobalScreen.addNativeMouseMotionListener(f);
			
		}catch(Exception e){
			System.out.println("ERROR=   "+e.getMessage());
		}
		
		
		Pedal p = new Pedal(f.p, f);
		Pedal2 p2 = new Pedal2(f.p, f);
		Ball b = new Ball(f.p, f);
		Thread pThread=new Thread(p);
		pThread.start();
		Thread bThread=new Thread(b);
		bThread.start();
		Thread p2Thread=new Thread(p2);
		p2Thread.start();
		
	}
	
	@Override
	public Dimension getPreferredSize() {
		return new Dimension(PANEL_WIDTH, PANEL_HEIGHT);
	}
	public Pong() {
		super("Move Ball");
	    this.add(p);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.pack();
	    this.setVisible(true);
	}
	public void startPaddleOne() {
		int x = 0;
		int y1 = 0;
		boolean togglex = true;
		boolean toggley = true;
		while(true) {
			System.out.println(PLAYER_1_UP);
			System.out.println(PLAYER_1_DOWN);
			System.out.println(PLAYER_2_UP);
			System.out.println(PLAYER_2_DOWN);
			p.pedal1y = y1;
			p.repaint();
			if(PLAYER_1_UP){
				y1 = y1 + 100;
			}
			if(PLAYER_1_DOWN){
				y1 = y1 - 100;
			}
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=this.getSize().width;
			int h=this.getSize().height;
		} 
	}
	public void keyPressed(int keyCode) {
		int x = 0;
		int y = 0;
	    //int keyCode = e.getKeyCode();
		p.ballX = x;
		p.ballY = y;
		p.repaint();
	    switch( keyCode ) { 
	        case 38:
	            System.out.println("doen");
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
	public void startBall() {
		int x = 0;
		int y = 0;
		boolean togglex = true;
		boolean toggley = true;
		while(true) {
			p.ballX = x;
			p.ballY = y;
			p.repaint();
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=this.getSize().width;
			int h=this.getSize().height;
			if(x==0 || togglex){ 
				x += 1;
				togglex = true;
			}
			if(x==w-60 || !togglex){
				x += -1;
				togglex = false;
			}
			if(y==0 || toggley){
				y += 1;
				toggley = true;
			}
			if(y==h-60 || !toggley){
				y += -1;
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

	@Override
	public void nativeMouseClicked(NativeMouseEvent arg0) {
		//System.out.println("nativeMouseClicked");
		Point p = MouseInfo.getPointerInfo().getLocation();
		int x = p.x;
		int y = p.y;
		System.out.println(x + "  " + y);
	}

	@Override
	public void nativeMousePressed(NativeMouseEvent arg0) {
		//System.out.println("nativeMousePressed");
		
	}

	@Override
	public void nativeMouseReleased(NativeMouseEvent arg0) {
		//System.out.println("nativeMouseReleased");
		
	}

	@Override
	public void nativeMouseDragged(NativeMouseEvent arg0) {
		//System.out.println("nativeMouseDragged");
		
	}

	@Override
	public void nativeMouseMoved(NativeMouseEvent arg0) {

	}

	@Override
	public void nativeKeyPressed(NativeKeyEvent arg0) {
		//keyPressed(arg0.getKeyCode());
		//System.out.println(arg0.getKeyCode());
		if(arg0.getKeyCode()==57424){
			PLAYER_2_UP = true;
		}
		if(arg0.getKeyCode()==57416){
			PLAYER_2_DOWN = true;
		}
		if(arg0.getKeyCode()==17){
			PLAYER_1_DOWN = true;
		}
		if(arg0.getKeyCode()==31){
			PLAYER_1_UP = true;
		}
	}

	@Override
	public void nativeKeyReleased(NativeKeyEvent arg0) {
		if(arg0.getKeyCode()==57424){
			//System.out.println("KeyEvent.VK_DOWN");
			PLAYER_2_UP = false;
		}
		if(arg0.getKeyCode()==57416){
			//System.out.println("KeyEvent.VK_UP");
			PLAYER_2_DOWN = false;
		}
		if(arg0.getKeyCode()==17){
			//System.out.println("KeyEvent.VK_DOWN");
			PLAYER_1_DOWN = false;
		}
		if(arg0.getKeyCode()==31){
			//System.out.println("KeyEvent.VK_UP");
			PLAYER_1_UP = false;
		}
	}

	@Override
	public void nativeKeyTyped(NativeKeyEvent arg0) {
		//System.out.println("nativeKeyTyped");
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}
}
class Pedal implements Runnable{
	public DrawPanel p =  new DrawPanel();
	JFrame frame = new JFrame();
	public Pedal(DrawPanel p, JFrame frame){
		this.p = p;
		this.frame = frame;
	}
	public void startPaddleOne() {
		int y1 = 150;
		boolean togglex = true;
		boolean toggley = true;
		while(true) {
			p.pedal1y = y1;
			p.repaint();
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=frame.getSize().width;
			int h=frame.getSize().height;
			if(Pong.PLAYER_1_UP && y1 < h-135){
				y1 = y1 + 1;
			}
			if(Pong.PLAYER_1_DOWN && y1 >= 0){
				y1 = y1 - 1;
			}
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
	

	@Override
	public void run() {
		startPaddleOne();
		
	}
	
}
class Pedal2 implements Runnable{
	public DrawPanel p =  new DrawPanel();
	JFrame frame = new JFrame();
	public static int PBy2 = 0;
	public Pedal2(DrawPanel p, JFrame frame){
		this.p = p;
		this.frame = frame;
	}
	public void startPaddleTwo() {
		int y2 = 150;
		boolean togglex = true;
		boolean toggley = true;
		while(true) {
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=frame.getSize().width;
			int h=frame.getSize().height;
			p.pedal2x = w-50;
			p.pedal2y = y2;
			PBy2 = y2;
			p.repaint();
			if(Pong.PLAYER_2_UP && y2 < h-135){
				y2 = y2 + 1;
			}
			if(Pong.PLAYER_2_DOWN && y2 >= 0){
				y2 = y2 - 1;
			}
			try {
				Thread.sleep(10);
			} catch (Exception e) {
				e.printStackTrace();
				break;
			}
		}
	}
	@Override
	public void run() {
		startPaddleTwo();
	}
}
class Ball extends JPanel implements Runnable{
	public DrawPanel panel =  new DrawPanel();
	JFrame frame = new JFrame();
	public Ball(DrawPanel p, JFrame frame){
		this.panel = p;
		this.frame = frame;
	}
	public void startBall() {
		int x = 100;
		int y = 100;
		int PBy = 0;
		boolean togglex = true;
		boolean toggley = true;
		while(true){
			panel.ballX = x;
			panel.ballY = y;
			panel.repaint();
			Dimension screenDimension=Toolkit.getDefaultToolkit().getScreenSize();
			int w=frame.getSize().width;
			int h=frame.getSize().height;
			if((y>=panel.pedal1y && y<=panel.pedal1y+115 && x==35) || togglex){ 
				x += 1;
				togglex = true;
			}
			if((y>=panel.pedal2y-15 && y<=panel.pedal2y+115 && x==w-65) || !togglex){
				x += -1;
				togglex = false;
			}
			if(y==0 || toggley){
				y += 1;
				toggley = true;
			}
			if(y==h-60 || !toggley){
				y += -1;
				toggley = false;
			}
			if(x>=w){
				panel.leftPlayerWins = true;
				break;
			}
			if(x<=-32){
				panel.rightPlayerWins = true;
				break;
			}
			try {
				Thread.sleep(4);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	public void run() {
		startBall();
	}
}
class DrawPanel extends JPanel {

	
	public int ballX = 100;
	public int ballY = 100;
	public int pedal1y = 75;
	public int pedal2x = 385;
	public int pedal2y = 0;
	public Graphics graphics;
	public boolean leftPlayerWins = false;
	public boolean rightPlayerWins = false;

	
	@Override
	public void paintComponent(Graphics g) {
		this.graphics = g;
		super.paintComponent(g);
		g.setColor(Color.YELLOW);
		g.fillOval(ballX, ballY, 30, 30);
		g.setColor(Color.BLACK);
		g.fillRect(15, pedal1y, 20, 100);
		g.fillRect(pedal2x, pedal2y, 20, 100);
		if(leftPlayerWins){
			g.drawString("LEFT PLAYER WINS", 130, 90);
		}
		if(rightPlayerWins){
			g.drawString("RIGHT PLAYER WINS", 130, 90);
		}
/*		while(true){
			if(leftPlayerWins){swsw
				g.drawString("left", 100, 100);
			}
			if(rightPlayerWins){
				g.drawString("right", 100, 100);
			}
		}*/
	}
}