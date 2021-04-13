/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calculator;

import java.io.*;

/**
 *
 * @author jaydev
 */
public class DataInputStreamExp {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) throws IOException {
        Float rateOfInterest = new Float(0);
        Float principalAmount = new Float(0); //other way to declare or initialize float dt
        int noOfYears = 0;
        
        DataInputStream in = new DataInputStream(System.in);
        String tempString;
        
        System.out.println("Enter Principal Amount");
        System.out.flush();
        tempString = in.readLine();
        principalAmount = Float.valueOf(tempString);
        
        System.out.println("Emter rate of interest");
        System.out.flush();
        tempString = in.readLine();
        rateOfInterest = Float.valueOf(tempString);
        
        System.out.println("Enter no of years");
        System.out.flush();
        tempString = in.readLine();
        noOfYears = Integer.parseInt(tempString);
        
        float interestTotal = principalAmount*rateOfInterest*noOfYears;
        System.out.println("Total Interest: "+ interestTotal);
    }
}
