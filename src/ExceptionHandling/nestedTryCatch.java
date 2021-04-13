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

//nested try-catch block
public class nestedTryCatch {
    public static void main(String[] args) {
        try{
            int a = args.length;
            int b = 30/a;
            System.out.println(a);
            if(a==1){
                a/=(a-a);
            }
            try{
                if(a==2){
                    int c[] = {2};
                    c[a] = 99; //arrayindexoutofbound
                }
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
