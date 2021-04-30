/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 *
 * @author jaydev
 */
public class InetAddressExample {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress ip = InetAddress.getByName("www.javatpoint.com"); //url format should be same
        
        System.out.println(ip.getHostName());
        System.out.println(ip.getHostAddress());
    }
}
