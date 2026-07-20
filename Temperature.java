//Import Scanner
//declear public class
//Collect input for Temperature

//Concert Celsius = Temperature * 9/5
//Convert to Fahrenheit = Celsius + 32

//Print Fahrenheit..

import java.util.Scanner;
public class Q3{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter Temperature: ");
   double Temperature = input.nextDouble();

   Double Convert = Temperature * 9/5;
   Double Fahrenheit = Convert + 32;

System.out.println("Fahrenheit: " + Fahrenheit);
   }
}










