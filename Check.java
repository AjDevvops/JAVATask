/*
2.18
public class CheckBoard {
public static void main (String [] args) {

	System.out.println("*********       ***         *        *       ");
	System.out.println("*       *    *       *     ***     *   *        ");
	System.out.println("*       *   *         *   *****   *     *       ");
	System.out.println("*       *   *         *     *    *       *     ");
	System.out.println("*       *   *         *     *   *         *    ");
	System.out.println("*       *   *         *     *    *       *    ");
	System.out.println("*       *   *         *     *     *     *    ");
	System.out.println("*       *    *       *      *       *  *      ");
	System.out.println("*********       ***         *         *       ");
}
}*/


/*
2.19
public class CheckBoard {
	public static void main(String [] args){
		System.out.printf("  ****%n ******%n*******%n ******%n ****%n");
}
}
*/


/*
2.20
public class CheckBoard{
	public static void main (String [] args){
		System.out.println("*");
		System.out.println("***");
		System.out.println("****");
		System.out.println("****");
		System.out.println("**");

}
}
*/


/* 
2.21
public class CheckBoard {
	public static void main (String [] args){
	
		System.out.print("*");
		System.out.print("***");
		System.out.print("*****");
		System.out.print("****");
		System.out.print("**");
}
}
*/


/*
2.22
public class CheckBoard {
	public static void main (String [] args){
	
	System.out.print("*");
	System.out.println("***");
	System.out.println("*****");
	System.out.print("****");
	System.out.println("**");
}
}

*/



/*
2.23
public class CheckBoard{
public static void main (String [] args){
	System.out.printf("%s%n%s%n%s%n%s%n", "  *", " ***", "*****", " ***", "  *");
}
}
*/


/*
import java.util.Scanner;
public class CheckBoard{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);
		
	System.out.println("First number: ");
	int num1 = input.nextInt();

	System.out.println("second number: ");
	int num2 = input.nextInt();

	System.out.println("Third number: ");
	int num3 = input.nextInt();

	System.out.println("Fouth number: ");
	int num4 = input.nextInt();

	System.out.println("Fifth number: ");
	int num5 = input.nextInt();

if (num1 < num2 && num1 < num3 && num1 < num4 && num1<num5){
System.out.println();
System.out.println("First number is the smallest: " + num1);
}

if (num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5){
System.out.println();
System.out.println("First number is the largest: " + num1);
}

if (num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5){
System.out.println();
System.out.println("Second number is the smallest: " + num2);
}

if (num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5){
System.out.println();
System.out.println("Second number is the Largest: " + num2);
}

if (num3 < num1 && num2 < num3 && num1 < num4 && num1<num5){
System.out.println();
System.out.println("Third number is the smallest: " + num3);
}

if (num3 > num1 && num3 > num3 && num3 > num4 && num3 > num5){
System.out.println();
System.out.println("Third number is the Largest: " + num3);
}	

if (num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5){
System.out.println();
System.out.println("Fourth number is the smallest: " + num4);
}

if (num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5){
System.out.println();
System.out.println("Fourth number is the largest: " + num4);
}

if (num5 < num1 && num5 < num2 && num5 < num3 && num5 < num4){
System.out.println();
System.out.println("Fifth number is the smallest: " + num5);
}

if (num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4){
System.out.println();
System.out.println("Fifth number is the largest: " + num5);
}

  }
}

*/


/*
2.25
import java.util.Scanner;
public class CheckBoard{
public static void main (String [] args){

	Scanner input = new Scanner(System.in);
	System.out.print("Enter a number: ");
	int Result = input.nextInt();
	
	if (Result%3 == 0){
	System.out.println("The result is Divided by 3");	
	}

	if (Result%3 != 0) {
	System.out.println("The result is not Dividable by 3");
	}

}
}
*/
	

/*
import java.util.Scanner;

public class CheckBoard {
    public static void main(String[] args) {
        Scanner input = new Scanner(input);
        
 
        System.out.print("Enter first integer: ");
        int num1 = input.nextInt();
                System.out.print("Enter second integer: ");
        int num2 = input.nextInt();
        

        int firstTripled = num1 * 3;
        int secondDoubled = num2 * 2;
  
        if (firstTripled % secondDoubled == 0) {
            System.out.println(firstTripled + " is a multiple of " + secondDoubled);
        } else {
            System.out.println(firstTripled + " is NOT a multiple of " + secondDoubled);
        }

    }
}
*/



import java.util.Scanner;

public class Check{
    public static void main(String[] args) {
        Scanner input = new Scanner(input);
        System.out.print("Enter Unit consumed: ");

        int radius = input.nextInt();
	double diameter = 2 * raduis;
	double circumference = 2* 3.14159 * radius;
	double area = 3.14157 * raduis;
System.out.printf("The diameter is %f%n", diameter);
System.out.printf("The circumference is %f%n" , circumference);
System.out.printf("The area is %f%n", area);
}
}
















