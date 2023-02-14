import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.util.*;

public class UnAFKMachine {
	   public static void main(String[] args) {
		      try {
		    	 Robot robot = new Robot();
		    	 int randomNum = 0;
		    	 Random rand = new Random();
		         while (true) {
		            try {
		            	randomNum = rand.nextInt(4);
		            	randomNum += 1;
		            	if(randomNum == 4) {
		            		robot.mousePress( InputEvent.BUTTON1_MASK );
		            		Thread.sleep(10);
		            		robot.keyPress(KeyEvent.VK_W);
		                    Thread.sleep(1000);
		                    robot.keyRelease(KeyEvent.VK_W);
			   				 robot.mouseRelease( InputEvent.BUTTON1_MASK );
			   				 Thread.sleep(100);
		            	}else if(randomNum == 3) {
		            		robot.mousePress( InputEvent.BUTTON1_MASK );
		            		Thread.sleep(10);
		            		robot.keyPress(KeyEvent.VK_S);
		                    Thread.sleep(1000);
		                    robot.keyRelease(KeyEvent.VK_S);
		                    robot.mouseRelease( InputEvent.BUTTON1_MASK );
		                    Thread.sleep(100);
		            	}else if(randomNum == 2) {
		            		robot.mousePress( InputEvent.BUTTON1_MASK );
		            		Thread.sleep(10);
		            		robot.keyPress(KeyEvent.VK_A);
		                    Thread.sleep(1000);
		                    robot.keyRelease(KeyEvent.VK_A);
		                    robot.mouseRelease( InputEvent.BUTTON1_MASK );
		                    Thread.sleep(100);
		            	}else if(randomNum == 1) {
		            		robot.mousePress( InputEvent.BUTTON1_MASK );
		            		Thread.sleep(10);
		            		robot.keyPress(KeyEvent.VK_D);
		                    Thread.sleep(1000);
		                    robot.keyRelease(KeyEvent.VK_D);
			   				robot.mouseRelease( InputEvent.BUTTON1_MASK );
		                    Thread.sleep(100);
		            	}
		            } catch (InterruptedException ex) {}
		         }
		      } catch (AWTException e) {}
		   }

}
