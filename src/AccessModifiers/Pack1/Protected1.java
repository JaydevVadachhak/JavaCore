/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccessModifiers.Pack1;

/**
 *
 * @author jaydev
 */

//protected class accessible within class, package, subclass
class A4{
    protected int a = 800;
    void msg(){
        System.out.println(a);
    }
}

public class Protected1 {
    public static void main(String[] args) {
        A4 obj = new A4();
        System.out.println(obj.a);
        obj.msg();
    }
}
