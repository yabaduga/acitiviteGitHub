package com.yaba.Swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
public class MyFrame extends JFrame{
    private JButton okButton;
    private JButton clearButton;

    private JTextField nomTextField;
    private JTextField prenomTextField;


    public MyFrame() {
       initComponents();


            public void okButtonactionPerformed( ActionEvent evt) {
                if(nomTextField.getText().length()==0&& prenomTextField.getText().length()==0) {
                    return;
                }
                String monNom = nomTextField.getText();
                String monPrenom = prenomTextField.getText();
                JOptionPane.showMessageDialog( this, "Salut " + monNom + " " + monPrenom);

            }
        };


    private void initComponents() {
        okButton=new JButton();
        clearButton=new JButton();
        nomTextField=new JTextField();
        prenomTextField= new JTextField();


        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0,400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(GroupLayout.Alignment.LEADING).addGap(0,300,Short.MAX_VALUE)
        );
        pack();
    }
    public static void main(String[] args) {

        MyFrame frame =new MyFrame();
        frame.setVisible(true);
    }
}