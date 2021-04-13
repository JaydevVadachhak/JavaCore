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
public class StaticMetod {
    
    //static method: accessible in main method too.
    public static int bigger(int a, int b){
        if(a>b){
            return a;
        }
        else{
            return b;
        }
    }
    
    public static void main(String[] args) {
        //here we've used bigger class inside main method
        System.out.println(StaticMetod.bigger(6, 10));
    }
}
