  public class Speed{
  public static void main(String [] args){
   
        Double DistanceInKilometer = 14.0;
	Double TimeInHour = 0.76;
	Double TimeInMiles = DistanceInKilometer * 1.6;
 
	Double Speed =  DistanceInKilometer/TimeInHour;

	System.out.println("Distance: " + Speed);
}
} 