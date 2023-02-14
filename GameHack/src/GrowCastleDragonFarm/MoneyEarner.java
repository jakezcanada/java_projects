package GrowCastleDragonFarm;
import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

import org.jnativehook.GlobalScreen;
import org.jnativehook.mouse.NativeMouseEvent;
import org.jnativehook.mouse.NativeMouseInputListener;

class JakesHack implements Runnable {

	 Robot robot; 
	 public JakesHack() throws AWTException{
		 robot= new Robot();
	 }
    public void run() {
   	
		while(true){
			try {
				robot.mouseMove(781, 323);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mouseMove(1381, 234);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(4000);
				robot.mouseMove(408, 457);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mouseMove(503, 358);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mouseMove(500, 451);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mouseMove(593, 450);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(15000);
				robot.mouseMove(712, 635);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(500);
				robot.mousePress(InputEvent.BUTTON1_MASK);
				Thread.sleep(1);                                       
				robot.mouseRelease(InputEvent.BUTTON1_MASK);
				Thread.sleep(1000);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}


 class MoneyEarner {
	public volatile static String command;
	static Thread jThread ;
	public static void main(String[] args) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		JakesHack jHack = new JakesHack();
		jThread = new Thread(jHack);
		jThread.start();

	}


}