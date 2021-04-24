/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream.byteStreamClasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaydev
 */
public class FileOutputStreamArray {
    public static void main(String[] args) throws IOException {
        byte cities[] = {'D','E','L','H','I',' ','M','A','D','R','A','S','\n'};
        try {
            FileOutputStream fout = new FileOutputStream("cities.txt"); //you can see this file in main project dir
            fout.write(cities);
            fout.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(FileOutputStreamArray.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
