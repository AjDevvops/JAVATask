//Import Scanner
//public class
//Collect input for Weight
//Collect input for Height

//Convert to BMI = Height / Height*Height;

//Print BMI..

import java.util.Scanner;
public class Bmi{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter Weight: ");
   double Weight = input.nextDouble();

    System.out.print("Enter Height: ");
   double Height = input.nextDouble();

   Double ConvertBMI = Weight / (Height*Height);

System.out.println("BMI: " + ConvertBMI);
   }
}