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
public abstract class Rectangle extends Geometry {
    double l,w;

    public Rectangle() {
        l = 10;
        w = 3;
    }
    
    public Rectangle(double l, double w){
        this.l = l;
        this.w = w;
    }
    
    @Override
    public double area(){
        return 1*w;
    }
    
    @Override
    public double circumference(){
        return 2*(l+w);
    }
    
    double getWidth(){
        return w;
    }
    
    double getLength(){
        return l;
    }
}
