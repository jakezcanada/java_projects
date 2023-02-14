import java.awt.*;
import java.awt.event.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

//import org.jnativehook.GlobalScreen;
//import org.jnativehook.mouse.NativeMouseEvent;
//import org.jnativehook.mouse.NativeMouseInputListener;

public class MoneyEarner2 {
	public volatile static String command;
	static Thread jThread ;
	public static void main(String[] args) throws AWTException, InterruptedException {
		Thread.sleep(5000);
		JakesHack2 jHack = new JakesHack2();
		jThread = new Thread(jHack);
		jThread.start();

	}


}

class JakesHack2 implements Runnable {

	 Robot robot; 
	 public JakesHack2() throws AWTException{
		 robot= new Robot();
	 }
    public void run() {
		while(true){
			try {
				robot.keyPress(KeyEvent.VK_1);
				Thread.sleep(10);                                        
				robot.keyRelease(KeyEvent.VK_1);
				Thread.sleep(880);
				robot.keyPress(KeyEvent.VK_1);
				Thread.sleep(50);                                      
				robot.keyRelease(KeyEvent.VK_1);
				Thread.sleep(880);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
    }
}


