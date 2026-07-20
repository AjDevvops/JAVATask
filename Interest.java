//Import Scanner
//public class
//Collect input for Principal
//Collect input for Rate
//Collect input for Time

//Concert Interest = Principal * Rate * Time;
//Concert Total = Principal * Interest;

//Print Interest..
//Print Total..

import java.util.Scanner;
public class Interest{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter Principal: ");
   double Principal = input.nextDouble();

   System.out.print("Enter Rate: ");
   double Rate = input.nextDouble();

   System.out.print("Enter Time: ");
   double Time = input.nextDouble();

double Interest = Principal * Rate * Time;
double Total = Principal + Interest;

System.out.println ("Simple Interest: " + Interest);
System.out.println ("Total Amount: " + Total);

}
}