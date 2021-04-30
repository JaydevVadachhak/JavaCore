/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking.DatagramSocket;

import java.io.IOException;
import java.net.*;

/**
 *
 * @author jaydev
 */

//1. First Run Receiver.java
//2. After Sender.java

public class Receiver {
    public static void main(String[] args) throws SocketException, IOException {
        DatagramSocket ds = new DatagramSocket(3000);
        byte[] buffer = new byte[1024];
        DatagramPacket dp = new DatagramPacket(buffer, 1024);
        ds.receive(dp);
        String str = new String(dp.getData(),0,dp.getLength());
        System.out.println(str);
        ds.close();
    }
}
