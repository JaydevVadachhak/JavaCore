/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JPasswordExample extends JFrame implements ActionListener {
    
    JTextField tf1;
    JPasswordField pf;
    JButton btn1;
    
    JPasswordExample(){
        pf = new JPasswordField();
        pf.setBounds(10, 100, 150, 30);
        add(pf);
        
        tf1 = new JTextField();
        tf1.setBounds(10, 150, 150, 30);
        tf1.setEditable(false);
        add(tf1);
        
        btn1 = new JButton("login");
        btn1.setBounds(10, 200, 100, 30);
        btn1.addActionListener((e) -> {
            String s = pf.getText();
            tf1.setText(s);
        });
        add(btn1);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JPasswordExample();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
