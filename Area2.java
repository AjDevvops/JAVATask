//public class
//Collect input for first side
//Collect input for Second side
//Collect input for third side
//Collect input for Heigth

//Peremeter = FirstSide + SecondSide + thirdSide
//Area = SecondSide x Height / 2

//Print Peremeter..
//Print Area..

import java.util.Scanner;
public class Area2{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter First Side: ");
   double FirstSide = input.nextDouble();

    System.out.print("Enter Second Side: ");
    Double SecondSide = input.nextDouble();

    System.out.print("Enter Third Side: ");
    Double ThirdSide = input.nextDouble();

     System.out.print("Enter height: ");
     double Height = input.nextDouble();




	Double Peremeter = FirstSide + SecondSide + ThirdSide;
	Double Area = SecondSide * Height/2;

	System.out.println ("Peremeter: " + Peremeter);
	System.out.println ("Area: " + Area);
 }
}
