import java.util.Scanner;
public class Q58{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);

	int factorial = 1;

	System.out.println("enter a number and i will tell you its factorial");
	int userInput = scanner.nextInt();

	
	while(userInput <= 1){
		factorial *= userInput;
		userInput--;
	}

	System.out.printf("factorial of %d is = %d", userInput, factorial);

}
}
	