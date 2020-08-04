// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #6 8/1/20
// Due 8/4/20
//
/* This program will ask a user the below questions
        How many random numbers do they want?
        What is the smallest random number?
        What is the largest random number?
        What filename do they want to use?

        and it will create a file

 */

import java.util.*;
import java.io.*;

public class FourQuestions {

    // Main method
    public static void main(String[] args) {

        // Properties
        int smallestNum, largestNum, totalNum, randomNumber, row = 0;
        String fileName;
        Scanner keyboard = new Scanner(System.in);
        PrintStream outStream = null;
        Random randNum = new Random();


        // Ask the user for the data
        System.out.print("How many random numbers do you want? ");
        totalNum = keyboard.nextInt();

        System.out.print("What is the smallest number? ");
        smallestNum = keyboard.nextInt();

        System.out.print("What is the largest number? ");
        largestNum = keyboard.nextInt();

        System.out.print("What do you want to name the file? ");
        fileName = keyboard.next();

        // Create a new file
        try {

            outStream = new PrintStream(fileName);

        } catch (Exception e) {

            // Let the user know there was an error making the file.
            System.out.println("There was an error, " + e);
            System.out.println("Closing the program.");
            System.exit(-1);

        }


        // Write to the file.
        for(int i = 0; i < totalNum; i++) {

            // Get a random number
            randomNumber = randNum.nextInt((largestNum - smallestNum) + 1) + smallestNum;

            // Keep track of the row to ensure no more than 5 numbers are printed.
            row++;

            // Print the random number to the file
            outStream.print(randomNumber);

            // This will print a comma after every number until the for loop is on it's last loop.
            if(i != totalNum - 1) {

                outStream.print(",");

                // If row is equal to 5 print a new line and set row back to zero for the next line.
                if(row == 5) {

                    outStream.println();

                    row = 0;

                }

            }

        }



        // Close the file.
        outStream.close();

    }


}
