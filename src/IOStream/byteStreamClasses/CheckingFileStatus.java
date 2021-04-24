/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package IOStream.byteStreamClasses;

import java.io.File;

/**
 *
 * @author jaydev
 */

//Note: time of running this program you need to give inputs (file name with extension as input) 

public class CheckingFileStatus {
    public static void getPaths(File f){
        System.out.println("Name: "+ f.getName());
        System.out.println("Path: "+ f.getPath());
        System.out.println("Parent: "+ f.getParent());
    }
    
    public static void getInfo(File f){
        if (f.exists()) {
            System.out.println("File exists");
            System.out.println(f.canRead() ? "File can readable" : "");
            System.out.println(f.canWrite() ? "File can writable" : "");
            System.out.println("File is last modified: "+ f.lastModified());
            System.out.println("File length(bytes): "+ f.length());
        }else{
            System.out.println("File doesn't exist");
        }
    }
    
    public static void main(String[] args) {
        File filetocheck;
        if(args.length > 0){
            for (int i = 0; i < args.length; i++) {
                filetocheck = new File(args[i]);    
                getPaths(filetocheck);
                getInfo(filetocheck);
            }
        }
        else{
            System.out.println("Usage: Java file test");
        }
    }
}
