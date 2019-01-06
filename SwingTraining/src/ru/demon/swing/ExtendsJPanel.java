package ru.demon.swing;

import javax.swing.*;
import java.awt.*;


public class ExtendsJPanel extends JPanel {

    public ExtendsJPanel(String name,Component component){
        super.setName(name);
        super.add(component);
        super.setLayout(new FlowLayout());

    }

   /* @Override
    public void paint(Graphics g) {
        Image image=new ImageIcon("fox.png").getImage();
       // g.drawImage(image,0,0,null);
    }*/
}
