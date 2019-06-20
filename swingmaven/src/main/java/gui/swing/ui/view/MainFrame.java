package gui.swing.ui.view;

import javax.swing.*;

public class MainFrame extends JFrame {
    private JButton WelcomeBtn;


    private JTextArea welcomeTA;
    private JPanel mainPanel;
    private JTextArea textArea2;

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


    public JTextArea getTextArea2() {
        return textArea2;
    }

    private void createUIComponents() {
        // TODO: place custom component creation code here
    }
}
