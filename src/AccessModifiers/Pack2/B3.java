/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers.Pack2;

import AccessModifiers.Pack1.A3; //we need to import this in order to have access of A3 class objects

/**
 *
 * @author jaydev
 */
public class B3 {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.msg();
    }
}
