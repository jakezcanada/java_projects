import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.InputEvent;

public class MinecraftOvernightDiamonds {

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
