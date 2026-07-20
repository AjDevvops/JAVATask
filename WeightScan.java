import java.util.Scanner;
   public class WeightScan{
     public static void main (String [] args){
       Scanner input = new Scanner (System.in);
	    
          System.out.println("Enter Weight: ");
	   int Weight =input.nextInt();

	 System.out.println("Enter Height: ");
	   int Height =input.nextInt();

	int bmi = Height * Height/Weight;

	    if (bmi < 18){
	   System.out.println("Under Weight");
}
	       if (bmi >= 18 && bmi <= 18){
	   System.out.println("Normal");
}

	       if (bmi >= 25 && bmi <= 29){
	   System.out.println("Over weight");
}

   if (bmi >= 30){
	   System.out.println("Obese");
}
}
}
