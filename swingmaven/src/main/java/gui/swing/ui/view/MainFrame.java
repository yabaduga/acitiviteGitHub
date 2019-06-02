package gui.swing.ui.view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JButton WelcomeBtn;


    private JTextArea welcomeTA;
    private JPanel mainPanel;

    public MainFrame() {
        setSize( 500, 500 );
        setContentPane( mainPanel );
        setLocationRelativeTo( null );


    }

    public JButton getWelcomeBtn() {
        return WelcomeBtn;
    }

    public JTextArea getWelcomeTA() {
        return welcomeTA;
    }
}
