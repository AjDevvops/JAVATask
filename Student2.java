import java.util.Scanner;
public class Student2{
public static void main(String [] args){

Scanner input = new Scanner(System.in);


System.out.print("Enter Student Name: ");
String Name = input.nextLine();

System.out.print("Enter " + Name + "'s " + "grade: ");
int studentGrade = input.nextInt();  

if (studentGrade >= 70) {
System.out.println(Name + " has " + "A" + " (Excellent)");
}
else if (studentGrade >= 60) {
System.out.println(Name + " has " + "B" + " (Very Good)");
}
else if (studentGrade >= 50) {
System.out.println(Name + " has " + "C" + " (Credit)");
}
else if (studentGrade >= 40) {
System.out.println(Name + " has " + "D" + " (Passed)");
}
else {
System.out.println(Name + " has " + "F" + " (Failed)");
}


}
}