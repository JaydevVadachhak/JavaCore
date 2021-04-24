/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream.byteStreamClasses;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author jaydev
 */
public class FileOutputStream1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fout = new FileOutputStream("test.txt");
        
        String s = "Welcome to JavaCore";
        byte b[] = s.getBytes();
        
        fout.write(b);
        fout.close();
    }
}
