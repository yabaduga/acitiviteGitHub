package com.yaba.swinglayouts;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "ma fenetre" );
        frame.setLayout( new FlowLayout(  ) );

       JSplitPane jSplitPane = new JSplitPane( JSplitPane.HORIZONTAL_SPLIT );
       JPanel leftPanel = new JPanel(  );
       leftPanel.setBackground( Color.cyan );
       JPanel rightPanel= new JPanel(  );
       rightPanel.setBackground( Color.gray );

       leftPanel.setPreferredSize( new Dimension( 200,200 ) );
       rightPanel.setPreferredSize( new Dimension( 200,200 ) );

       jSplitPane.setLeftComponent( leftPanel );
       jSplitPane.setRightComponent( rightPanel );

       frame.add(jSplitPane);



        frame.setSize( 600,400 );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
