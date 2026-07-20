import java.util.Scanner;
public class Arithmetic{
   public static void main (String [ ] args){
	
Scanner input = new Scanner(System.in);
	  
	   System.out.println("Enter 1st Interger");
	      int number1 = input.nextInt();

	         System.out.println("Enter Second Interger");
	      int number2 = input.nextInt();

	           System.out.println("Enter third Interger");
	      int number3 = input.nextInt();

		   System.out.println("Enter Fourth Interger");
	      int number4 = input.nextInt();
		
	
	int sum = number1 + number2 + number3 + number4;
		   System.out.println("The total number: " + sum);

		  int Average = sum % 4;
		    System.out.println("The Average: " + Average);

		     int Product = number1 * number2 * number3 * number4;
			System.out.println("The product: " + Product);

		if (number1>number2 && number1>number3 && number1>number4){
		  System.out.println("Number 1 is the Largest");
}
		if (number1<number2 && number1<number3 && number1<number4){
		  System.out.println("Number 1 is the Smallest");
}
 		if (number2>number1 && number2>number3 && number2>number4){
		  System.out.println("Number 1 is the Largest");
}
		if (number2<number1 && number2>number3 && number2<number4){
		  System.out.println("Number 2 is the Smallest");
}

		if (number3>number1 && number3>number2 && number3>number4){
		  System.out.println("Number 3 is the Largest");
}
		if (number3<number1 && number3<number2 && number3<number4){
		  System.out.println("Number  is the Largest");
}
		if (number4>number1 && number4>number2 && number4>number3){
		  System.out.println("Number 4 is the Largest");
}
		if (number4<number1 && number4<number2 && number4<number3){
		  System.out.println("Number  is the Largest");
}

}
}




















