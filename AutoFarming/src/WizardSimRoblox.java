import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Simple auto-clicker.
 * 
 * @author Bradley Carelsq
 */
public class WizardSimRoblox {

   public static int rate = 0;

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
				robot.mousePress( InputEvent.BUTTON1_MASK );
                Thread.sleep(10);
				robot.mouseRelease( InputEvent.BUTTON1_MASK );
                Thread.sleep(500);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}
