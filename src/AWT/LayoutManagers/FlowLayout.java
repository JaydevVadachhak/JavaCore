/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT.LayoutManagers;

import java.awt.Button;
import java.awt.Frame;
import java.awt.LayoutManager;

/**
 *
 * @author jaydev
 */
public class FlowLayout extends Frame {

    public FlowLayout() {
        Button b1 = new Button("b1");
        Button b2 = new Button("b2");
        Button b3 = new Button("b3");
        Button b4 = new Button("b4");
        Button b5 = new Button("b5");
        add(b1); add(b2); add(b3); add(b4); add(b5);
        
        setLayout(new java.awt.FlowLayout((int) FlowLayout.RIGHT_ALIGNMENT));
        
        setSize(500,500);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new FlowLayout();
    }
}
