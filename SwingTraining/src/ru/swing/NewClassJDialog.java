package ru.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NewClassJDialog {
    NewClassJDialog() {
        final JFrame main = new JFrame();
        main.setSize(500, 500);
        main.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        main.setLocationRelativeTo(null);
        main.setLayout(new FlowLayout());
        JButton showDialogButton = new JButton("Show modal");
        showDialogButton.setSize(100, 50);
        main.add(showDialogButton);
        showDialogButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent evnt) {
                new DialogExample(main);
            }
        });
        main.setVisible(true);
    }


    private class DialogExample extends JDialog {
        DialogExample(JFrame main) {
            super(main, Dialog.DEFAULT_MODALITY_TYPE.DOCUMENT_MODAL);
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            setSize(400, 400);
            setLayout(new FlowLayout());
            add(new JButton("Hi"));


            setLocationRelativeTo(main);
            setVisible(true);
        }
    }

    public static void main(String[] args) {
       SwingUtilities.invokeLater(new Runnable() {
           @Override
           public void run() {
               new NewClassJDialog();
           }
       });
    }
}
