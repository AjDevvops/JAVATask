import java.util.scanner;

public class main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.summary);

        system.out.println("Enter Score: ");
        int score = input.nextInt();
        
        if (score >= 70) {
            system.out.println("Pass");
        } else {
            system.out.println("Fail");
        }
        input.close();
    }
}