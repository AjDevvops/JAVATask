import java.util.Scanner;
public class CubingNumber{
	public static int CubeOfANumber(int n){
		
	int CubeOfNumber = n * n * n;
	return CubeOfNumber;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int numberInput = input.nextInt();

		int cubeThree = CubeOfANumber(numberInput);
		System.out.println("The cube of " + numberInput+ " = " + cubeThree);

	}
}
