import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AutoClicker {

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
            	robot.keyPress(KeyEvent.VK_1);
				Thread.sleep(10);                                        
				robot.keyRelease(KeyEvent.VK_1);
				Thread.sleep(880);
				robot.keyPress(KeyEvent.VK_1);
				Thread.sleep(50);                                      
				robot.keyRelease(KeyEvent.VK_1);
				Thread.sleep(880);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}    				