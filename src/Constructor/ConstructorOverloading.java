/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/**
 *
 * @author jaydev
 */

class Circle3{
    double x,y;
    double r;
    
    double circumference(){
        return 2*3.14*r;
    }
    
    double area(){
        return (22/7)*r*r;
    }
    
    Circle3(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
    }
    
    Circle3(double r){
        x=0;
        y=0;
        this.r=r;
    }
    
    Circle3(Circle3 c){
        x=c.x;
        y=c.y;
        r=c.r;
    }
    
    Circle3(){
        x=0;
        y=0;
        r=1.0;
    }
}

public class ConstructorOverloading {
    public static void main(String[] args){
        Circle3 c1 = new Circle3(0,0,4.5);
        Circle3 c2 = new Circle3(1);
        Circle3 c3 = new Circle3(c1);
        Circle3 c4 = new Circle3();
        System.out.println("Circumference is: "+c1.circumference());
        System.out.println("Area is: "+ c1.area());
        System.out.println("Circumference is: "+c2.circumference());
        System.out.println("Area is: "+ c2.area());
        System.out.println("Circumference is: "+c3.circumference());
        System.out.println("Area is: "+ c3.area());
        System.out.println("Circumference is: "+c4.circumference());
        System.out.println("Area is: "+ c4.area());
    }
}
