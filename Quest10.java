import java.util.Scanner;
  public class Quest10{
    public static void main (String [] args){
      Scanner input = new Scanner(System.in);
         
	 System.out.println ("Enter Interger: ");
	   int Number = input.nextInt();
	    
	     int square = Number * Number;
	      int cube = Number * Number * Number;

	        System.out.println("The Square is: " + square);
		System.out.println("The cube is: " + cube);
  }
}