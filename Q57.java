import java.util.Scanner;
public class Q57{
	public static void main(String [] args){
	Scanner scanner = new Scanner(System.in);
	int userInput;

		do{
			String menu = """ 
				1. Add
				2. subtract
				3. Exit
			""";

			System.out.println(menu);

			userInput = scanner.nextInt();
			
			switch(userInput){
				case 1: System.out.println("add");
				break;

				case 2: System.out.println("subtract");
				break;

			}

		}while(userInput != 3);
	}

}