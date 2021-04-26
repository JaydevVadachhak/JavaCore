/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JPopupMenuExample {
    JMenuItem cut, copy, paste;
    JPopupMenu popupmenu;
    JPopupMenuExample(){
        JFrame f = new JFrame();
        popupmenu = new JPopupMenu();
        
        cut = new JMenuItem("cut");
        copy = new JMenuItem("copy");
        paste = new JMenuItem("paste");
        popupmenu.add(cut);
        popupmenu.add(copy);
        popupmenu.add(paste);
        
        f.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                popupmenu.show(f, e.getX(), e.getY());
            }
        });
        
        f.add(popupmenu);
        f.setSize(500,500);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    
    public static void main(String[] args) {
        new JPopupMenuExample();
    }
}
