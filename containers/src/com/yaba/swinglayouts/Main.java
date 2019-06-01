package com.yaba.swinglayouts;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "ma fenetre" );
        frame.setLayout( new FlowLayout(  ) );

        JInternalFrame internalFrame = new JInternalFrame( "My internal Frame" );
        internalFrame.add(new JButton( "OKButon" ));
        internalFrame.setPreferredSize( new Dimension( 200,100 ) );

        frame.add(internalFrame);
        internalFrame.setVisible( true );

        frame.setSize( 600,400 );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
