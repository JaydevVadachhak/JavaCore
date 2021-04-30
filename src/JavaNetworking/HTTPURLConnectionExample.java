/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaNetworking;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author jaydev
 */
public class HTTPURLConnectionExample {
    public static void main(String[] args) throws MalformedURLException, IOException {
        URL url = new URL("https://javatpoint.com/java-tutorial");
        
        HttpURLConnection hurlconn = (HttpURLConnection) url.openConnection();
        
        for (int i = 1 ; i < 8; i++) {
            System.out.println(hurlconn.getHeaderFieldKey(i) +" = "+ hurlconn.getHeaderField(i));
            
        }
        
        hurlconn.disconnect();
    }
}
