import java.util.Scanner;
public class EqualityChecker{
	public static boolean EqualityCheck(int n, int b){
	
if(n == b){
			return true;
		}else{
			return false;
		}
	}
	public static void main(String[]args){
		Scanner input = new Scanner(System.in);

		System.out.print("Enter first Number: ");
		int numberInput = input.nextInt();

		System.out.print("Enter second Number: ");
		int numberTwo = input.nextInt();

		boolean EqualityResult = EqualityCheck(numberInput,numberTwo);
		System.out.println(EqualityResult);

	}
}