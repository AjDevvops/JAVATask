  public class XandY{
  public static void main(String [] args){
    
    Double a = 3.4;
    Double b = 50.2;
    Double c = 44.5;
    Double d = 2.1;
    Double e = 0.5;
    Double f = 5.9;

Double x = (e*f - b*f) / (a*d-b*c);
Double y = (a*f - e*c) / (a*d -b*c);

System.out.println("The Value of X: " + x);
System.out.println("The Value of Y: " + y);
  }
}