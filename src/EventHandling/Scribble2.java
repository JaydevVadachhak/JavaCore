/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EventHandling;

import Abstraction.myShapes.Rectangle;
import java.applet.Applet;
import java.awt.Button;
import java.awt.Choice;
import java.awt.Color;
import java.awt.Event;
import java.awt.Graphics;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class Scribble2 extends Applet {
    
    private int last_x, last_y;
    private Color current_color = Color.black;
    private Button clear_button;
    private Choice color_choice;
    
    @Override
    public void init(){
        setBackground(Color.white);
        clear_button = new Button("clear");
        clear_button.setBackground(current_color);
        clear_button.setForeground(Color.white);
        add(clear_button);  
        
        color_choice = new Choice();
        color_choice.addItem("black");
        color_choice.addItem("green");
        color_choice.addItem("red");
        color_choice.addItem("yellow");
        color_choice.setBackground(current_color);
        color_choice.setForeground(Color.white);
        add(color_choice);
    }
    
    public boolean moseDown(Event e, int x, int y){
        last_x = x; last_y = y;
        return true;
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public boolean mouseDrag(Event e, int x, int y){
        Graphics g = this.getGraphics();
        g.setColor(current_color);
        g.drawLine(last_x, last_y, x, y);
        last_x = x; last_y = y;
        return true;
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public boolean action(Event event, Object arg){
        if(event.target == clear_button){
            Graphics g = this.getGraphics();
            java.awt.Rectangle r = this.bounds();
            g.setColor(this.getBackground());
            g.fillRect(r.x, r.y, r.width, r.height);
            return true;
        }
        else if(event.target == color_choice){
            if(arg.equals("black"))
                current_color = Color.BLACK;
            else if(arg.equals("green"))
                current_color = Color.GREEN;
            else if(arg.equals("red"))
                current_color = Color.RED;
            else if(arg.equals("yellow"))
                current_color = Color.yellow;
            return true;
        }
        else{
            return super.action(event, arg);
        }
    }
}
