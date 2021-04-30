/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking.DialogueCommunication;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.*;

/**
 *
 * @author jaydev
 */
public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(3333);
        Socket s = ss.accept();
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = "", str2 = "";
        
        while (!str1.equals("stop")) {            
            str1 = dis.readUTF();
            System.out.println(str1);
            
            str2 = br.readLine();
            dout.writeUTF(str2);
            dout.flush();
        }
        dis.close();
        s.close();  
        ss.close();
    }
}
