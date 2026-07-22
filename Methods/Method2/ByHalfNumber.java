import java.util.Scanner;
public class ByHalfNumber{
	public static double HalfNumber(double n){
		double HalfOfNumner = n / 2;
		return HalfOfNumner;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		double numberInput = input.nextInt();

		double HalfOffNumber = HalfNumber(numberInput);
		System.out.println(HalfOffNumber);

	}
}
