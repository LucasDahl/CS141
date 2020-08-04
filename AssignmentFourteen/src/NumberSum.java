// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #14 7/22/20
// Due 7/30/20

// This program reads numbers from a file and finds the sum.

import java.io.*;
import java.util.Scanner;

public class NumberSum {

    // The main method
    public static void main(String[] args) {

        // Properties
        int sum = 0;
        File myFile = new File("CS141-1201Numbers.txt");
        Scanner fileScanner = null;

        // Check to make sure the file exists and can be opened.
        try {

            fileScanner = new Scanner(myFile);

        } catch (Exception e) {

            System.out.println("Could not open the file correctly.");
            System.exit(-1);
        }

        // Loop through
        while(fileScanner.hasNext()) {


            if(fileScanner.hasNextInt()) {
                sum += fileScanner.nextInt();
            }

        }


        // Display the sum of the text file.
        System.out.println("The sum of all the numbers in the file is " + sum);


    }



    // This method loops through the file and adds all the numbers together for a sum.
//    public static int numSum() {
//
//
//
//
//    }

}
