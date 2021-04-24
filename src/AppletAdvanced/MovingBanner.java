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
public class MovingBanner extends Applet implements Runnable{
    
    String msg = "A Simple Moving Banners";
    
    Thread t = null;
    int state;
    boolean stopFlag;
    
    @Override
    public void init(){
        setBackground(Color.cyan);
        setForeground(Color.red);
    }

    @Override
    public void start() {
        t = new Thread(this);
        stopFlag = false;
        t.start();
    }
    
    

    @Override
    public void run() {
        char ch;
        for (; ;) {
            try{
                repaint();
                Thread.sleep(250);
                ch = msg.charAt(0);
                msg = msg.substring(1, msg.length());
                msg += ch;
                if(stopFlag){
                    break;
                }
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }

    @Override
    public void stop() {
        stopFlag = true;
        t = null;
    }

    @Override
    public void paint(Graphics g) {
        g.drawString(msg, 50, 30);
    }
    
    
}
