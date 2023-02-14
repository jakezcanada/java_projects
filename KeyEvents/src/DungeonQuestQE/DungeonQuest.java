package DungeonQuestQE;

import java.awt.*;
import java.awt.event.*;
import java.io.*;

public class DungeonQuest {

   public static void main(String[] args) {
      try {
         Robot robot = new Robot();
         while (true) {
            try {
            	robot.keyPress(KeyEvent.VK_Q);
				Thread.sleep(50);                                        
				robot.keyRelease(KeyEvent.VK_Q);
				Thread.sleep(6000);
				robot.keyPress(KeyEvent.VK_E);
				Thread.sleep(50);                                       
				robot.keyRelease(KeyEvent.VK_E);
				Thread.sleep(6000);
            } catch (InterruptedException ex) {}
         }
      } catch (AWTException e) {}
   }

}   