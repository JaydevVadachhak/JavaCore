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
public class GeoMetry {
    static void display(float x, float y){
        System.out.println("Area = "+ x+ " Perimeter = "+ y);
    }
    
    public static void main(String[] args) {
        Circle c = new Circle((float) 2.5);
        Elipse e = new Elipse(2, (float) 1.2);
        Rectangle r = new Rectangle((float) 2.2, 4);
        
        GeoAnalyzer geoItem;
        
        geoItem = c;
        display(c.area(), c.perimeter());
        
        geoItem = e;
        display(e.area(), e.perimeter());
        
        geoItem = r;
        display(r.area(), r.perimeter());
    }
}
