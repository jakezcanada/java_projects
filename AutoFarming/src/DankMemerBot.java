import java.awt.*;
import java.awt.event.*;

/**
 * Simple auto-clicker.
 * 
 * @author Bradley Carels
 */
public class DankMemerBot {

	public static int rate = 0;
	public static void prefix(Robot r) {
		try {
			r.keyPress(KeyEvent.VK_P);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_L);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_SPACE);
			Thread.sleep(10);
		} catch (InterruptedException ex) {}
	}
	public static void beg(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_B);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_G);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}
	public static void search(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_R);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_C);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_H);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}

	public static void trivia(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_R);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_V);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_1);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}

	public static void slots(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_L);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_O);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_1);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}

	public static void flip(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_F);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_L);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_I);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_P);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_H);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_A);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_D);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_S);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}

	public static void bet(Robot r) {
		try {
			prefix(r);
			r.keyPress(KeyEvent.VK_B);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_E);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_T);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_SPACE);
			Thread.sleep(10);
			r.keyPress(KeyEvent.VK_1);
			Thread.sleep(1000);
			r.keyPress(KeyEvent.VK_ENTER);
			Thread.sleep(10);
			r.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
		} catch (InterruptedException ex) {}
	}

	public static void main(String[] args) {
		try {
			Robot r = new Robot();
			while (true) {
				try {
					flip(r);
					beg(r);
					trivia(r);
					slots(r);
					bet(r);
					Thread.sleep(55000);
				} catch (InterruptedException ex) {}
			}
		} catch (AWTException e) {}
	}

}
