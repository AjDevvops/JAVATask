import java.util.Scanner;
public class SubtractNumber{
	public static int SubtractInteger(int n, int b){
		int SubtractOfNumner = n - b;
		return SubtractOfNumner;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int numberInput = input.nextInt();

		System.out.print("Enter second Number: ");
		int numberTwo = input.nextInt();

		int subtractResult = SubtractInteger(numberInput,numberTwo);
		System.out.println(subtractResult);
	}
}