package training;

import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Windows");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        GridLayout gridLayout = new GridLayout(4, 4, 5, 5);

        frame.setLayout(gridLayout);

        for (int i = 1; i <10 ; i++) {
            frame.add(new JButton("Button "+i));

        }

        JButton one = new JButton("Button 0");
        frame.add(one);
        frame.setLayout(gridLayout);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}
