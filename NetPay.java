import java.util.Scanner;
public class NetPay{
  public static void main (String [] args){
  Scanner input = new Scanner (System.in);
  
   System.out.print("Enter Hours: ");
   double HourWorked = input.nextDouble();

   System.out.print("Enter Hour Rate: ");
   double HourRate = input.nextDouble();

   System.out.print("Enter Bonus: ");
   double Bonus = input.nextDouble();

   
   System.out.print("Enter Tax Rate: ");
   double TaxRate = input.nextDouble();

Double GrossPay = HourWorked * HourRate;
Double TaxAmount = (GrossPay * TaxRate)/100;
Double NetPay = GrossPay - TaxAmount;

System.out.println("GrossPay: " + GrossPay);
System.out.println("TaxAmount: " + TaxAmount);
System.out.println("NetPay: " + NetPay);

}
}









