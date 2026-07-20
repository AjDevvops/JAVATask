import java.util.Scanner;
   public class Quest8{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter Integer: ");
	  int Number = input.nextInt();

		int Num = Number%2;
				

	    if (Number%2 == 0){
	      System.out.println("this number is an Even Number");
		}

		    if (Number%2 == 1){
	      System.out.println("this number is an Odd Number");
		}
}
}


