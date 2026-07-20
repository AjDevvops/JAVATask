import java.util.Scanner;
   public class Quest3{
    public static void main (String [] args){
      Scanner input = new Scanner (System.in);
        
	System.out.print("Enter the temperature in Kelvin:");
	 double Kelvin = input.nextDouble();

	double Celsius = (Kelvin -273.15);
	double Fahrenheit = ((Kelvin -273.15)*9/5 + 32);

	System.out.println("Kelvin: " + Kelvin);
	System.out.println("Celsius: " + Celsius);
	System.out.println("Fahrenheit: " + Fahrenheit);

  }
}