public class Approximate{
  public static void main (String [] args){

     double inputOne = ((1.0)-(1/3) + (1/5) - (1/7) + (1/9) - (1/11));
     double inputTwo = ((1.0)-(1/3) + (1/5) - (1/7) + (1/9) - (1/13));

     double FirstPi = inputOne * 4;
     double SecondPi = inputTwo * 4;

	System.out.println ("First Pi: " + FirstPi);
	System.out.println("Second Pi: " + SecondPi);

   }
}   