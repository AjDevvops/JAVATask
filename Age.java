import java.util.Scanner;
public class Age{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Father Age: ");
int FatherAge = input.nextInt();

System.out.print("Enter Son Age: ");
int SonAge = input.nextInt();

int Year = FatherAge - (2 * SonAge);

System.out.print("The Difference is " + Year);
}
}