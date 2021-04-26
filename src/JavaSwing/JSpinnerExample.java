/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerDateModel;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JSpinnerExample extends JFrame {
    
    JSpinnerExample(){
        SpinnerNumberModel value1 = new SpinnerNumberModel();
        JSpinner spinner1 = new JSpinner(value1);
        spinner1.setBounds(10, 100, 100, 30);
        add(spinner1);
        
        //SpinnerModel value2 = new SpinnerNumberModel(5 /*initial value*/, 0 /*minimum value*/, 10 /*max*/, 1 /*step*/);
        SpinnerDateModel value2 = new SpinnerDateModel();
        JSpinner spinner2 = new JSpinner(value2);
        spinner2.setBounds(10, 200, 100, 30);
        add(spinner2);
     
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JSpinnerExample();
    }
}
