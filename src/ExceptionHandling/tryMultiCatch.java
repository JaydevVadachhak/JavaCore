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
public class tryMultiCatch {
    public static void main(String[] args) {
        int i = args.length;
        
        try{
            String myString[] = new String[i]; //#1 error 1
            if(args[0].equals("Java"))
                System.out.println("first word is java");
            System.out.println("No of arguments: "+ i);
            int x = 18/i; //#2 error 2
            int y[] = {555,999};
            y[i] = x; //#3 error 3
        }
        catch(NullPointerException | ArithmeticException | ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }
}
