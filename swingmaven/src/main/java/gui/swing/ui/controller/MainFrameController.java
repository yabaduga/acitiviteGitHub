package gui.swing.ui.controller;

import gui.swing.ui.view.MainFrame;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainFrameController {


    private JButton welcomeBtn;
    private JTextArea welcomeTA;
    private MainFrame mainFrame;


    public MainFrameController() {

        initComponents();
        initListeners();
    }

    public void showMainFrameWindow() {
        mainFrame.setVisible( true );
    }


    private void initComponents() {
        mainFrame = new MainFrame();
        welcomeBtn = mainFrame.getWelcomeBtn();
        welcomeTA = mainFrame.getWelcomeTA();
    }

    private void initListeners() {
        welcomeBtn.addActionListener( new WelcomeBtnListener() );

    }

    private class WelcomeBtnListener implements ActionListener {
        /**
         * Invoked when an action occurs.
         *
         * @param e
         */
        public void actionPerformed(ActionEvent e) {
            welcomeTA.append( "Welcome IntelliJ IDEA Swing Creator \n" );

        }
    }
}
