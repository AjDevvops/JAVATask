import java.util.Scanner;
public class Student{
public static void main(String [] args){

Scanner input = new Scanner(System.in);

int GradeA=0;
int GradeB=0;
int GradeC=0;
int GradeD=0;
int GradeE=0;
int GradeF=0;

for (int count = 1; count <= 5; count ++){

System.out.print("Enter Student Name: ");
String Name = input.nextLine();

System.out.print("Enter " + Name + "'s " + "grade: ");
String gradeInput = input.nextLine();  

System.out.print("Enter grade remark: ");
String GradeRemark = input.nextLine();  

switch(gradeInput.toUpperCase()){
case "A": GradeA++; break;
case "B": GradeB++; break;
case "C": GradeC++; break;
case "D": GradeD++; break;
case "E": GradeE++; break;
case "F": GradeF++; break;

}
}
System.out.println("--------GRADE REMARK-----------");
System.out.println(GradeA + "student passed with A's" + "(Excellent)");
System.out.println(GradeB + "student passed with B's"+ "(Very Good)");
System.out.println(GradeC + "student passed with C's"+ "(Credit)");
System.out.println(GradeD + "student passed with D's"+ "(Passed)");
System.out.println(GradeE + "student passed with E's"+ "(Poor)");
System.out.println(GradeF + "student passed with F's"+ "(Failed)");


}
}

