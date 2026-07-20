import java.util.Scanner;
   public class Quest2{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter First Integer: ");
	 int num1 = input.nextInt();

	System.out.print("Enter Second Integer: ");
	 int num2 = input.nextInt();

	System.out.print("Enter Third Integer: ");
	 int num3 = input.nextInt();

		int sum = num1 + num2 + num3;
		   System.out.println("The total number: " + sum);

		  int Average = sum % 3;
		    System.out.println("The Average: " + Average);
  }
}