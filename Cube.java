import java.util.Scanner;
public class Cube{
   public static void main (String [ ] args){
     Scanner input = new Scanner(System.in);

	System.out.println("Enter first Integer");
	   int numberOne = input.nextInt();

	  System.out.println("Enter second Interger");
	     int numberTwo = input.nextInt();

		int cubeOne = numberOne * numberOne * numberOne;
		   System.out.println("The cube of number One: " + cubeOne);

	        int cubeTwo = numberTwo * numberTwo * numberTwo;
		   System.out.println("The cube of numberTwo: " + cubeTwo);
		
		int ProductOfCubes = cubeOne * cubeTwo;
		   System.out.println("The product of two number is: " + ProductOfCubes);
	 	  
		   if(cubeOne > cubeTwo){
		      int cubeRemain = (cubeOne%cubeTwo);
			System.out.println("The remain is: " + cubeRemain);
}
			   if(cubeTwo > cubeOne){
			      int cubeRemain = (cubeTwo%cubeOne);
			         System.out.println("The remain is: " + cubeRemain);
}

}
}