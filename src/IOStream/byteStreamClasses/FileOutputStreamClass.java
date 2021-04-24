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
public class FileOutputStreamClass {
    public static void main(String[] args) throws FileNotFoundException, IOException {
//        FileOutputStream fout = new FileOutputStream("C:/Users/jayde/Desktop/test.txt");
//        enter path where you want to edit file - by default it will created in project dir - see above line of code
        FileOutputStream fout = new FileOutputStream("test.txt");
        fout.write(25); //we are writing to the test file - these numbers are ASCII code
        fout.close();
        System.out.println("File Writing is over");
    }
}
