/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RuntimePolymorphism;

/**
 *
 * @author jaydev
 */

class bike{
    void run(){
        System.out.println("bike is running");
    }
}

class splendor extends bike{
    void run(){
        System.out.println("Splendor is running");
    }
}
public class RuntimePolyDemo1 {
    public static void main(String[] args) {
        splendor s = new splendor();
        s.run();
        bike b1 = new bike();
        b1.run();
        
        //upcasting - runtime polymorphism - dynamic binding
        bike b2 = new splendor(); //object of bike but dynamically method will be called of splendor
        b2.run();
    }
}
