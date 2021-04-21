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

class TA extends Thread{
    @Override
    public void run(){
        try{
            System.out.println("First T Started Running");
            sleep(10000);
            System.out.println("First T Ending");
        } catch (InterruptedException ex) {
            Logger.getLogger(TA.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}

class TB extends Thread{
    @Override
    public void run(){
        System.out.println("Second T Started Running");
        System.out.println("Second T Suspended");
        suspend();
        System.out.println("Second T Runs Again");
    }
}

public class ThreadMethods2 {
    public static void main(String[] args) {
        try{
            TA a = new TA();
            TB b = new TB();
            
            a.start();
            b.start();
            
            System.out.println("Revive second t");
            b.resume();
            
            System.out.println("Second went for 10 sec sleep");
            b.sleep(10000);
            
            System.out.println("Second thread wake up and running");
            
            System.out.println("Demo over");
            
        }catch(Exception e){
            
        }
    }
}
