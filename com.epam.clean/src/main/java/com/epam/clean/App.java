package com.epam.clean;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	//this is the CLIENT program
    	
    	//Simple Interest
        SimpleInterest simpleInterest = new SimpleInterest(10000,3,10);
        System.out.println("Amount after Simple Interest = " + simpleInterest.getSimpleInterest());
        
        //Compound Interest
        CompoundInterest compoundInterest = new CompoundInterest(10000,3,10,4);
        System.out.println("\nAmount after Compound Interest = " + compoundInterest.getCompoundInterest());
        
        //House Construction Program
        int area = 1000;
        
        HouseConstruction house1 = new HouseConstruction(area,"standard");
        System.out.println("\n\nTotal house cost for " + house1.getMaterial() +" materials and area " + house1.getArea()+ " sqft = INR " + house1.getEstimatedCost());
        
        HouseConstruction house2 = new HouseConstruction(area,"above standard");
        System.out.println("\nTotal house cost for " + house2.getMaterial() +" materials and area " + house2.getArea()+ " sqft = INR " + house2.getEstimatedCost());
        
        HouseConstruction house3 = new HouseConstruction(area,"high standard");
        System.out.println("\nTotal house cost for " + house3.getMaterial() +" materials and area " + house3.getArea()+ " sqft = INR " + house3.getEstimatedCost());
        
        HouseConstruction house4 = new HouseConstruction(area,"high standard and automated");
        System.out.println("\nTotal house cost for " + house4.getMaterial() +" materials and area " + house4.getArea()+ " sqft = INR " + house4.getEstimatedCost());
    
    }
}
