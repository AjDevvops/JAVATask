import java.util.Scanner;
   public class MonthlyBills{
     public static void main (String [] args){
       Scanner input = new Scanner (System.in);
	    
          System.out.println("Enter bill: ");
	
int KiloWatts =input.nextInt();

if(KiloWatts >=50 && KiloWatts<=100 ){
int Amount = (KiloWatts * 25);
System.out.println("The monthly amount is:"  + Amount);
	}

if(KiloWatts >=100 && KiloWatts<=150 ){
int Amount = (KiloWatts  * 45);
System.out.println("The monthly amount is:"  + Amount);
	}

if(KiloWatts >150 ){
int Amount = (KiloWatts * 68);
System.out.println("The monthly amount is:"  + Amount);
	}

}
}

