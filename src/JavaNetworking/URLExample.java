/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking;

import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author jaydev
 */
public class URLExample {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("https://www.google.com");
        
        System.out.println("Prorocol: " + url.getProtocol());
        System.out.println("Host: " + url.getHost());
        System.out.println("Port Number: " + url.getPort());
        System.out.println("File Name: "+ url.getFile());
        
    }
}
