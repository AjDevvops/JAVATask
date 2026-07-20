import java.util.Scanner;
public class PassFail{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

System.out.print("Enter Grade: ");
int grade = input.nextInt();

if(grade >= 60){
System.out.print("Passed");
}else{
System.out.println("Failed");
System.out.print("Do better next time.");
}

}
}