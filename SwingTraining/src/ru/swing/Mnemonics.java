package ru.swing;

import javax.swing.*;
import java.awt.*;

public class Mnemonics {
    public Mnemonics() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(300, 100);
        jFrame.setLocationRelativeTo(null);
        jFrame.setBackground(Color.GRAY);
        jFrame.setLayout(new BoxLayout(jFrame.getContentPane(), BoxLayout.Y_AXIS));

        JTextField jTextField1 = new JTextField(10);
        JTextField jTextField2 = new JTextField(10);
        JLabel jLabel1 = new JLabel("Name");
        jLabel1.setDisplayedMnemonic('n');
        jLabel1.setLabelFor(jTextField1);
        JLabel jLabel2 = new JLabel("Email");
        jLabel2.setDisplayedMnemonic('e');
        jLabel2.setLabelFor(jTextField2);

        jFrame.add(jLabel1);
        jFrame.add(jTextField1);
        jFrame.add(jLabel2);
        jFrame.add(jTextField2);

        jFrame.setVisible(true);


    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Mnemonics();
            }
        });
    }


}
