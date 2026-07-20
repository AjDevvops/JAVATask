import java.util.Scanner;
   public class Quest7{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter First name: ");
	 String FirstName = input.next();
	
	    
	   System.out.print("Enter Second name: ");
	     String SecondName = input.next();

  	        System.out.print("Enter StudentID: ");
		 String IDnumber = input.next();
		
		   String Details = FirstName + " " + SecondName + " " + IDnumber ;

		   System.out.println("Hello" + " " + Details);

	}
      }