import java.util.Scanner;

public class inClassProgram {

    public static void main(String[] args) {

        // Properties
        Scanner keyboard = new Scanner(System.in);
        String name;
        int age, grade;

        // Get the name
        System.out.println("What is your name? ");
        System.out.print("--> ");
        name = keyboard.next();

        // Get the age
        System.out.println("What is your age? ");
        System.out.print("--> ");
        age = keyboard.nextInt();

        // Make the calculations
        grade = age - 5;

        // Display the data
        System.out.println("Hello " + name + ", as a person of age " + age + " you should be in grade " + grade + ".");

    }

}
