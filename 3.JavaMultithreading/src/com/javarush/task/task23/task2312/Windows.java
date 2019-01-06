package com.javarush.task.task23.task2312;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Windows implements ActionListener{
    private int width;
    private int height;
    private Snake snake;
    private Mouse mouse;

    public void createWindows(){

SwingUtilities.invokeLater(new Runnable() {
    @Override
    public void run(){
        JFrame jFrame=new JFrame();
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());
        JButton jButton=new JButton("1");
        jButton.addActionListener(new Windows());
        jFrame.add(jButton);
        jFrame.add(new JButton("2"));
        jFrame.setVisible(true);
    }
});
    }

    public static void main(String[] args) {
        Windows game=new Windows();
        game.createWindows();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        createWindows();
    }
}
