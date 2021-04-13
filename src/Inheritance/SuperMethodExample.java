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

class Animal1{
    String color = "black";
    void eat(){
        System.out.println("eating");
    }
}

class Dog1 extends Animal1{
    String color = "White";
    
    @Override
    void eat(){
        System.out.println("eating in sub class");
    }
    
    void bark(){
        System.out.println("Barking");
    }

    void work(){
        super.eat();
        eat();
        bark();
    }
    
    void printColor(){
        System.out.println(color); //color of this class itself
        System.out.println(super.color); //color of superclass - this is how super keyword works
    }
}

public class SuperMethodExample {
    public static void main(String[] args) {
        Dog1 d = new Dog1();
        d.work();
    }
}
