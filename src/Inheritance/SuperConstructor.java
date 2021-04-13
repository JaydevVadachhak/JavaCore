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

class car{
    car(){
        System.out.println("car is declared");
    }
}

class maruti extends car{
    maruti(){
        super(); //invoking super class constructor using super keyword
        System.out.println("maruti is declared");
    }
}
public class SuperConstructor {
    public static void main(String[] args) {
        maruti m = new maruti();
    }
}
