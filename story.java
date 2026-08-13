import java.util.Scanner;


public class story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String adjective1;
        String adjective2;
        String noun1;
        String noun2;
        String verb1;
        String verb2;
        String noun3;
        String noun4;
        String noun5;
        String verb3;
        String noun6;
        String noun7;
        String verb4;
        String noun8;

        System.out.print("Enter an adjective (description)");
        adjective1 = scanner.nextLine();
        System.out.print("Enter an adjective (type of smell)");
        adjective2 = scanner.nextLine();
        System.out.print("Enter a noun (bird)");
        noun1 = scanner.nextLine();
        System.out.print("Enter a noun (in the place)");
        noun2 = scanner.nextLine();
        System.out.print("Enter a verb (past tense)");
        verb1 = scanner.nextLine();
        System.out.print("Enter a verb");
        verb2 = scanner.nextLine();
        System.out.print("Enter a noun (relatives name)");
        noun3 = scanner.nextLine();
        System.out.print("Enter a noun ");
        noun4 = scanner.nextLine();
        System.out.print("Enter a noun (a liquid)");
        noun5 = scanner.nextLine();
        System.out.print("Enter a verb (ending with -ing)");
        verb3 = scanner.nextLine();
        System.out.print("Enter a noun (part of the body(plural))");
        noun6 = scanner.nextLine();
        System.out.print("Enter a noun (plural noun)");
        noun7 = scanner.nextLine();
        System.out.print("Enter a verb (ending with -ing)");
        verb4 = scanner.nextLine();
        System.out.print("Enter a noun");
        noun8 = scanner.nextLine();

        System.out.println("It was a "+ adjective1 +",cold november day . ");
        System.out.println("I woke up to the "+ adjective2 +" smell of "+ noun1 + " roasting in the " + noun2 + "downstairs . ");
        System.out.println("I "+ verb1 + " down the stairs to see if I could help "+ verb2 +" the dinner. ");
        System.out.println(" My mom said,\"See if "+ noun3 + " needs a fresh " + noun4 +".\"" );
        System.out.println(" So I carried a tray of glasses full of "+ noun5 +" into the "+ verb3 + "room." );
        System.out.println("When I got there, I couldn't belive my " + noun6 + "! There wre " + noun7 + verb4 + " on the " + noun8 +"!");

        scanner.close();

    }


    
}
