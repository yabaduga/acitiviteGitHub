package com.yaba.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class MaFenetre {
    private JTextField monNom;
    private JButton ok;

    public MaFenetre() {

        ok.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame frame = new JFrame("JOptionPane showMessageDialog example");

                // show a joptionpane dialog using showMessageDialog
                JOptionPane.showMessageDialog(frame,
                        "Salut : '" + monNom + "'.");
                System.exit(0);
            }
        } );
    }
}
