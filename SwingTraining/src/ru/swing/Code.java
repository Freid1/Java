package ru.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Code implements ActionListener {
    JLabel jLabelEnter;
    JLabel jLabelExit;
    JLabel jLabelIcon;

    ImageIcon icon;

    JTextField jTextFieldEnter;
    JTextField jTextFieldExit;

    public Code() {
        JFrame jFrame = new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setLayout(new FlowLayout());
        jFrame.setLocationRelativeTo(null);
        jFrame.setSize(250, 120);

        icon=new ImageIcon("fox.png");
        jLabelEnter = new JLabel("Enter Text");
        jLabelExit = new JLabel("Result Pro");
        jLabelIcon =new JLabel();

        jLabelEnter.setBorder(BorderFactory.createLineBorder(Color.BLUE,2));
        jLabelExit.setBorder(BorderFactory.createMatteBorder(3,3,3,3,Color.YELLOW));

        jTextFieldEnter = new JTextField(10);
        jTextFieldExit = new JTextField(10);

        jTextFieldEnter.setActionCommand("One");
        jTextFieldExit.setActionCommand("Two");

        jFrame.add(jLabelEnter);
        jFrame.add(jTextFieldEnter);
        jFrame.add(jLabelExit);
        jFrame.add(jTextFieldExit);
        jFrame.add(jLabelIcon);

        JButton buttonCoder = new JButton("Coder");
        JButton buttonDecoder = new JButton("Decoder");
        JButton buttonReset = new JButton("Reset");

        buttonCoder.addActionListener(this);
        buttonDecoder.addActionListener(this);
        buttonReset.addActionListener(this);

        jFrame.add(buttonCoder);
        jFrame.add(buttonDecoder);
        jFrame.add(buttonReset);

        jFrame.setVisible(true);

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Code();
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getActionCommand().equals("Coder")) {
            StringBuilder stringBuilder = new StringBuilder(jTextFieldEnter.getText());
            for (int i = 0; i < stringBuilder.length(); i++) {
                stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i) + 1));
            }
            jTextFieldExit.setText(stringBuilder.toString());
        } else if (e.getActionCommand().equals("Decoder")) {
            StringBuilder stringBuilder = new StringBuilder(jTextFieldEnter.getText());

            for (int i = 0; i < stringBuilder.length(); i++) {
                stringBuilder.setCharAt(i, (char) (stringBuilder.charAt(i) - 1));
            }
            jTextFieldExit.setText(stringBuilder.toString());
        } else {
            jTextFieldEnter.setText("");
            jTextFieldExit.setText("");

            jLabelExit.setEnabled(false);
            jLabelEnter.setEnabled(false);
            jLabelEnter.setDisabledIcon(icon);

        }


    }
}
