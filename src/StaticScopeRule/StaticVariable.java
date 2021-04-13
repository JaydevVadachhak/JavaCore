/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StaticScopeRule;

/**
 *
 * @author jaydev
 */

public class StaticVariable {
    //static word used to make variable global in java
    static int circleCount = 0; 
    public double x,y,r;
    
    //default constructor
    public StaticVariable(double x, double y, double r){
        this.x = x;
        this.y = y;
        this.r = r;
        circleCount++;
    }
    
    //overloading constructor
    public StaticVariable(double r){
        this(0.0,0.0,r);
        circleCount++;
    }
    
    //overloading constructor : arg is class object itself
    public StaticVariable(StaticVariable s){
        this(s.x, s.y, s.r);
        circleCount++;
    }
    
    //overloading constructor
    public StaticVariable(){
        this(0.0,0.0,0.1);
        circleCount++;
    }
    
    //defining methods of circle
    public double area(){
        return(3.14*r*r);
    }
    
    public double circumference(){
        return(3.14*2*r);
    }
    
    //main method
    public static void main(String[] args) {
        StaticVariable s1 = new StaticVariable();
        StaticVariable s2 = new StaticVariable(5);
        StaticVariable s3 = new StaticVariable(s1);
        System.out.println("s1: " + s1.circleCount + " and s2: " + s2.circleCount + " and s3: " + s3.circleCount);
    }
    
}
