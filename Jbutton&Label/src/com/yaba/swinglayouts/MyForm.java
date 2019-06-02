package com.yaba.swinglayouts;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyForm extends JFrame{
    public JButton bouton1;

    public MyForm(String s) {

        bouton1.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {

                JOptionPane.showMessageDialog( null,"()" );
            }
        } );
        bouton1.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param evt
             */
            @Override
            public void actionPerformed(ActionEvent evt) {
                JOptionPane.showMessageDialog( null,evt.getActionCommand() );
            }
        } );
    }
}
