/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author jaydev
 */

class Animal{
    String color = "black";
}

class Dog extends Animal{
    String color = "White";
    
    void printColor(){
        System.out.println(color); //color of this class itself
        System.out.println(super.color); //color of superclass - this is how super keyword works
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.printColor();
    }
}
