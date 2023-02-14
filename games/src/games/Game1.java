package games;

import java.awt.*;

import javax.swing.*;

public class Game1 {

    public static void main(String s[]) {
        JFrame frame = new JFrame("walk :|");
        JPanel panel = new JPanel();
        panel.setLayout(new FlowLayout());
        JLabel label = new JLabel("This is a label!");
        JButton button = new JButton();
        button.setText("Press me");
        panel.add(label);
        panel.add(button);
        frame.add(panel);
        frame.setSize(300, 300);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //Graphic g = 
        frame.setVisible(true);
    }


}
