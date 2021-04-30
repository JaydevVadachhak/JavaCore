/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking.ServerSocket;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author jaydev
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(6666);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        String str = dis.readUTF();
        System.out.println(str);
        ss.close();
    }
}
