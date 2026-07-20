import java.util.Scanner;
   public class Quest1{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter Age: ");
	 int Age = input.nextInt();

	  int NextYear = 1;
	    
	    int Sum = Age + NextYear;
		
		System.out.println("Next year, you will be: " + Sum);
 }
}