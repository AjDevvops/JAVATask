import java.util.Scanner;
public class Result{
  public static void main(String [] args){
  Scanner input = new Scanner (System.in);
        
    System.out.print("Enter Destination: ");
    String Destination = input.next();

      System.out.print("Enter Distance: ");
      Double Distance = input.nextDouble();

         System.out.print("Fuel Price: ");
         Double FuelPrice = input.nextDouble();
	
         System.out.print("Enter Milage: ");
         Double Milage = input.nextDouble();

	Double FuelNeeded = Distance*Milage;
	Double TotalCost = FuelNeeded *FuelPrice;
	Double SplitCost = TotalCost/2;

	System.out.printf("Fuel Needed to go to %s is %.2f%n " , Destination, FuelNeeded);
        System.out.printf("The total cost to go to %s is %.2f%n" , Destination , TotalCost);
	System.out.printf("Split Cost of the Journey is %.2f%n", SplitCost);

	}
}