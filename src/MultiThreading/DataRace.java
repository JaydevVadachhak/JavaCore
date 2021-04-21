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

class DataRace extends Thread{
    public static int x;
    @Override
    public void run() {
        for (int i = 0; i < 100; i++) {
            x+=1;
            x-=1;
        }
    }
    
    public static void main(String[] args) {
        x = 0;
        for (int i = 0; i < 100; i++) {
            new DataRace().start();
            System.out.println(x); //x not always 0
        }
    }
}
