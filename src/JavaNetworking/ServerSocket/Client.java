/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking.ServerSocket;

import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

/**
 *
 * @author jaydev
 */
public class Client {
    public static void main(String[] args) throws IOException {
        Socket s = new Socket("127.0.0.1",6666);
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        dout.writeUTF("Hello Server in java core networking");
        dout.flush();
        dout.close();
        s.close();
    }
}
