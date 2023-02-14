import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Simple auto-clicker.
 * 
 * @author Bradley Carels
 */
public class owoSpam {

   public static int rate = 0;
   public static void prefix(Robot robot) {
	   try {
	   	robot.keyPress(KeyEvent.VK_O);
	    Thread.sleep(10);
	    robot.keyPress(KeyEvent.VK_W);
	    Thread.sleep(10);
	    robot.keyPress(KeyEvent.VK_O);
	    Thread.sleep(10);
	    robot.keyRelease(KeyEvent.VK_SPACE);
	   } catch (InterruptedException ex) {}
   }

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
            	prefix(robot);
//                Thread.sleep(10);
//                hunt(robot);
//                Thread.sleep(10);
//                prefix(robot);
//                Thread.sleep(10);
//                battle(robot);
            	robot.keyPress(KeyEvent.VK_ENTER);
        	    Thread.sleep(10);
        	    robot.keyRelease(KeyEvent.VK_ENTER);
                Thread.sleep(10000);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}
