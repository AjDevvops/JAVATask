import java.util.Scanner;
public class DecimalDivision{
	public static double Decimal(double n, double b){
		double expression = n / b;
		return expression;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		double numberInput = input.nextDouble();

		System.out.print("Enter second Number: ");
		double numberTwo = input.nextDouble();

		double decimalResult = Decimal(numberInput,numberTwo);
		System.out.println(decimalResult);

	}
}