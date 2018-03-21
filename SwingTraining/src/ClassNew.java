import com.sun.java.swing.plaf.motif.MotifBorders;

import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.plaf.basic.BasicBorders;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import javax.swing.plaf.synth.SynthLookAndFeel;
import java.awt.*;

public class ClassNew {
    public static void main(String[] args) throws  UnsupportedLookAndFeelException {

       UIManager.setLookAndFeel(new NimbusLookAndFeel());
       JFrame.setDefaultLookAndFeelDecorated(true);
        FlowLayout flowLayout = new FlowLayout();

        JFrame jFrame = new JFrame("Windows Java");
        jFrame.setSize(500, 500);

        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jFrame.setLayout(flowLayout);
        jFrame.setLocationRelativeTo(null);



        JButton jButton = new JButton("Hello");
        JButton jButton1 = new JButton("Hello1");
        JButton jButton2 = new JButton("Hello2");

        jFrame.setIconImage(new ImageIcon("d:\\fox.png").getImage());

        JPanel jPanel = new JPanel();

        jPanel.setBorder(BorderFactory.createEtchedBorder());

        jPanel.add(jButton);
        jPanel.add(jButton1);
        jPanel.add(jButton2);

        jFrame.getContentPane().add(jPanel);


        jFrame.setVisible(true);
    }

}
