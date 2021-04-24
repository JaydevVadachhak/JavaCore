/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletAdvanced;

import java.applet.Applet;
import java.awt.Frame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author jaydev
 */

class SampleFrame extends Frame{
    SampleFrame(String title){
        super(title);
        MyWindowAdapter adapter = new MyWindowAdapter(this);
        addWindowListener((WindowListener) adapter);
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString("This is in frame window ", 10, 40);
    }
}

class MyWindowAdapter extends WindowAdapter{
    SampleFrame sampleFrame;
    public MyWindowAdapter(SampleFrame sampleFrame){
        this.sampleFrame = sampleFrame;
    }
    
    @Override
    public void windowClosing(WindowEvent we){
        sampleFrame.setVisible(false);
    }
}

public class ChildFrame extends Applet {
    Frame f;
    @Override
    public void init(){
        f = new SampleFrame("A Frame Window");
        f.setSize(250, 250);
        f.setVisible(true);
    }
    
    @Override
    public void start(){
        f.setVisible(true);
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString("This is applet window", 10, 20);
    }
    
    @Override
    public void stop(){
        f.setVisible(false);
    }
}
