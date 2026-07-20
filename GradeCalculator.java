import java.util.Scanner;
public class GradeCalculator{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter Grade Here: ");
int grade = input.nextInt();

if (grade >= 70){System.out.print("A");}
else if (grade >= 60){System.out.print("B"); }
else if (grade >= 50){System.out.print("C"); }
else if (grade >= 40){System.out.print("D"); }
else if (grade >= 30){System.out.print("E"); }
else if (grade >= 10){System.out.print("F"); }

  }
}


