import java.util.Scanner;
public class LargestTwo{
	public static boolean LargestTwoNumber(int n, int b){
	
	if (n > b){
		System.out.println(n + " is greater than " + b);
	}
	else{
		System.out.println(b + " is greater than " + n);
}
return true;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int numberInput = input.nextInt();

		System.out.print("Enter second Number: ");
		int numberTwo = input.nextInt();

		boolean largestResult = LargestTwoNumber(numberInput,numberTwo);
		System.out.println(largestResult);

	}
}