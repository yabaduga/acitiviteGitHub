package com.yaba.swinglayouts;

import javax.swing.*;
import java.awt.*;

public class Main {

    public static void main(String[] args) {

        JFrame frame = new JFrame( "ma fenetre" );
        frame.setLayout( new FlowLayout(  ) );

        JPanel jPanell = new JPanel(  );
        jPanell.add(new JButton( "Mon Bouton" ));
        jPanell.add(new JButton( "Ton Bouton" ));
        jPanell.add(new JButton( "Son Bouton" ));

        jPanell.setSize( new Dimension( 100,100 ) );
        jPanell.setBackground( Color.gray );
        frame.add(jPanell);

        JTextArea jTextArea=new JTextArea( 10,10 );
        jTextArea.setLineWrap( true );
       // jTextArea.setBackground( Color.BLACK );
        JScrollPane jScrollPane = new JScrollPane(jTextArea);
        jScrollPane.setPreferredSize(new Dimension( 200,200 ));
        jScrollPane.setVerticalScrollBarPolicy( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        frame.add(jScrollPane);


        frame.setSize( 600,400 );
        frame.setLocationRelativeTo( null );
        frame.setDefaultCloseOperation( WindowConstants.EXIT_ON_CLOSE );
        frame.setVisible( true );
    }
}
