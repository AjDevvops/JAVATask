import java.util.Scanner;
  public class Quest9{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);

	System.out.print("Enter First name: ");
	 String FirstName = input.next();

	System.out.print("Enter Second name: ");
	 String SecondName = input.next();

	  String Names = FirstName + " " + SecondName;

	 System.out.println("Hello," + " " + Names);

   }
}