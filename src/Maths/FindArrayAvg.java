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
public class FindArrayAvg {
    public static void main(String[] args) {
        int sum = 0;
        int avg;
        ArrayList <Integer> l = new ArrayList<>();
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Total no you want to take average");
        int number = s.nextInt();
        
        System.out.println("Enter input");
        for(int i=0; i<number; i++){
            int j = s.nextInt();
            l.add(j);
            sum += l.get(i);
        }
        
        System.out.println("sum is: "+ sum);
        avg = sum/number;
        System.out.println("avg is: "+ avg);
    }
}
