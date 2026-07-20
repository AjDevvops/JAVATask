import java.util.Scanner;
   public class Negative{
     public static void main (String [] args){
       Scanner input = new Scanner (System.in);
	    
          System.out.println("Input digits: ");
	    int number = input.nextInt();
	
	int numberOne = number%10;
	int numberTwo = (number/10)%10;
	int numberThree = (number/100)%10;
	int numberFour = (number/1000)%10;

	System.out.println(numberOne + " " + numberTwo + " " + numberThree + " " + numberFour );
}
}
