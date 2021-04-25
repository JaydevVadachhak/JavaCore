/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.Color;
import java.awt.Frame;
import java.awt.Panel;

/**
 *
 * @author jaydev
 */
public class CreatingPanel {
    public static void main(String[] args) {
        Frame frame = new Frame("Frame in java");
        Panel panel = new Panel();
        panel.resize(100, 100);
        panel.setBackground(Color.red);
        frame.resize(500, 500);
        frame.setBackground(Color.white);
        frame.add(panel);
        frame.setLayout(null);
        frame.show();
    }
}
