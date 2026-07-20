import java.util.Scanner; 
public class CustomerService{   
public static void main(String... args){

Scanner inputCollector = new Scanner(System.in);

String mainMenu = """

Enter 1 for Phonebook
Enter 2 for Messages
Enter 3 for Chat
Enter 4 for Call register
Enter 5 for Tone
Enter 6 for Settings
Enter 7 for Call divert
Enter 8 for Games
Enter 9 Calculator
Enter 10 Reminders
Enter 11 for Clock
Enter 12 for Profile
Enter 13 SIM services
Enter 0 for Exit
""";

System.out.println(mainMenu);
int UserChoice = inputCollector.nextInt();
//-------------------------------------------------------------------------------------------

switch(UserChoice){
        case 1: System.out.println("Phone Book Menu"); 
        case 2:  System.out.println("Message Menu"); 
        case 3:  System.out.println("Chat Menu"); 
        case 4:  System.out.println("Call Register Menu"); 
        case 5:  System.out.println("Tone Menu"); 
        case 6:  System.out.println("Settings Menu"); 
        case 7:  System.out.println("Call Divert Menu"); 
        case 8:  System.out.println("Games Menu"); 
        case 9:  System.out.println("Calculater Menu"); 
        case 10: System.out.println("Option Menu"); 
        case 11: System.out.println("Option Menu"); 
        case 12: System.out.println("Clock Menu"); 
        case 13: System.out.println("Sim Service Menu"); 
        case 0:  System.out.println("Exit"); 
        default: System.out.println("invalid"); 


int PhonebookMenu = inputCollector.nextInt();

switch(PhonebookMenu){
	case 1 : System.out.println("Phonebook Menu"); 

String Submenu = """

Enter 1. Search
Enter 2. Service Nos.
Enter 3. Add name
Enter 4. Erase
Enter 5. Edit
Enter 6. Assign tone
Enter 7. Send b'card
Enter 8. Options
Enter 9. Speed dials
Enter 10. Voice tags
Enter 0. Back

""";
}
System.out.println(Submenu);
int Subchoice = inputCollector.nextInt();

switch(Subchoice){
case 1: System.out.println("Searching contacts");break;
case 2: System.out.println("Showing service numbers");break;
case 3: System.out.println("Add new contact");break;
case 4: System.out.println("Erase contact");break;
case 5: System.out.println("Edit contact");break;
case 6: System.out.println("Asssign tone");break;
case 7: System.out.println("business Card");break;
case 8: System.out.println("Option");break;
case 9: System.out.println("Speed dails");break;
case 10: System.out.println("Voice tags");break;
case 0:  System.out.println("Exit"); break;
default: System.out.println("invalid choice");break;
break;

}
}