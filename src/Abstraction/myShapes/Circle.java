/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction.myShapes;

/**
 *
 * @author jaydev
 */
public abstract class Circle extends Geometry {
    public double r;
    
    public Circle(){
        r = 1.0;
    }
    
    public Circle(double r){
        this.r = r;
    }
    
    @Override
    public double area(){
        return PI*r*r;
    }
    
    @Override
    public double circumference(){
        return 2*PI*r;
    }
    
    double getRadius(){
        return r;
    }
}
