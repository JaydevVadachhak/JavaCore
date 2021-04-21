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

class ThreadID extends Thread{
    @Override
    public void run(){
        try{
            //we use getId() - it used for displaying id of current thread
            System.out.println("Thread Id: " + Thread.currentThread().getId() + " is Running");
        }catch(Exception e){
            System.out.println("Exception occurs");
        }
    }
}

public class DisplayingStatusofThreadRunning {
    public static void main(String[] args) {
        for(int i = 0; i<8; i++){
            ThreadID obj = new ThreadID();
            obj.start();
        }
    }
}
