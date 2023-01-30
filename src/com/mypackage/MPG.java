package com.mypackage;

public class MPG {
    public double milesPerGallon;
    public int totalMiles;
    public double numberOfGallons;
    public MPG(){
        milesPerGallon = 0.0;
        totalMiles = 0;
        numberOfGallons = 0.0;
    }

    public void CalculateMPG(double pricePerGallon, double paidForFillUp, int initialOdometer, int finalOdometer){
        numberOfGallons = paidForFillUp / pricePerGallon;
        totalMiles  = finalOdometer - initialOdometer;
        milesPerGallon = totalMiles/ numberOfGallons;
    }

}
