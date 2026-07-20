import java.util.Scanner;

public class While{
	public static void main(String...ajay){
	Scanner scanner = new Scanner(System.in);			

		int multiplier = 12;
		int mainPassword = 1234;

 		for(int count = 1; count <= 5; count++){
			int total = count * multiplier;
      			System.out.println("12" + " x " + count + " = " + total);
 		}
		System.out.println();

		//PasswordChcker

		System.out.print("enter paasword: ");
		int password = scanner.nextInt();

		while(password != mainPassword){
			System.out.print("incorrect, olodo, try again oshi: ");
			password = scanner.nextInt();
		}

		if(password == mainPassword)
			System.out.print("correct password");
		
	}

}















































