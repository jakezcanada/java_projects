package games;
import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.awt.KeyEventDispatcher;
import java.awt.KeyboardFocusManager;
import java.awt.event.KeyEvent;

public class AutoClicker2 {

    private static volatile boolean wPressed = false;
    public static boolean isWPressed() {
        synchronized (AutoClicker2.class) {
            return wPressed;
        }
    }
    public boolean dispatchKeyEvent(KeyEvent ke) {

        synchronized (AutoClicker2.class) {
            switch (ke.getID()) {
            case KeyEvent.KEY_PRESSED:
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    wPressed = true;
                }
                break;

            case KeyEvent.KEY_RELEASED:
                if (ke.getKeyCode() == KeyEvent.VK_W) {
                    wPressed = false;
                }
                break;
            }
            return false;
        }
    }
   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
               Thread.sleep(100);
               robot.keyPress(KeyEvent.VK_T);
               robot.keyRelease(KeyEvent.VK_T);
               if(AutoClicker2.isWPressed()) {
            	   System.exit(0);
               }
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}