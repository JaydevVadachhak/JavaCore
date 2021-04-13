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
public class finallyExample {
    public static void main(String[] args) {
        int i = 0;
        String greetings[] = {"Hello", "Welcome", "Hi"};
        try{
            while(i<4){
                System.out.println(greetings[i++]);
            }
        }catch(Exception e){
            System.out.println(e.toString());
        }
        finally{
            System.out.println("reset index value to < 3");
        }
    }
}
