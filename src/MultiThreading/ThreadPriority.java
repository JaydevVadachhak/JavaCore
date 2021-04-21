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

class ThreadP extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread a with i = "+ -1*i);
        } 
        System.out.println("Exit From ThreadA");
    }
}

class ThreadQ extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread b with i = "+ 2*i);
        } 
        System.out.println("Exit From ThreadB");
    }
}

class ThreadR extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread c with i = "+ (2*i-1));
        } 
        System.out.println("Exit From ThreadC");
    }
}

public class ThreadPriority {
    public static void main(String[] args) {
        ThreadP a = new ThreadP();
        ThreadQ b = new ThreadQ();
        ThreadR c = new ThreadR();
        
        c.setPriority(Thread.MAX_PRIORITY);
        b.setPriority(b.getPriority()+1); //increase priority by 1
        a.setPriority(Thread.MIN_PRIORITY);
        
        a.start();
        b.start();
        c.start();
        
        System.out.println("End of Excecututions");
    }
}
