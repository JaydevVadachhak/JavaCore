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

@SuppressWarnings("serial")
        //our own exception class
class MyException extends Exception{ 

    public MyException(String msg) {
        super(msg);
    } 
}

public class testThrowExa {
    public static void main(String[] args) {
        int x = 5; int y = 1000;
        try{
            float z = x/(float)y;
            if(z<0.01) throw new MyException("given data is not proper"); //throw we used here
        }
        catch(MyException e){
            System.out.println(e);
        }
        finally{
            System.out.println("finally printed");
        }
    }
}
