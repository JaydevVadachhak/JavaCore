/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class SimpleCalculator extends JFrame implements ActionListener {
    
    JTextField tf1, tf2, tf3;
    JButton btn1, btn2;

    SimpleCalculator() {
        
        tf1 = new JTextField();
        tf2 = new JTextField();
        tf1.setBounds(10, 50, 150, 30);
        tf2.setBounds(10, 100, 150, 30);
        add(tf1); add(tf2);
        
        tf3 = new JTextField();
        tf3.setBounds(10, 150, 150, 30);
        tf3.setEditable(false);
        add(tf3);
        
        btn1 = new JButton("+");
        btn2 = new JButton("Clear");
        btn1.setBounds(10, 200, 100, 30);
        btn2.setBounds(200, 200, 100, 30);
        btn1.addActionListener((e) -> {
            String s1 = tf1.getText();
            String s2 = tf2.getText();
            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);
            int z = x+y;
            String result = String.valueOf(z);
            tf3.setText(result);
        });
        btn2.addActionListener((e) -> {
            tf1.setText(null);
            tf2.setText(null);
            tf3.setText(null);
        });
        add(btn1); add(btn2);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new SimpleCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
