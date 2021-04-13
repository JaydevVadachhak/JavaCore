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
public abstract class Eclipse extends Geometry {
    double a,b;

    public Eclipse() {
        a = 2.0;
        b = 3.0;
    }

    public Eclipse(double a, double b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public double area(){
        return PI*a*b;
    }
    
    @Override
    public double circumference(){
        return PI*(a+b);
    }
    
    double getMinorAxis(){
        return a;
    }
    
    double getMajorAxis(){
        return b;
    }
}
