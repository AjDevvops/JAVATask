//Import Scanner
//public class
//Collect input for Unit Consumed
//Collect input for CostPerUnit

//Total = UnitConsumed * CostUnit;

//Print TotalCost..

import java.util.Scanner;
public class Eletricity{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter Units consumed: ");
   double UnitConsumed = input.nextDouble();

    System.out.print("Enter Cost per Unit: ");
    double CostUnit = input.nextDouble();

	double Total = UnitConsumed * CostUnit;

	System.out.println("Total Bill: " + Total);
   }
}
	

	