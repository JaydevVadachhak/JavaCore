/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream.byteStreamClasses;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author jaydev
 */
public class FileInputStream1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream fin = new FileInputStream("test.txt");
        int i = 0;
        while ((i=fin.read())!=-1) {   //read all sentences from test.txt (until -1)        
            System.out.print((char)i);
        }
        fin.close();
    }
}
