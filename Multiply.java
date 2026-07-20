import java.util.Scanner;
public class Multiply{
public static void main (String [] args){
Scanner input = new Scanner (System.in);

    System.out.print("Enter first Integer: ");
      int num1 = input.nextInt();
	
	  System.out.print("Enter second Integer: ");
	    int num2 = input.nextInt();

		 int Product  = num1 * num1;
		  int Cube = num2 * num2 * num2;

                   if (Product%Cube==0){
			System.out.println("Result: Yes, " + Product + " is a multiple of " + Cube + ".");
}

 if (Product%Cube==1){
			System.out.println("Result: No, " + Product + " is not a multiple of " + Cube + ".");
}
}
}