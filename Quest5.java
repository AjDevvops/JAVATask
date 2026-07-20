import java.util.Scanner;
   public class Quest5{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter Length: ");
	 int Length = input.nextInt();

	System.out.print("Enter Width: ");
	 int Width = input.nextInt();

	int sum = Length * Width;

	System.out.println("Area: " + sum);
   }
}