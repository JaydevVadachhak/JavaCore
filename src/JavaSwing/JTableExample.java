/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaSwing;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class JTableExample extends JFrame {
    JTableExample(){
        
        String country[][] = {{"India", "Hongkong", "Germany", "NewYork"},{"India", "Hongkong", "Germany", "NewYork"},{"India", "Hongkong", "Germany", "NewYork"},{"India", "Hongkong", "Germany", "NewYork"},{"India", "Hongkong", "Germany", "NewYork"},{"India", "Hongkong", "Germany", "NewYork"}};
        String column[] = {"ID", "Country", "Capital", "States"};
        
        JTable table = new JTable(country, column);
        table.setBounds(10, 20, 400, 100);
        add(table);
        
        setSize(500,500);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new JTableExample();
    }
}
