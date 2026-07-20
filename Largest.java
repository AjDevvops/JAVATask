import java.util.Scanner;
public class Largest{
public static void main(String [] args){
	
	int largest = 0; 
	int count = 1;
	  

	        while(count <= 10 ){
		
		System.out.print("Enter Number: ");
		int Number = input.nextInt();  
		count++;

		if (Number > largest){
		largest = Number;
		
		}

	}
		System.out.println("Largest is " + largest);
}
}