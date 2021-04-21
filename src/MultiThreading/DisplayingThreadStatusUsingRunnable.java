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

class ThreadName implements Runnable{
    @Override
    public void run(){
        try{
            //we use getId() - it used for displaying id of current thread
            System.out.println("Thread Id: " + Thread.currentThread().getName() + " is Running");
        }catch(Exception e){
            System.out.println("Exception occurs");
        }
    }
}

public class DisplayingThreadStatusUsingRunnable {
    public static void main(String[] args) {
        for(int i = 0; i<8; i++){
            Thread t = new Thread(new ThreadName());
            t.start();
        }
    }
}
