/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT.LayoutManagers;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Event;
import java.awt.*;

/**
 *
 * @author jaydev
 */
@SuppressWarnings("serial")
public class CardLayout extends Applet {
    CardLayout layout;
    @Override
    public void init(){
        layout = new CardLayout();
        setLayout(new java.awt.CardLayout());
        add("1", new Button("card1"));
        add("2", new Button("card2"));
        add("3", new Button("card3"));
        add("4", new Button("card4"));
        add("5", new Button("card5"));
    }
    
    @Override
    @SuppressWarnings("deprecation")
    public boolean keyDown(Event e, int key){
        layout.next(this);
        return(true);
    }

    private void next(CardLayout aThis) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
