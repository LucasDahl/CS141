import java.util.Scanner; // Imports the scanner for input

public class userInput {


    // Main method
    public static void main(String[] args) {

        // Scan in from the user called keyboard. System.in is the keyboard, system.out is the monitor
        Scanner keyboard = new Scanner(System.in);

        // Ask a question
        System.out.println("What is your favorite number? ");

        int num;

        // Assigns the next int enter by the keyboard. nextDouble() is used for doubles
        num = keyboard.nextInt();

        // Print the users number
        System.out.println("Your number was " + num);

        // Make space
        System.out.println();

        // Ask a question
        System.out.println("What is your first name? ");

        String name;

        // Assigns the next int enter by the keyboard.
        name = keyboard.next();

        // Make space
        System.out.println();

        // Print the users name
        System.out.println("Your name is " + name);


    }


}
