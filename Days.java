import java.util.Scanner;
  public class Days{
   public static void main(String [] args){

     Scanner input = new Scanner(System.in);
	

	System.out.print("Enter Day: ");
	int DayInput = input.nextInt();
	

if(DayInput%7==0){
System.out.println(DayInput + " Days" + " from now will be Wednesday");  
}

if(DayInput%7==1){
System.out.println(DayInput + " Days" + " from now will be Thursday");  
}

if(DayInput%7==2){
System.out.println(DayInput + " Days" + " from now will be Friday");  
}

if(DayInput%7==3){
System.out.println(DayInput + " Days" + " from now will be Saturday");  
}

if(DayInput%7==4){
System.out.println(DayInput + " Days" + " from now will be Sunday");  
}

if(DayInput%7==5){
System.out.println(DayInput + " Days" + " from now will be Monday");  
}

if(DayInput%7==6){
System.out.println(DayInput + " Days" + " from now will be Tuesday");  
}

}
}