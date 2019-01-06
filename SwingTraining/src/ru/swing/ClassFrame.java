package ru.swing;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.plaf.basic.BasicArrowButton;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ClassFrame extends JFrame implements ActionListener {
    JLabel jl;
    private BasicArrowButton
            up = new BasicArrowButton(BasicArrowButton.NORTH),
            down = new BasicArrowButton(BasicArrowButton.SOUTH),
            right = new BasicArrowButton(BasicArrowButton.EAST),
            left = new BasicArrowButton(BasicArrowButton.WEST);

    public ClassFrame() throws HeadlessException {
        super("New Windows");
        setSize(1000, 1000);
        setLayout(new FlowLayout());

        JButton jb1=new JButton("First");
        JButton jb2=new JButton("Second");
        add(jb1);
        add(jb2);
        add(new ru.swing.Button("Button"));
        add(new ru.swing.Button("Button"));
        add(new NewJTextField());
        add(new JToggleButton("JToggleButton"));
        add(new JCheckBox("JCheckBox"));
        add(new JRadioButton("JRadioButton"));
        jl=new JLabel("Press Button");
        add(jl);
        JPanel jp = new JPanel();
        jp.setBorder(new TitledBorder("Directions"));
        jp.add(up);
        jp.add(down);
        jp.add(left);
        jp.add(right);

        add(jp);

        jb1.addActionListener(this);
        jb2.addActionListener(this);


        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new ClassFrame();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
if(e.getActionCommand().equals("First"))
    jl.setText("You are press Ferst");
else
    jl.setText("You are press Second");

    }
}
