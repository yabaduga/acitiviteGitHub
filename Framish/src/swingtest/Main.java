package swingtest;

import swingtest.MaFenetre;

import javax.swing.*;

public class Main {
    public static void main (String [] args) {
        JFrame frame = new JFrame( "MaFenetre" );
        frame.setContentPane( new MaFenetre().panelMain );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }
}
