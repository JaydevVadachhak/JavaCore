/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MultiThreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jaydev
 */

class ClassA extends Thread{
    @Override
    public void run(){
        System.out.println("Starting Thread A");
        for(int i = 0; i<=5; i++){
            if(i==1)
                yield(); //yield() method
            System.out.println("From Thread A: i = " + i);
        }
        System.out.println("Exit from A");
    }
}

class ClassB extends Thread{
    @Override
    public void run(){
        System.out.println("Starting Thread B");
        for(int i = 0; i<=5; i++){
            System.out.println("From Thread B: i = " + i);
            if(i==2)
                stop(); //stop() method
        }
        System.out.println("Exit from B");
    }
}

class ClassC extends Thread{
    @Override
    @SuppressWarnings("deprecation")
    public void run(){
        System.out.println("Starting Thread C");
        for(int i = 0; i<=5; i++){
            System.out.println("From Thread C: i = " + i);
            if(i==3)
                try {
                    sleep(1000); //stop() method
            } catch (InterruptedException ex) {
                    System.out.println("Exception occurs");
            }
        }
        System.out.println("Exit from C");
    }
}

public class ThreadMethods1 {
    public static void main(String[] args) {
        ClassA a = new ClassA();
        ClassB b = new ClassB();
        ClassC c = new ClassC();
        
        a.start();
        b.start();
        c.start();
        
        System.out.println("Over");
    }
}
