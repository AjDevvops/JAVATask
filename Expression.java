//public class
//Collect input for first side
//Collect input for Second side
//Collect input for third side
//Collect input for Heigth
//initialize Expression with Double Double DataType
//Print..

import java.util.Scanner;
public class Area{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.println("Enter First Side");
   double FirstSide = input.nextDouble();

    System.out.println("Enter Second Side");
    Double SecondSide = input.nextDouble();

    System.out.println("Enter Third Side");
    Double ThirdSide = input.nextDouble();

     System.out.println("Enter height");
     double Height = input.nextDouble();




	Double Peremeter = FirstSide + SecondSide + ThirdSide;
	Double Area = SecondSide * ThirdSide/2;

	System.out.println (Peremeter);
	System.out.println (Area);
 }
}
