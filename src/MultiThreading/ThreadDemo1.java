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

class ThreadA extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread a with i = "+ -1*i);
        } 
        System.out.println("Exit From ThreadA");
    }
}

class ThreadB extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread b with i = "+ 2*i);
        } 
        System.out.println("Exit From ThreadB");
    }
}

class ThreadC extends Thread{
    @Override
    public void run(){
        for(int i = 1; i<=5; i++){
            System.out.println("From Thread c with i = "+ (2*i-1));
        } 
        System.out.println("Exit From ThreadC");
    }
}

public class ThreadDemo1 {
    public static void main(String[] args) {
        ThreadA a = new ThreadA();
        ThreadB b = new ThreadB();
        ThreadC c = new ThreadC();
        a.start();
        b.start();
        c.start();
        System.out.println("MultiThreading is over");
    }
}
