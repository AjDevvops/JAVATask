import java.util.Scanner;
public class Integer{
public static void main(String [] args){
Scanner input = new Scanner(System.in);

System.out.println("Enter First Integer: ");
int num1 = input.nextInt();

System.out.println("Enter Second Integer: ");
int num2 = input.nextInt();

System.out.println("Enter third integer: ");
int num3 = input.nextInt();

System.out.println("Enter Fourth integer: ");
int num4 = input.nextInt();

System.out.println("Enter Fifth integer: ");
int num5 = input.nextInt();

System.out.println("Enter Sixth integer: ");
int num6 = input.nextInt();

if (num1>num2 && num1>num3 && num1>num4 && num1>num5 && num1>num6){
System.out.println("Number 1 is the greatest");
}
if (num1<num2 && num1<num3 && num1<num4 && num1<num5 && num1<num6){
System.out.println("Number 1 is the Smallest");
}

if (num2>num1 && num2>num3 && num2>num4 && num2>num5 && num2>num6){
System.out.println("Number 2 is the greatest");
}
if (num2<num1 && num2<num3 && num2<num4 && num2<num5 && num2<num6){
System.out.println("Number 2 is the smallest");
}

if (num3>num1 && num3>num2 && num3>num4 && num3>num5 && num3>num6){
System.out.println("Number 3 is the Gratest");
}
if (num3<num1 && num3<num2 && num3<num4 && num3<num5 && num3<num6){
System.out.println("Number 3 is the greatest");
}

if (num4>num1 && num4>num2 && num4>num3 && num4>num5 && num4>num6){
System.out.println("Number 4 is the Greatest");
}
if (num4<num1 && num4<num2 && num4<num3 && num4<num5 && num4<num6){
System.out.println("Number 4 is the smallest");
}

if (num5>num1 && num5>num2 && num5>num3 && num5>num4 && num5>num6){
System.out.println("Number 5 is the greatest");
}
if (num5<num1 && num5<num2 && num5<num3 && num5<num4 && num5<num6){
System.out.println("Number 5 is the Smallest");
}

if (num6>num1 && num6>num2 && num6>num3 && num6>num4 && num6>num5){
System.out.println("Number 6 is the Greatest");
}
if (num6<num1 && num6<num2 && num6<num3 && num6<num4 && num6<num5){
System.out.println("Number 6 is the Smallest");
}

}
}











