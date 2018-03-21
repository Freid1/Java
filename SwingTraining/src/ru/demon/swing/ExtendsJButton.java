package ru.demon.swing;

import javax.swing.*;
import java.awt.*;

public class ExtendsJButton extends JButton {
    public ExtendsJButton(String name, int wedth, int hieght) {

        super(name);
        super.setSize(wedth, hieght);
        this.setPreferredSize(new Dimension(100,20));


    }


    public void addActionListener() {
        super.setText("Hello");
    }
}
