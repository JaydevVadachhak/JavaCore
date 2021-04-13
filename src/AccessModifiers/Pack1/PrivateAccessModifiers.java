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

//only within class - Private Modifiers - can accessible - not even in sub class

class PrivateClass{
    private int a = 400; //within this class only
    public void msg(){
        System.out.println("class privateclass hello");
//        System.out.println("class privateclass hello" + a);
    }
}

public class PrivateAccessModifiers {
    public static void main(String[] args) {
        PrivateClass obj = new PrivateClass();
//        System.out.println(obj.a); //a has private access in private class so can't use here
        obj.msg();
    }
}


