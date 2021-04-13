/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author jaydev
 */

//command line input with java
public class Echo {
    public static void main(String[] args){
        for(int i=0; i<args.length;i++){
            System.out.print(args[i]+" ");
            System.out.print("\n");
        }
        System.exit(0);
    }
}
