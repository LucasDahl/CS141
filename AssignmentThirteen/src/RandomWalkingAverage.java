// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #12 7/22/20
// Due 7/27/20

// This program uses a method called random walk to get a total number steps. It then runs it 10,000 times to get the average.

import java.util.*;

public class RandomWalkingAverage {

    // The main method
    public static void main(String[] args) {

        // Properties
        int numSteps, totalSteps = 0;
        double averageSteps = 0;
        Scanner keyboard = new Scanner(System.in);

        // Ask the user how many steps they want to test.
        System.out.print("What size walk do you want to test? ");
        numSteps = keyboard.nextInt();

        averageSteps = randomWalkAverage(numSteps);

        // Display the average
        System.out.printf("For a walk of size %d, after 10,000 tries, on average it took %.2f steps to get there.", numSteps, averageSteps);

    }


    // Methods
    public static double randomWalkAverage(int x) {

        // Properties
        int totalSteps = 0, position = 0;
        double average = 0;
        Random forwardOrBack = new Random();

        // Loop through until the max position is reached.
        for(int i = 1; i < 10000; i++) {

            while(position != Math.abs(x)) {


                if (forwardOrBack.nextBoolean()) {

                    // Move forward(positive)
                    position ++;

                } else {

                    // Move backwards(negative).
                    position --;

                }

                // Increase the total number of steps and keep track for every loop.
                totalSteps ++;

            }

            // Reset the position for every loop.
            position = 0;

        }

        average = totalSteps / 10000.0;

        // Return the total number of steps
        return average;

    }

}

