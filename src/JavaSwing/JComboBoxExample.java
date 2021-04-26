/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import javax.swing.JComboBox;
import javax.swing.JFrame;

/**
 *
 * @author jaydev
 */
public class JComboBoxExample extends JFrame {
    
    JComboBoxExample(){
        String country[] = {"India", "Hongkong", "Germany", "NewYork" };
        JComboBox cb = new JComboBox(country);
        cb.setBounds(10, 50, 100, 30);
        add(cb);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JComboBoxExample();
    }
}
