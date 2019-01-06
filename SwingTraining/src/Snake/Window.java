package Snake;

import javax.swing.*;
import java.awt.*;

public class Window  {
    private JFrame frame;

    public Window(){
        frame = new JFrame("KeyPress Tester");
        frame.setTitle("Transparent JFrame Demo");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setSize(400, 400);
        frame.setLayout(new GridBagLayout());
        //frame.setUndecorated(true);
        //frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        //frame.setOpacity(0.0f);
        frame.setVisible(true);
    }
}
