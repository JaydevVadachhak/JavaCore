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
public class Rectangle implements GeoAnalyzer{
    
    @SuppressWarnings("PackageVisibleField")
    float l;
    @SuppressWarnings("PackageVisibleField")
    float w;

    public Rectangle(float l, float w) {
        this.l = l;
        this.w = w;
    }
    
    @Override
    public float area() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (l*w);
    }

    @Override
    public float perimeter() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2*(l+w));
    }
    
}
