import java.util.Scanner;
public class Grade{
public static void main(String[]args){

Scanner input = new Scanner(System.in);

System.out.print("Enter First grade: ");
int FirstGrade = input.nextInt();

System.out.print("Enter Second grade: ");
int SecondGrade = input.nextInt();

System.out.print("Enter Third grade: ");
int ThirdGrade = input.nextInt();

int Sum = FirstGrade + SecondGrade + ThirdGrade;
int SumAverage = Sum/3;

if (FirstGrade >= 90){
System.out.println("First grade inputed: A");
}
else if (FirstGrade >= 80){
System.out.println("First grade inputed: B");
}
else if (FirstGrade >= 70){
System.out.println("First grade inputed: C");
}
else if (FirstGrade >= 60){
System.out.println("First grade inputed: D");
}
else{
System.out.println("First grade inputed: F");
}
//-------------------------------------------------------------------
if (SecondGrade >= 90){
System.out.println("Second grade inputed: A");
}
else if (SecondGrade >= 80){
System.out.println("Second grade inputed: B");
}
else if (SecondGrade >= 70){
System.out.println("Second grade inputed: C");
}
else if (SecondGrade >= 60){
System.out.println("Second grade inputed: D");
}
else{
System.out.println("Second grade inputed: F");
}
//-------------------------------------------------------------------
if (ThirdGrade >= 90){
System.out.println("Third grade inputed: A");
}
else if (ThirdGrade >= 80){
System.out.println("Third grade inputed: B");
}
else if (ThirdGrade >= 70){
System.out.println("Third grade inputed: C");
}
else if (ThirdGrade >= 60){
System.out.println("Third grade inputed: D");
}
else{
System.out.println("Third grade inputed: F");
}
//-------------------------------------------------------------------
System.out.print("The Average of grades inputed: " + SumAverage);
}
}