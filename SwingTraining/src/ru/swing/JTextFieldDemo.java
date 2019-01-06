package ru.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JTextFieldDemo implements ActionListener {
    JTextField jTextField1;
    JTextField jTextField2;
    JLabel jLabel;

    public JTextFieldDemo() {
        JFrame jFrame = new JFrame();
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(new FlowLayout());
        jFrame.setSize(240, 150);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        jTextField1 = new JTextField(10);
        jTextField2 = new JTextField(10);

        jFrame.add(jTextField1);
        jFrame.add(jTextField2);

        jTextField1.addActionListener(this);
        jTextField2.addActionListener(this);

        jTextField1.setActionCommand("One");
        jTextField2.setActionCommand("Two");

        jLabel = new JLabel("");
        jFrame.add(jLabel);


        jFrame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new JTextFieldDemo();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("One")) {
            jLabel.setText("Curent contents 1 :" + jTextField1.getText());
        }else{
            jLabel.setText("Curent contents 2 :" + jTextField2.getText());

        }
    }
}