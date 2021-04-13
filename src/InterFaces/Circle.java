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
public class Circle implements GeoAnalyzer{
    
    @SuppressWarnings("PackageVisibleField")
    float radius;

    public Circle(float r) {
        radius = r;
    }
   
    @Override
    public float area() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates
        return (PI*radius*radius);
    }

    @Override
    public float perimeter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2*PI*radius);
    }
    
}
