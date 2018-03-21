package ru.demon.swing;

import javax.swing.*;
import java.awt.*;


public class ExtendsJPanel extends JPanel {
    public ExtendsJPanel(String name,Component component){
        super.setName(name);
        super.add(component);
        super.setLayout(new FlowLayout());

    }
}
