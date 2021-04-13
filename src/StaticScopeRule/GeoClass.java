/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticScopeRule;

/**
 *
 * @author jaydev
 */

class Circle{
    //scope of this below x,y,z is within this Circle class only
    //not accessible outside from this class
    float x = (float) 0.0;
    float y = (float) 4.5;
    float z = (float) 3.4;
    
    float area(){
        return(float) (3.14*z*z);
    }
}

class Box{
    //scope of this below x,y,z is within this Box class only
    //not accessible outside from this class
    float x = 2;
    float y = (float) 2.5;
    float z = (float) 1.3;
    
    float area(){
        return(2*(x*y+y*z+z*x));
    }
}

public class GeoClass {
    //scope of this below x,y is within this GeoBox class only
    //not accessible outside from this class
    static float x = 50;
    float y = 40;
    public static void main(String[] args) {
        Box b = new Box();
        Circle c = new Circle();
        System.out.println("Geoclass variable x is: "+ x);
        System.out.println("box variable " + b.x );
        System.out.println("box area "+ b.area());
        System.out.println("circle variable "+ c.x);
        System.out.println("circle area "+c.area());
    }
}
