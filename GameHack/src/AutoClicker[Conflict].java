import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class AutoClicker {

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
            	robot.keyPress(KeyEvent.VK_A);
				Thread.sleep(50);                                       
				robot.keyRelease(KeyEvent.VK_A);
				Thread.sleep(100);
            	robot.keyPress(KeyEvent.VK_ENTER);
				Thread.sleep(50);                                       
				robot.keyRelease(KeyEvent.VK_ENTER);
				Thread.sleep(3000);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}    				