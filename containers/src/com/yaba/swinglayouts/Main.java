package com.yaba.swinglayouts;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "ma fenetre" );
        frame.setLayout( new FlowLayout(  ) );

        JTabbedPane jTabbedPane = new JTabbedPane();
        JPanel red = new JPanel();
        red.setBackground( Color.red );
        red.setPreferredSize( new Dimension( 300, 100 ) );
        jTabbedPane.addTab( "Red Tab", red );

        JPanel yellow = new JPanel();
        yellow.setBackground( Color.yellow );
        yellow.setPreferredSize( new Dimension( 300, 100 ) );
        jTabbedPane.addTab( "Yellow Tab", yellow );

        JPanel white = new JPanel();
        white.setBackground( Color.white );
        white.setPreferredSize( new Dimension( 300, 100 ) );
        jTabbedPane.addTab( "white Tab", white );

        frame.add( jTabbedPane );

        frame.setSize( 600,400 );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
