/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Inheritance;

import java.util.Date;

/**
 *
 * @author jaydev
 */

//class 1 - Person
class Person{
    String name;
    Date dob;
    int mob;
    
    void readData(String name, Date dob, int mob){
        this.name = name;
        this.dob = dob;
        this.mob = mob;
    }
    
    void printData(){
        System.out.println("Name is "+ name);
//        dob.printDate();
        System.out.println("Mobilr no is "+mob);
    }
}

//class 2 - Student - sub class <-- person
class Student extends Person{
    String Institution;
    int[] qualify = new int[20];
    int rollNo;
    int[] marks = new int[5];
    
    void printStudentData(){
        printData();
        System.out.println("Insttitution is "+ Institution);
        System.out.println("Roll No is "+ rollNo);
        
        for(int i=0; i<qualify.length; i++){
            System.out.println("Marks "+i+" : "+ qualify[i]);
        }
        for(int m=0; m<marks.length; m++){
            System.out.println("Result "+m+" : "+marks[m]);
        }
    }
}

//class 3 - Employee - sub class <-- person
class Employee extends Person{
    int empNo;
    int organization;
    int[] salaryinfo = new int[12]; 
    
    void printEmployeeData(){
        printData();
        System.out.println("Insttitution is "+ organization);
        System.out.println("Roll No is "+ empNo);
        
        for(int s=0; s<salaryinfo.length; s++){
            System.out.println("salary "+s+" : "+salaryinfo[s]);
        }
    }
}
        

//class 4 - Main class
public class InheritanceDemo1 {
    Person p = new Person();
    //code with p object
    Student s = new Student();
    //code with s object
    Employee e = new Employee();
    //code with e object
}
