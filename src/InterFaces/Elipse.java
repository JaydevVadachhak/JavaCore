/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InterFaces;

import InterFaces.interFaceAll.GeoAnalyzer;

/**
 *
 * @author jaydev
 */
public class Elipse implements GeoAnalyzer{
    
    @SuppressWarnings("PackageVisibleField")
    float a;
    @SuppressWarnings("PackageVisibleField")
    float b;

    public Elipse(float a, float b) {
        this.a = a;
        this.b = b;
    }
   
    @Override
    public float area() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (PI*a*b);
    }

    @Override
    public float perimeter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (PI*(a+b));
    }
    
}
