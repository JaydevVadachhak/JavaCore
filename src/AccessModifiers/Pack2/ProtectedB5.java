/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers.Pack2;

import AccessModifiers.Pack1.ProtectedA5;

/**
 *
 * @author jaydev
 */
////protected class accessible within class, package, subclass
public class ProtectedB5 extends ProtectedA5{
    public static void main(String[] args) {
        ProtectedB5 obj = new ProtectedB5();
        obj.msg();
    }
}
