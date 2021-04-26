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
public class GridLayout extends Frame {

    public GridLayout() {
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        Button b6 = new Button("b6");
        Button b7 = new Button("b7");
        Button b8 = new Button("b8");
        Button b9 = new Button("b9");
        add(b1); add(b2); add(b3); add(b4); add(b5);
        add(b6); add(b7); add(b8); add(b9);
        
        setLayout(new java.awt.GridLayout(3, 3));
        setSize(300, 300);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new GridLayout();
    }
}
