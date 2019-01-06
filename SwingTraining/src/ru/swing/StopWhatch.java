package ru.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;

public class StopWhatch implements ActionListener {
    private JLabel jLabel;
    long Start;

    public StopWhatch() {
        JFrame jf=new JFrame("Sec");
        jf.setLayout(new FlowLayout());
        jf.setSize(190,90);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JButton buttonStart=new JButton("Start");
        JButton buttonStop=new JButton("Stop");

        buttonStart.addActionListener(this);
        buttonStop.addActionListener(this);

        jf.add(buttonStart);
        jf.add(buttonStop);

        jLabel=new JLabel("Press Start to begin timing.");
        jf.add(jLabel);

        jf.setLocationRelativeTo(null);
        jf.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Calendar cal=Calendar.getInstance();
        if (e.getActionCommand().equals("Start")){
            Start=cal.getTimeInMillis();
            jLabel.setText("Stop whatches Running....");
        }else{
            jLabel.setText("Time "+(double)(cal.getTimeInMillis()-Start)/1000);
        }

    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new StopWhatch();
            }
        });
    }
}
