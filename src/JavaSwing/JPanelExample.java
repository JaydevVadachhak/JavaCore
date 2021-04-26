/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JPanelExample extends JFrame {

    JPanelExample() {
        JPanel panel = new JPanel();
        panel.setBounds(10,50,350,350);
        panel.setBackground(Color.green); //panel
        JButton b1 = new JButton("btn1");
        JButton b2 = new JButton("btn2");
        b1.setBounds(30,75,100,30);
        b2.setBounds(30,125,100,30);
        b1.setBackground(Color.red); //btn inside panel
        b1.setForeground(Color.white);
        b2.setBackground(Color.YELLOW); //btn inside panel
        b2.setForeground(Color.BLACK);
        panel.add(b1);
        panel.add(b2);
        add(panel);
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JPanelExample();
    }
}
