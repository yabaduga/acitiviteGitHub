package com.yaba.dvdstore;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {

    public MyFrame()
    {
        initComponents();
    }

    private void initComponents() {
        this.setLayout(new FlowLayout());

        JButton button = new JButton("Bouton");
        this.add(button);


       this.setSize(600,400);
       this.setLocationRelativeTo(null);
       this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
