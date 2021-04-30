/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking.DatagramSocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

/**
 *
 * @author jaydev
 */

//1. First Run Receiver.java
//2. After Sender.java

public class Sender {
    public static void main(String[] args) throws SocketException, UnknownHostException, IOException {
        DatagramSocket ds = new DatagramSocket();
        String str = "Welcome to JavaCore - Networking";
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), ip, 3000);
        ds.send(dp);
        ds.close();
    }
}
