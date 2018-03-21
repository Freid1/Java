package ru.demon.swing;

import javax.swing.*;
import java.awt.*;

public class Test {
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, ClassNotFoundException {

        try {
            UIManager.setLookAndFeel("com.jtattoo.plaf.aluminium.AluminiumLookAndFeel");
        } catch (UnsupportedLookAndFeelException e) {
            e.printStackTrace();
        }
        JFrame.setDefaultLookAndFeelDecorated(true);

        ExtendsJButton button1=new ExtendsJButton("Button 1",100,100);
        ExtendsJButton button2=new ExtendsJButton("Button 2",100,100);
        ExtendsJButton button3=new ExtendsJButton("Button 3",100,100);

        ExtendsJPanel panel=new ExtendsJPanel("Panel",button1);
        panel.add(button2, BorderLayout.EAST);
        panel.add(button3,BorderLayout.WEST);
        ExtendsJFrame frame=new ExtendsJFrame("Windows",400,400,panel);
    }
}
