/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.awt.Frame;
import java.awt.Label;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class MouseListening extends Frame implements MouseListener {
    Label l ;
    MouseListening() {
        addMouseListener(this);
        l = new Label();
        l.setBounds(10, 100, 100, 20);
        add(l);
        setSize(300,300);
        setLayout(null);
        setVisible(true);
    }
    
    @Override
    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Enetered");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    
    public static void main(String[] args) {
        new MouseListening();
    }
}
