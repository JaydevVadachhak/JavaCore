/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstraction;

import Abstraction.myShapes.Circle;
import Abstraction.myShapes.Geometry;
import Abstraction.myShapes.Rectangle;
import Abstraction.myShapes.Eclipse;

/**
 *
 * @author jaydev
 */
public class GeoDemo {
    public static void main(String[] args) {
        Geometry [] geoObjects = new Geometry[3];
        
        geoObjects[0] = new Circle(4.0) {};
        geoObjects[1] = new Rectangle(4.5, 5.6) {};
        geoObjects[2] = new Eclipse(2.3, 4.6) {};
        
        double totalArea = 0;
        
        for(int i=0; i<geoObjects.length; i++){
            totalArea += geoObjects[i].area();
        }
        
        System.out.println("Total Area: "+ totalArea);
    }
}
