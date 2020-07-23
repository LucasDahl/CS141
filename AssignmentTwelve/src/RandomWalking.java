// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #12 7/22/20
// Due 7/27/20

// This program

import java.util.Random;

public class RandomWalking {

    // The main method
    public static void main(String[] args) {

        // Test the method of randomWalk
        System.out.println("Steps : " + randomWalk(30));


    }


    // Methods
    public static int randomWalk(int x) {

        int totalSteps = 0, position =0;
        Random forwardOrBack = new Random();

        while(position != Math.abs(x)) {




            if (forwardOrBack.nextBoolean()) {

                // Move forward(positive)
                position ++;

            } else {

                // Move backwards(negative).
                position --;

            }

            // Print the current position.
            System.out.println("position = " + position);


            // Increase the total number of steps
            totalSteps ++;

        }


        // Create Space
        System.out.println();

        // Return the total number of steps
        return totalSteps;

    }

}
