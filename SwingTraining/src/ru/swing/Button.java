package ru.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Button extends JButton implements ActionListener{
    static int count;
    public Button(String text) {
        super();
        super.setText(text);
        addActionListener(this);
        setBackground(Color.YELLOW);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        ClassFrame newWin=new ClassFrame();
        newWin.setTitle("HiWindows");
        newWin.setSize(newWin.getSize().width-50*count,newWin.getSize().height-50*count);
    }
}
