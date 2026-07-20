import java.util.Scanner; 
public class CustomerService{   
public static void main(String... args){
Scanner input = new Scanner(System.in);

String mainMenu = """
WELCOME TO NOKIA 3310

Press 1 for Phonebook
Press 2 for Messages
Press 3 for Chat
Press 4 for Call register
Press 5 for Tone
Press 6 for Settings
Press 7 for Call divert
Press 8 for Games
Press 9 Calculator
Press 10 Reminders
Press 11 for Clock
Press 12 for Profile
Press 13 SIM services

""";

System.out.println(mainMenu);
int mainMenuChoice = input.nextInt();
//------------------------------------------------------

switch(mainMenuChoice){
case 1 : System.out.println("Phonebook List"); 
String PhonebookList = """

Press 1 for Search
Press 2 for Service Nos
Press 3 for Add Name
Press 4 for Erase
Press 5 for Edit
Press 6 for Assign tone
Press 7 for Send b'card
Press 8 for Options
Press 9 for Speed dials
press 10 for voice tags

""";

System.out.println("Phonebook List");
int PhonebooklistChoice = input.nextInt();

switch(PhonebooklistChoice){
case 8:  System.out.println("You want to borrow abi"); break;
String Options = """

Press 1 for Type of view
Press 2 for Memory status

""";
}
}
}
}




