package ru.demon.swing;

import javax.swing.*;
import javax.swing.plaf.metal.MetalLookAndFeel;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;
import java.awt.*;

public class ExtendsJFrame extends JFrame {
    public ExtendsJFrame(String title,int widht, int height,Component comp){
        super(title);
        super.setSize(widht,height);
        super.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        super.setLocationRelativeTo(null);
        super.setLayout(new BorderLayout());
        super.getContentPane().add(comp,BorderLayout.NORTH);
        super.setIconImage(new ImageIcon("fox.png").getImage());
        super.setVisible(true);
    }

}
