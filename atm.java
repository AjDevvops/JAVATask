import java.util.scanner;
	public class atm {
	public static void main (String[] args) {
	
	scanner input = new Scanner(System.in);
	System.out.println("Balance");
	double balance = input.nextDouble();

	if (withdrawal > balance) {
	System.out.println("insufficient funds");

	}else{
	balance = balance - withdrawal;

	System.out.println("withdrawal successful");
	System.out.println("Remaining balance = " + balance);
}
input.close();
}
}