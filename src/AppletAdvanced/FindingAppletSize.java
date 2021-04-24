/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppletAdvanced;

import java.applet.Applet;
import java.awt.Dimension;
import java.awt.Graphics;

/**
 *
 * @author jaydev
 */
public class FindingAppletSize extends Applet {
    @Override
    public void paint(Graphics g){
        Dimension appletsize = this.getSize();
        int height = appletsize.height;
        int width = appletsize.width;
        
        g.drawString("applet size: " + height + " and " + width, 100, 100);
        showStatus("this is showstatus method");
    }
}
