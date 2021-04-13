/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticScopeRule;

/**
 *
 * @author jaydev
 */
public class StaticScope {
//    main scope
    public static void main(String[] args) {
        int x = 10;
//        scope of if..else block
        if(x==10){
            int y = 20;
            System.out.println("x and y is: "+ x + " " + y);
            x = y *2;
        }
//        y = 100; //Error because scope of y is not accessible outside
        System.out.println("x is: "+x);
    }
}
