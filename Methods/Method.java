public class Method{
public static int add(int a, int b){
int sum = a + b;
return sum;
}

public static int subtract(int a, int b){
int sub = a - b;
return sub;
}

public static int Multiply(int a, int b){
int multiply = a * b;
return multiply;
}

public static int Divide(int a, int b){
int divide = a / b;
return divide;
}
//--------------Question1----------------------------------
public static String WelcomeMessage(String a){
String nothing = a;
return nothing;
}

//--------------Question2----------------------------------
public static int doubleIt(int a){
int times = a * 2;
return times;
}

//--------------Question3----------------------------------
public static int Average(int a, int b, int c){
int Average = (a + b + c)/3;
return Average;
}

//--------------Question4----------------------------------
public static boolean isNegative(int n){
int Number = n;
if (Number < 0){
}
return true;
}

//--------------Question5----------------------------------
public static int TimeTable(int n){
int TimeTable = n * 5;
return TimeTable;
}

//--------------Question6----------------------------------
public static boolean isRange(int n, int low, int High){
int Number = n;
if (Number > low && Number < High){
}
return true;
}

public static void main(String [] args){
int sumResult = add(10, 5);
int subtractResult = subtract(12, 7);
int multiplyResult = Multiply(2, 2);
int divideResult = Divide(10, 2);
String WelcomeMessage = WelcomeMessage("Welcome to Java");
int timesResult = doubleIt(2);
int AverageResult = Average(2, 2, 2);
boolean isNegativeResult = isNegative(2);
int TableResult = TimeTable(5);
boolean isRangeResult = isRange(20, 10, 50);

System.out.println(sumResult);
System.out.println(subtractResult);
System.out.println(multiplyResult);
System.out.println(divideResult);
System.out.println(WelcomeMessage);
System.out.println(timesResult);
System.out.println(AverageResult);
System.out.println(isNegativeResult);
System.out.println(TableResult);
System.out.println(isRangeResult);

}
}