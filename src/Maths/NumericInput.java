/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;
/**
 *
 * @author jaydev
 */

class Calculator{
    int i;
    int a = (int) Math.sqrt(i);
}

public class NumericInput {
    public static void main(String args[]){
        Calculator c = new Calculator();
        System.out.println("Enter number");
        c.i = Integer.parseInt(args[0]);
        System.out.println("Sqare root of "+c.i+" is "+c.a);
    }
}
