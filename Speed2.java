//public class
//Collect input for Distance
//Collect input for Hour
//Collect input for Minutes
//Convert Time = Hour + Minute/60

//AverageSpeed = Distance/2

//Print Speed.

import java.util.Scanner;  
public class Speed2{
  public static void main(String [] args){
   Scanner input = new Scanner (System.in);
   
        System.out.print("Enter Distance in Km: "); 
	Double DistanceInKilometer = input.nextDouble();
	
	System.out.print("Enter Hour: "); 
	Double TimeInHour = input.nextDouble();

	System.out.print("Enter Minute: "); 
	Double TimeInMinutes = input.nextDouble();

	
	Double Time = TimeInHour + TimeInMinutes/60;
	Double AveSpeed =  DistanceInKilometer/Time;

	System.out.println("Distance: " + AveSpeed);
}
}