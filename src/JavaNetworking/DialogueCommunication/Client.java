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
public class Client {
    public static void main(String[] args) throws IOException {
        
        Socket s = new Socket("127.0.0.1",3333);
        DataInputStream dis = new DataInputStream(s.getInputStream());
        DataOutputStream dout = new DataOutputStream(s.getOutputStream());
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String str1 = "", str2 = "";
        
        while (!str1.equals("stop")) {            
            str1 = br.readLine();
            dout.writeUTF(str1);
            dout.flush();
            str2 = dis.readUTF();
            System.out.println(str2);
        }
        dis.close();
        s.close();  
    }
}
