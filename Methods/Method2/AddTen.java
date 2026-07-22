import java.util.Scanner;
public class AddTen{
	public static int addTen(int n){
		int PlusTenNumber = n + 10;
		return PlusTenNumber;
}
		public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter Number: ");
		int number = input.nextInt();

		int addTenNumber = addTen(number);
		System.out.println(number + " + 10 = " + addTenToNumber);

	}
}
