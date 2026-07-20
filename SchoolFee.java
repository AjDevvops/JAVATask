import java.util.Scanner;
   public class SchoolFee{
     public static void main (String [] args){
       Scanner input = new Scanner (System.in);
	    
          System.out.println("Enter Fee: ");
	   int amount =input.nextInt();
	
	   if (amount % 50 != 0) {
                System.out.println("Error: The amount is not a multiple 50.");
                return;
            }

            int 1000note = amount / 1000;
            amount %= 1000;


            int 500note = amount / 500;
            amount %= 500;  


            int 200note = amount / 200;
            amount %= 200;  

           
            int 100note = amount / 100;
            amount %= 100; 

            int notes50 = amount / 50;

