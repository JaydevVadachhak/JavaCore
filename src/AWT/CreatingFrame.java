/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AWT;

import java.awt.Color;
import java.awt.Frame;

/**
 *
 * @author jaydev
 */
public class CreatingFrame {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        Frame frame = new Frame("Frame in java");
        frame.resize(500, 500);
        frame.setBackground(Color.white);
        frame.show();
    }
}
