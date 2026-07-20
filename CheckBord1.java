import java.util.Scanner;

public class CheckBoard1{
    public static void main(String[] args) {
        Scanner input = new Scanner(input);
        System.out.print("Enter Unit consumed: ");

        int radius = input.nextInt();
	double diameter = 2 * radius;
	double circumference = 2* 3.14159 * radius;
	double area = 3.14157 * radius;
System.out.printf("The diameter is %f%n", diameter);
System.out.printf("The circumference is %f%n" , circumference);
System.out.printf("The area is %f%n", area);
}
}
