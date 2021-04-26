/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JRadioButtonExample extends JFrame {

    JRadioButtonExample() {
        
        JRadioButton r1 = new JRadioButton("Male");
        JRadioButton r2 = new JRadioButton("FeMale");
        r1.setBounds(10, 50, 150, 30);
        r2.setBounds(10, 100, 150, 30);
        add(r1); add(r2);
        
        ButtonGroup bg = new ButtonGroup();
        bg.add(r2); bg.add(r1);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JRadioButtonExample();
    }
}
