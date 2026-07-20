import java.util.Scanner;
   public class LagosBill{
     public static void main (String [] args){
       Scanner input = new Scanner (System.in);
	    
          System.out.println("Enter Speed: ");
	
int Speed =input.nextInt();

if(Speed < 120){
System.out.println("No Violation");
	}



if(Speed >=121 && Speed<=140 ){
System.out.println("Warning fine: 5,000");
	}

if(Speed >= 141 && Speed<=160){
System.out.println("Serous Violation: 15,000");
	}


if(Speed >= 160){
System.out.println("Dangerous Driving fine: 50,000");
	}
}
}

