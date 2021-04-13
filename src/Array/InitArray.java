/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Array;

/**
 *
 * @author jaydev
 */
public class InitArray {
    
    public static void main(String[] args){
//        int array [] = new int [100]; //one method to initialize
        int array [] = {10, 20, 30, 40, 50}; //second method to initialize
        
        //print array elements
        for(int j = 0; j<array.length; j++){
            System.out.println(array[j]);
        }
        
        //average of elements
        int sum = 0;
        int avg;
        
        for(int i=0; i<array.length; i++){
            sum += array[i];
        }
        
        avg = sum/(array.length);
        System.out.println("avg is: "+avg);
    }
}
