// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Midterm 7/23/20
// Due 7/23/20

// Question One


public class QuestionOne {

    // The main method
    public static void main(String[] args) {

        // Test the method with some data.
        System.out.println("The volume of the torus is " + torusVolume(20, 50) + " units.");
        System.out.println("The volume of the torus is " + torusVolume(5, 10)  + " units.");

    }

    public static double torusVolume(int littleR, int bigR) {

        // Properties
        double volume = 0;

        // Make the calculations
        volume = (2 * (Math.PI* bigR)) * (Math.PI * Math.pow(littleR, 2));

        // Return the volume
        return volume;

    }

}
