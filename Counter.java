import java.util.Scanner;
public class Counter{
 public static void main(String [] args){

	Scanner input = new Scanner (System.in);

	System.out.println("Enter First Digit");
	  int num1 = input.nextInt();

	System.out.println("Enter Second Digit");
	  int num2 = input.nextInt();

	System.out.println("Enter Third Digit");
	  int num3 = input.nextInt();

	System.out.println("Enter Fourth Digit");
	  int num4 = input.nextInt();

	System.out.println("Enter Fifth Digit");
	  int num5 = input.nextInt();

	System.out.println("Enter Sixth Digit");
	  int num6 = input.nextInt();

	int Countpos = 0;
	int CountZero = 0;
	int Countneg = 0;

	int Psum = 0;
	int Nsum = 0;


	if (num1 > 0){
	Countpos = Countpos +1;
	Psum += num1;

}
	if (num1 == 0){
	CountZero = CountZero +1;
}
	if (num1 < 0){
	Nsum += num1;
}

	if (num2 > 0){
	Countpos = Countpos +1;
	Psum += num2;
}
	if (num2 == 0){
	CountZero = CountZero +1;
}
	if (num2 < 0){
	Countneg = Countneg +1;
	Nsum += num2;
}

	if (num3 > 0){
	Countpos = Countpos +1;
	Psum += num3;
}
	if (num3 == 0){
	CountZero = CountZero +1;
}
	if (num3 < 0){
	Countneg = Countneg +1;
	Nsum += num3;
}

	if (num4 > 0){
	Countpos = Countpos +1;
	Psum += num4;
}
	if (num4 == 0){
	CountZero = CountZero +1;
}
	if (num4 < 0){
	Countneg = Countneg +1;
	Nsum += num4;
}

	if (num5 > 0){
	Countpos = Countpos +1;
	Psum += num5;
}
	if (num5 == 0){
	CountZero = CountZero +1;
}
	if (num5 < 0){
	Countneg = Countneg +1;
	Nsum += num5;
}

	if (num6 > 0){
	Countpos = Countpos +1;
	Psum += num6;

}
	if (num6 == 0){
	CountZero = CountZero +1;
}
	if (num6 < 0){
	Countneg = Countneg +1;
	Nsum += num6;
}


System.out.println("Total number of zero Integer is" + " " + " " + CountZero);
System.out.println("Total number of Positive Integer is" + " " + " " + Countpos);
System.out.println("Total number of Negative Integer is" + " " + " " + Countneg);
System.out.println("Total sum of Positive Integers: " + " " + Psum);
System.out.println("Total sum of Negative Integers: " + " " + Nsum);
}
}    









