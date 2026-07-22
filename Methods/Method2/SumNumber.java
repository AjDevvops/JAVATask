import java.util.Scanner;
public class SumNumber{
	public static int SumInteger(int n, int b){
		int SumOfNumner = n + b;
		return SumOfNumner;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int numberInput = input.nextInt();

		System.out.print("Enter second Number: ");
		int numberTwo = input.nextInt();

		int sumResult = SumInteger(numberInput,numberTwo);
		System.out.println(sumResult);

	}
}