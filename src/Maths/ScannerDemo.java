/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Maths;

import java.util.*;

/**
 *
 * @author jaydev
 */
public class ScannerDemo {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Two Numbers");
        int a = s.nextInt();
        int b = s.nextInt();
        
        if(a>b){
            System.out.printf("max in between %d and %d is %d \n", a,b,a); //printf remember
        }else if(a==b){
            System.out.printf("%d and %d is equal \n",a,b);
        }else{
            System.out.printf("min in between %d and %d is %d \n",a,b,b);
        }
    }
}
