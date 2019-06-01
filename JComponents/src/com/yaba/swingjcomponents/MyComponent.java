package com.yaba.swingjcomponents;

import javax.swing.*;
import javax.swing.border.EtchedBorder;
import java.awt.*;

public class MyComponent extends JComponent {

    public MyComponent() {
        this.setPreferredSize( new Dimension( 165,60 ));
        this.setToolTipText( "This is tooltip text! " );
        this.setBorder( BorderFactory.createTitledBorder( "Mon TITRE" ) );
    }

    @Override
    protected void paintComponent(Graphics g) {
       g.setColor( Color.lightGray );
       g.fillRect( 0,0,165,60 );
       g.setColor( Color.darkGray );
       g.drawString( "Hello depuis le component",10,40 );

    }
}
