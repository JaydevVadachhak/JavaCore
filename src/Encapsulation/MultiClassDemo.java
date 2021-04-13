/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Encapsulation;

class Circle1{
    double x,y;
    double r;
    
    double circumference(){
        return 2*3.14*r;
    }
    
    double area(){
        return (22/7)*r*r;
    }
    
    void setCircle(double a, double b, double c){
        x=a;
        y=b;
        r=c;
    }
}

class Box1{
    double width;
    double height;
    double depth;
    
    double volume(){
        double v;
        v = width*height*depth;
        return v;
    }
    
    double area(){
        double a;
        a = (width*height + height*depth + depth*width)*2;
        return a;
    }
}

public class MultiClassDemo {
    public static void main(String[] args){
        Circle1 c;
        c = new Circle1();
        Box1 b;
        b = new Box1();
        
//        c.x = 0;
//        c.y = 0;
//        c.r = 10.5;

        c.setCircle(0, 0, 5.3);

        b.depth = 3.4;
        b.width = 4.5;
        b.height = 5.5;
        
        System.out.println("Circumference is: "+c.circumference());
        System.out.println("Area is: "+ c.area());
        
        System.out.println("Area of box is: "+ b.area());
        System.out.println("Volume of box is: "+ b.volume());
    }
}
