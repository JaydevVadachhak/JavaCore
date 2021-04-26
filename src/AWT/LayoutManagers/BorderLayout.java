/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT.LayoutManagers;

import java.awt.*;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class BorderLayout extends Frame{

    BorderLayout() {
        Frame f = new Frame();
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        
        add(b1, java.awt.BorderLayout.EAST);
        add(b2, java.awt.BorderLayout.SOUTH);
        add(b3, java.awt.BorderLayout.WEST);
        add(b4, java.awt.BorderLayout.NORTH);
        add(b5, java.awt.BorderLayout.CENTER);
        
        setSize(500, 500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new BorderLayout();
    }
}
