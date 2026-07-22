import java.util.Scanner;
public class DivisibleByThree{
	public static boolean Divisible(int n){
		
		if (n%3 == 0){
			return true;
		}
		else{
			return false;
}
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int numberInput = input.nextInt();

		boolean NumberDivisible = Divisible(numberInput);
		System.out.println(NumberDivisible);

	}
}
