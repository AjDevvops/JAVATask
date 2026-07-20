import java.util.Scanner;
public class AverageGrade{
public static void main(String [] args){
	Scanner input = new Scanner (System.in);


	int total = 0;
	int gradeCounter =1;


	while (gradeCounter <= 10) {
	
	System.out.print("Enter Grade Here: ");
	int grade = input.nextInt();

	
	total = total + grade;
	gradeCounter = gradeCounter + 1;
}

int Average = total/10;

System.out.println("The Total: " + total);
System.out.println("The total Average: " + Average);
}
}
	