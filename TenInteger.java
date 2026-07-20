//import java scanner from library
//declare public class name
//declare main method
//import scanner method
//initialize smallest variable to 0
//initialize couunter varaible to 10
//use while loop to check if count variable is less than 10
//Allow user Enter first number for to compare for smallest interger entered
//Initialize the number vairable as Number 
//Use while loop to count number of input from the user 
// if the number is lesser than than smallest number enteredcls
// print the PoistiveNumber
// print the NegativeNumber
// print the largest Number

import java.util.Scanner;
public class TenInteger{
  public static void main (String [] args){
    

	int NegativeNumber = 0;
	int PositiveNumber = 0;

	Scanner input = new Scanner(System.in);
	int largestNumber = 0;
	int count = 1;

	
	        while(count <= 10){
		System.out.print("Enter Number: ");
		int Number = input.nextInt();  
		
		if (Number > 0){
		Number = PositiveNumber;
		PositiveNumber++;}

		if (Number < 0){
		Number = NegativeNumber;
		NegativeNumber++;}

		if (Number > largestNumber){
		largestNumber = Number;}

	count++;
}
		System.out.println("Number of Positive: " + PositiveNumber);
		System.out.println("Number of Negative: " + NegativeNumber);
		System.out.println("Largest number: " + largestNumber);
}
}