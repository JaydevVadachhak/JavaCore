/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

/**
 *
 * @author jaydev
 */

//keyword abstract
abstract class bike{
    abstract void run();
}

class honda extends bike{
    void run(){
        System.out.println("honda running");
    }
}
public class AbstractionTest1 {
    public static void main(String[] args) {
        bike obj = new honda();
        obj.run();
    }
}
