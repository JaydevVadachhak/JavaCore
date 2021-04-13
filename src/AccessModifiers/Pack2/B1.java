/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers.Pack2;

/**
 *
 * @author jaydev
 */

//if we not specify any access modifiers - 'it's default modifiers' by default
class B1 {
    public static void main(String[] args) {
        System.out.println("Im from class B1 - but object of class A1 will not work here because I'm declared in other directory");
//        A1 obj = new A1(); //uncommenting this will give an error
    }
}
