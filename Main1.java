import java.util.Scanner;
public class Main1{
public static void main(String [] args){

Scanner input = new Scanner (System.in);

int number1 = (int)(Math.random()* 10);
int number2 = (int)(Math.random()* 10);

System.out.print("What is: " + number1 + " + " + number2 + " ? ");
int answer = input.nextInt();

while (answer != number1 + number2){
System.out.println("This is incorrect, Try again");
System.out.print("What is: " + number1 + " + " + number2 + " ? ");
answer = input.nextInt();
}
System.out.print("Your Answer is correct");

}
}




