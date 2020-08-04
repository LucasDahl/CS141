// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #17 8/3/20
// Due 8/5/20
//
// This program will ask the user for 12 words and print them out on one line.

import java.util.*;

public class TwelveWords {

    // Main method
    public static void main(String[] args) {

        // Properties
        String[] wordArray = new String[12];
        Scanner keyboard = new Scanner(System.in);

        // Get all twelve words
        for(int i = 0; i < wordArray.length; i++) {

            // Ask the user for each word.
            System.out.printf("Please type in word #%d : ",i + 1 );

            // Add the element to the current index.
            wordArray[i] = keyboard.next();

        }


        // Make every odd index uppercase.
        for(int i = 0; i < wordArray.length; i++) {

            if(i % 2 != 0) {
                wordArray[i] = wordArray[i].toUpperCase();
            }

        }

        // Print out the array for the user.
        System.out.println();
        System.out.println("Your sentence is: ");
        System.out.println();

        // Print each element of the array.
        for(int i = 0; i < wordArray.length; i++) {

            System.out.print(wordArray[i]);

            if(i == wordArray.length - 1) {

                // Add a period at the end.
                System.out.print(".");

            } else {

                // Add a space
                System.out.print(" ");

            }

        }

        // Call the "toString" method on the array.
        System.out.println();
        System.out.println("As a string it would look like: " + Arrays.toString(wordArray));

    }

}
