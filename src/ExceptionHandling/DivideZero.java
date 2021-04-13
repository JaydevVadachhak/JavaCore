/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ExceptionHandling;

/**
 *
 * @author jaydev
 */
public class DivideZero {
    
    static int function(int x, int y){
        try{
            int a = x/y;
            return a;
        }catch(ArithmeticException e){
            System.out.println(e);
        }
        return 0;
    }
    
    public static void main(String[] args) {
        int result = function(12, 0); //exception occurs here
        System.out.println(result);
    }
}
