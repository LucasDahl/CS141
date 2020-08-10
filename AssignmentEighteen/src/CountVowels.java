// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #18 8/4/20
// Due 8/6/20
//

// This program will take a sting entered by the user and use a method to count how many of each vowel was in the string.

import java.util.Arrays;
import java.util.Scanner;

public class CountVowels {

    // Main method
    public static void main(String[] args) {

        // Properties
        String userString = "";
        Scanner keyboard = new Scanner(System.in);
        Boolean flag = false;


        // This loop will keep asking the user to enter a sentence until they say "stop".
        while(flag != true) {


            // Ask the user for a string
            System.out.print("Please enter a sentence. ");
            userString = keyboard.nextLine();



            if(userString.equals("stop") ||userString.equals("STOP")) {

                // The user wants to stop
                flag = true;

            } else {

                // Display the results to the user.
                System.out.printf("In the sentence \"%s\", the number of vowels in order 'A', 'E', 'I', 'O', and 'U' are %s.%n", userString, Arrays.toString(vowelCount(userString)) );

            }


        }


    }


    // This function takes in a string and returns an array of int's that contains the number of each vowel
    public static int[] vowelCount(String stringToCount) {

        // Properties
        int[] vowelArray = new int[5];


        // Loop though the sting to count each vowel and update the array
        for(int i = 0; i < stringToCount.length(); i++) {

            //
            char toCheck = stringToCount.toLowerCase().charAt(i);

            // Increase the vowel count if the letter is a count.
            if(toCheck == 'a') {

                vowelArray[0]++;

            } else if(toCheck == 'e') {

                vowelArray[1]++;

            } else if(toCheck == 'i') {

                vowelArray[2]++;

            } else if(toCheck == 'o') {

                vowelArray[3]++;

            } else if(toCheck == 'u') {

                vowelArray[4]++;

            }

        }

        // Return the array
        return vowelArray;

    }

}
