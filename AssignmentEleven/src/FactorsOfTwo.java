// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #11 7/17/20
// Due 7/22/20
// This program is meant to print out all the factors of 2 in any given integer.

public class FactorsOfTwo {


    // The main method
    public static void main(String[] args) {

        // Test data
        System.out.println(showTwos(7));
        System.out.println(showTwos(18));
        System.out.println(showTwos(68));
        System.out.println(showTwos(120));
        System.out.println(showTwos(192));
        System.out.println(showTwos(8));

    }

    // This method uses a loop to print out all the factors of 2 in an integer.
    public static String showTwos(int num) {

        // Properties
        String numFactor = num  + " = ";

        // Keep looping while the number can be divided by 2. evenly.
        while(num % 2 == 0) {

            // Add  "2 * " to the string for each loop
            numFactor += "2 * ";

            // Divide the number by 2
            num = num / 2;

        }

        // Add the final number to the string
        numFactor += num;

        // Return the string
        return numFactor;

    }


}
