import java.util.Scanner;
 public class Divisible{
  public static void main (String [ ] args){
    Scanner input = new Scanner(System.in);

	System.out.println("Enter an integer");
	  int num = input.nextInt();

	     int Num = num % 7;

	    if (num%7==0){
		System.out.println("Number divisible by 7");
}
	      if (num%7==1){
		 System.out.println("Number is not Divisible by 7");
}
		if (num%2 == 0){
		   System.out.println("Number is Even");
}

		if (num%2 == 1){
		  System.out.println("Number is Odd");
}
}
}
          