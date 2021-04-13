/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

/**
 *
 * @author jaydev
 */

//class 1 - super class
class Point2D{
    int x;
    int y;
    void display(){
        System.out.println("x = "+x+" and y = "+y);
    }
}

//class 2 - child class <-- point2d
class Point3D extends Point2D{
    int z;
    @Override
    void display(){
        System.out.println("x = "+x+" and y = "+y+" and z = "+ z);
    }
}

//class - Main class
class SimpleSingleInheritance {
    public static void main(String[] args) {
        Point2D p1 = new Point2D();
        Point3D p2 = new Point3D();
        p1.x = 100;
        p1.y = 10;
        p1.display();
        p2.x = 200;
        p2.y = 20;
        p2.z = 2000;
        p2.display();
    }
}
