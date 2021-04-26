/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.HeadlessException;
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
public class ButtonActionEvent extends JFrame {

    public ButtonActionEvent() throws HeadlessException {
        JTextField tf = new JTextField();
        tf.setBounds(10,100, 300, 30);
        JButton btn = new JButton("Click Here");
        btn.setBounds(10, 150, 100, 30);
        tf.setEditable(false);
        btn.addActionListener((ActionEvent e) -> {
            tf.setText("Welcome to JavaCore");
        });
        add(btn); add(tf);
        setSize(400,400);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new ButtonActionEvent();
    }
}
