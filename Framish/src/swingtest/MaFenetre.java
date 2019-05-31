package swingtest;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MaFenetre {
    private JButton monBouton;
    public JPanel panelMain;
    private JTextField monNom;
    private JButton clearBouton;

    public MaFenetre() {
        monBouton.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(null,"Espèce de truffe !!!!!!!!!!" + " "+ monNom.getText());
            }
        } );
        clearBouton.addActionListener( new ActionListener() {
            /**
             * Invoked when an action occurs.
             *
             * @param e
             */
            @Override
            public void actionPerformed(ActionEvent e) {
                monNom.setText( "" );
            }
        } );
    }
   /* public static void main (String [] args) {
        JFrame frame = new JFrame( "MaFenetre" );
        frame.setContentPane( new MaFenetre().panelMain );
        frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        frame.pack();
        frame.setVisible( true );
    }*/
}
