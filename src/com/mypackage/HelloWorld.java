// Here, you will compute a car’s
//gas mileage and the amount you spend per mile traveled. In particular, ask the user for the following.
// their first name (or their full name) (String),
// the price per gallon of gasoline paid at the time of the last fill-up (double),
// the total amount paid for the fill-up (double),
// an initial odometer reading (int),
// a final odometer reading (int).
//After inputting these values, compute the total miles driven, the number of gallons of gas used (total
//amount for fill-up / price per gallon), and the miles per gallon that the car achieved (total miles /
//number of gallons). Note that number of gallons and miles per gallon will both be doubles. Print this
//information using System.out.println statements
package com.mypackage;

import java.util.Scanner;
import java.text.DecimalFormat;

public class HelloWorld {
    public static void main (String[] args){
       // System.out.println("Hello World!");

        Scanner in = new Scanner(System.in);
        String name;
        double pricePerGallon;
        double paidForFillUp;
        int initialOdometer;
        int finalOdometer;
        double numberOfGallons;
        double milesPerGallon;
        int totalMiles;
        DecimalFormat df = new DecimalFormat("##.#");


        name = args[0];
        pricePerGallon = Double.parseDouble(args[1]);
        paidForFillUp = Double.parseDouble(args[2]);
        initialOdometer = Integer.parseInt(args[3]);
        finalOdometer = Integer.parseInt(args[4]);

        MPG newMPG = new MPG();
        newMPG.CalculateMPG(pricePerGallon, paidForFillUp, initialOdometer, finalOdometer);

        System.out.println(name + ", you traveled " + newMPG.totalMiles + " miles using " + df.format(newMPG.numberOfGallons)
                + " gallons of gas with an mpg of " + df.format(newMPG.milesPerGallon));







        /*numberOfGallons = paidForFillUp / pricePerGallon;
        totalMiles = finalOdometer - initialOdometer;
        milesPerGallon = totalMiles / numberOfGallons;

        System.out.println(name + ", you traveled " + totalMiles + " miles using " + df.format(numberOfGallons)
                + " gallons of gas with an mpg of " + df.format(milesPerGallon));

        MPG newMPG = new MPG();
        System.out.println("Output with a class: ");
        newMPG.CalculateMPG(pricePerGallon, paidForFillUp, initialOdometer, finalOdometer);
        System.out.println(name + ", you traveled " + newMPG.totalMiles + " miles using " + df.format(newMPG.numberOfGallons)
                + " gallons of gas with an mpg of " + df.format(newMPG.milesPerGallon)); */




    }
}
