package com.yaba.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ComponentAdapter;

public class MyFrame  extends JFrame {


    private JButton OKButton;
    private JButton clearButton;
    private JTextField txtNom;
    private JTextField txtPrenom;
    private JPanel PanelSwingNB;

    public MyFrame() throws Exception {



        OKButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                if (txtNom.getText().length() == 0 && txtPrenom.getText().length() == 0) {
                    return;
                }

                JOptionPane.showMessageDialog(frame2, "Salut " + txtPrenom + " " + txtNom);


            }
        });

        clearButton.addComponentListener(new ComponentAdapter() {
        });
        clearButton.addActionListener(new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                txtPrenom.setText("");
                txtNom.setText("");
            }
        });
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }

    public static void main(String[] args) {
    }
}