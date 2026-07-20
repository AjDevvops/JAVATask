import java.util.Scanner;
 public class Quest6 {
  public static void main (String [] args){
    Scanner input = new Scanner(System.in);
       
	System.out.print ("Enter Amount: ");
	double Amount = input.nextDouble();

	System.out.print ("Enter Rate: ");
	double Rate = input.nextDouble();

	System.out.print ("Enter Time: ");
	int Time = input.nextInt();

	double Sum = Amount * Rate * Time;
	double Interest = Sum/100;

	System.out.println("Interest: " + " " + Interest);
   }
}