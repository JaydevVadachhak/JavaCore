/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Choice;
import java.awt.Frame;
import java.awt.HeadlessException;
import java.awt.Label;
import java.awt.List;
import java.awt.Scrollbar;
import java.awt.TextArea;
import java.awt.TextField;

/**
 *
 * @author jaydev
 */
public class AllAWTComponents extends Frame {

    public AllAWTComponents() throws HeadlessException {
        
        //Button
        Button b = new Button("Click Here");
        b.setBounds(10, 100, 100, 30);
        add(b);
        
        //checkbox
        Checkbox ch1 = new Checkbox("C++");
        ch1.setBounds(10, 150, 50, 30);
        add(ch1);
        
        Checkbox ch2 = new Checkbox("Java", true);
        ch2.setBounds(60, 150, 50, 30);
        add(ch2);
        
        //labels
        Label l = new Label("Label");
        l.setBounds(10, 190, 50, 30);
        add(l);
        
        //TextField
        TextField t = new TextField("Enter name here");
        t.setBounds(10, 230, 50, 30);
        add(t);
        
        //TextArea
        TextArea ta = new TextArea("Textarea");
        ta.setBounds(10, 260, 200, 100);
        add(ta);
        
        //list
        List li = new List(4);
        li.setBounds(300,260,100,30);
        li.add("item 1");
        li.add("item 2");
        li.add("item 3");
        li.add("item 4");
        add(li);
        
        //choice
        Choice choice = new Choice();
        choice.setBounds(300, 400, 100, 30);
        choice.add("item1");
        choice.add("item2");
        add(choice);
        
        //scrollbar
        Scrollbar sb = new Scrollbar();
        sb.setBounds(200, 450, 50, 130);
        add(sb);
        
        setSize(600,600);
        setLayout(null);
        setVisible(true);
    }    
    
    public static void main(String[] args) {
        AllAWTComponents obj = new AllAWTComponents();
    }
}
