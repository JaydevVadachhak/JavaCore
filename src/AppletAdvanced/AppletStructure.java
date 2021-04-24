/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletAdvanced;

import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author jaydev
 */
public class AppletStructure extends Applet {
    String msg;
    @Override
    public void init(){
        msg = "Inside Init() --";
        setBackground(Color.yellow);
        setForeground(Color.red);
    }
    
    @Override
    public void start(){
        msg = "Inside Start() --";
    }
    
    @Override
    public void paint(Graphics g){
        msg += "Inside Paint() --";
        g.drawString(msg, 5, 50);
    }
    
    @Override
    public void stop(){
        
    }
    
    @Override
    public void destroy(){
        
    }
}
