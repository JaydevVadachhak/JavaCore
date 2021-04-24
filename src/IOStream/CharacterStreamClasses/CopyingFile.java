/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream.CharacterStreamClasses;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author jaydev
 */
public class CopyingFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File infile = new File("input.dat");
        File outfile = new File("output.dat");
    
        FileReader ins = null;
        FileWriter outs = null;
        
        try{
            ins = new FileReader(infile);
            outs = new FileWriter(outfile);
            int ch;
            while((ch = ins.read()) != -1){
                outs.write(ch);
            }
        }catch(Exception e){
            System.out.println(e);   
        }finally{
            ins.close();
            outs.close();
        }
    }
}
