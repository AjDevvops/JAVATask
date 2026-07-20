import java.util.Scanner;

public class hello{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);

	System.out.print("Enter Name: ");
	String name = input.nextLine();

System.out.printf("Hello %n%s",name);
}
}
