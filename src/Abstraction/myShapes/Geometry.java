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
public abstract class Geometry {
    static final double PI = 3.14;
    public abstract double area(); //abstract method has no body

    /**
     *
     * @return
     */
    public abstract double circumference();
}
