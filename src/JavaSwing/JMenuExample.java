/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

/**
 *
 * @author jaydev
 */
public class JMenuExample extends JFrame {
    
    JMenu menu, submenu;
    JMenuItem i1, i2, i3, i4, i5;
    
    JMenuExample(){
        JMenuBar mb = new JMenuBar();
        mb.setBounds(0, 100, 500, 30);
        menu = new JMenu("Menu");
        submenu = new JMenu("Submenu");
        
        i1 = new JMenuItem("i1");
        i2 = new JMenuItem("i2");
        i3 = new JMenuItem("i3");
        i4 = new JMenuItem("i4");
        i5 = new JMenuItem("i5");
        
        menu.add(i1); menu.add(i2); menu.add(i3);
        submenu.add(i4); submenu.add(i5);
        
        menu.add(submenu);
        mb.add(menu);
        setJMenuBar(mb);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JMenuExample();
    }
}
