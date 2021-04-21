/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

/**
 *
 * @author jaydev
 */

class ThreadX implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread a with i = "+ -1*i);
        } 
        System.out.println("Exit From ThreadA");
    }
}

class ThreadY implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread b with i = "+ 2*i);
        } 
        System.out.println("Exit From ThreadB");
    }
}

class ThreadZ implements Runnable{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread c with i = "+ (2*i-1));
        } 
        System.out.println("Exit From ThreadC");
    }
}

public class RunnableDemo1 {
    public static void main(String[] args) {
        //method 1 to invoke/call
        ThreadX x = new ThreadX();
        Thread t1 = new Thread(x);
        
        ThreadY y = new ThreadY();
        Thread t2 = new Thread(y);
        
        //method 2 to invoke/call
        Thread t3 = new Thread(new ThreadZ());
        
        t1.start();
        t2.start();
        t3.start();
        
        System.out.println("Exiting From demo of thread using Runnable");
    }
}
