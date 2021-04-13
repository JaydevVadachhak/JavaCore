/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers.Pack1;

/**
 *
 * @author jaydev
 */

class A{
    private A(){
        
    }
    void msg(){
        System.out.println("...");
    }
}

public class PrivateConstructor {
    public static void main(String[] args) {
//        A obj = new A(); //error private constructor can't accessible
    }
}
