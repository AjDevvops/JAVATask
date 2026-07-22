import java.util.Scanner;
public class CelciusTemp{
	public static double CelciusTemperature(int n){
		
	double Faharent = (n * 9 / 5) + 32;
	return Faharent;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Temperature in Celsius: ");
		int numberInput = input.nextInt();

		double CelcuisFahrenheit = CelciusTemperature(numberInput);
		System.out.println("Faharent is " + CelcuisFahrenheit);

	}
}
