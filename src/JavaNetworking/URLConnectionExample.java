/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking;

import java.io.IOException;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

/**
 *
 * @author jaydev
 */
public class URLConnectionExample {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://javatpoint.com/java-tutorial");
        
        URLConnection urlconn = url.openConnection();
        
        InputStream stream = urlconn.getInputStream();
        
        int b;
        while((b = stream.read()) != -1){
            System.out.print((char)b);
        }
    }
}
