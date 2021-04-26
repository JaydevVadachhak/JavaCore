/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletAdvanced;

import java.applet.Applet;
import java.awt.Graphics;
import java.awt.TextField;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class InteractiveApplet extends Applet {
    TextField t1;
    TextField t2;
    
    @Override
    public void init(){
        t1 = new TextField();
        t2 = new TextField();
        add(t1); add(t2);
        t1.setText("0"); t2.setText("1");
    }

    @Override
    public void paint(Graphics g) {
        g.drawString("Enter Two Values", 10, 50);
        
        try{
            String s1 = t1.getText();
            String s2 = t2.getText();

            int x = Integer.parseInt(s1);
            int y = Integer.parseInt(s2);

            int z = (x+y);

            String result = String.valueOf(z);

            g.drawString(result, 10, 100);
        }catch(Exception e){
            
        }
    }
}
