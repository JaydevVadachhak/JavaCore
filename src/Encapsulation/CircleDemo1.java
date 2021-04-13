/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

/**
 *
 * @author jaydev
 */

class Circle{
    double x,y;
    double r;
    
    double circumference(){
        return 2*3.14*r;
    }
    
    double area(){
        return (22/7)*r*r;
    }
}

public class CircleDemo1 {
    public static void main(String[] args){
        Circle c = new Circle();
        c.x = 0;
        c.y = 0;
        c.r = 10.5;
        System.out.println("Circumference is: "+c.circumference());
        System.out.println("Area is: "+ c.area());
    }
}
