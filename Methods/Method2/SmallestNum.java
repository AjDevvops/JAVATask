import java.util.Scanner;
public class SmallestNum{
	public static boolean SmallestTwoNumber(int n, int b){
	
	if (n == b){
		System.out.println(n + " is the smallest");
	}
	else{
		System.out.println(b + " is the smallest");
}
return true;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int numberInput = input.nextInt();

		System.out.print("Enter second Number: ");
		int numberTwo = input.nextInt();

		boolean SmallestNumResult = SmallestTwoNumber(numberInput,numberTwo);
		System.out.println(SmallestNumResult);

	}
}