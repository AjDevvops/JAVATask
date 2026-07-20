import java.util.Scanner;
  public class Jonathan{
   public static void main(String [] args){


Scanner input = new Scanner(System.in);

int positive = 0;
int Negative = 0;
int zero = 0;
int greater = 0;



for(int counter = 1; counter <= 50; counter++){

System.out.print("Enter Integer (-2 to stop): ");
int UserInput = input.nextInt();



if (UserInput > greater){
	greater = UserInput;
}
if (UserInput > 0){
	positive++;
}
if (UserInput < 0){
	Negative++;
}
if (UserInput == 0){
	zero++;
}
 if (UserInput == -2){
   System.out.println("Loop has been Stopped"); 

System.out.println("Number of Positives: " + positive);
System.out.println("Number of Negatives: " + Negative);
System.out.println("Number of Zero Entered: " + zero); 
System.out.println("Greatest Number: " + greater);

}
}
}
}