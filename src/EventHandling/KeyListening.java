/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class KeyListening extends Applet implements KeyListener {
    
    String msg = "";

    @Override
    public void init(){
        addKeyListener(this);
        requestFocus();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        msg += e.getKeyChar();
        repaint();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        showStatus("Key Pressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {
        showStatus("Key Released");
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString(msg, 10, 100);
    }
}
