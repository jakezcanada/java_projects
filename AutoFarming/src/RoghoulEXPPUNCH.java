import java.awt.*;
import java.awt.event.*;
import java.io.*;

/**
 * Simple auto-clicker.
 * 
 * @author Bradley Carels
 */
public class RoghoulEXPPUNCH {
   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
                robot.keyPress(KeyEvent.VK_E);
                Thread.sleep(10);
                robot.keyRelease(KeyEvent.VK_E);
                Thread.sleep(1000);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}
