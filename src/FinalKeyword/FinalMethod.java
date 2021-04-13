/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalKeyword;

/**
 *
 * @author jaydev
 */

abstract class base{
    final void fun(){
        System.out.println("let's have fun!");
    }
}

class  derived extends base{} //if we declared or override fun method here then it'll give an error

public class FinalMethod {
    public static void main(String[] args) {
        base b =  new derived();
        b.fun();
    }
}
