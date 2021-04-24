/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletBasic;

import java.applet.Applet;
import java.awt.*;

/**
 *
 * @author jaydev
 */
public class AppletInit extends Applet {
    int x,y,w,h;
    
    @Override
    public void init(){
        resize(300,400);
        setBackground(Color.BLUE);
//        try{
//            x = Integer.parseInt(getParameter("xVal"));
//            y = Integer.parseInt(getParameter("yVal"));
//            w = Integer.parseInt(getParameter("wVal"));
//            h = Integer.parseInt(getParameter("hVal"));
//        }catch(NumberFormatException e){
//            System.out.println(e);
//        }
    }
    
    @Override
    public void paint(Graphics g){
        g.drawString("Jaydev", 10, 100);
//        try{
//            g.drawRect(x, y, w, h);
//        }catch(NumberFormatException e){
//            
//        }
    }
}
