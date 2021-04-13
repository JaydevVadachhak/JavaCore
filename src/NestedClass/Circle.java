/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NestedClass;

/**
 *
 * @author jaydev
 */
public class Circle {
    static double x,y,r;
    
    Circle(double r){
        Circle.r = r;
    }
    
    //nested class
    static class Point{
        double x,y;
        
        void Display(){
            System.out.println("x and y is: "+ this.x+" "+this.y);
        }
        
        Point(double a, double b){
            this.x = a;
            this.y = b;
        }
    }
    
    boolean isInside(Point p){
        double dx = p.x - x;
        double dy = p.y - y;
        double distance = Math.sqrt((dx*dx)+(dy*dy));
        if(distance < r){
            return true;
        }else{
            return false;
        }
    }
    
    //main method
    public static void main(String[] args) {
        Circle c = new Circle(2.0);
        Point pa = new Point(4.0,3.0);
        System.out.println("checking: "+ c.isInside(pa));
    }
}
