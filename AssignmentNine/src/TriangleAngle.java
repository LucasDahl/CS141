// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #9 7/14/20
// Due 7/16/20
//
// This program will calculate the area of a triangle based off user input.

import java.util.Scanner;

public class TriangleAngle {

    // Main method
    public static void main(String[] args) {

        // Properties
        Scanner keyboard = new Scanner(System.in);
        double sideA, sideB, sideC;

        // Ask the user for the length of each side.
        System.out.println("Please enter the length of side A");
        System.out.print("--> ");
        sideA = keyboard.nextInt();

        System.out.println("Please enter the length of side B");
        System.out.print("--> ");
        sideB = keyboard.nextInt();

        System.out.println("Please enter the length of side C");
        System.out.print("--> ");
        sideC = keyboard.nextInt();

        // Display the angle of the three triangles based on user input.
        System.out.println("The angles of the triangle in degrees are " +
                findAngles(sideA, sideB, sideC) + ", " +
                findAngles(sideC, sideA, sideB) + " and " +
                findAngles(sideB, sideC, sideA));

    }

    // This function calculates the area of a triangle.
    public static double findAngles(double sideA, double sideB, double sideC) {

        // Properties
        double angleRadians, degreeAngle;

        // Calculate the angle(in radians)
        angleRadians = Math.acos(((sideA * sideA) + (sideB * sideB) - (sideC * sideC)) / (2 * (sideA * sideB)));

        // Convert to radians to degrees
        degreeAngle = Math.toDegrees(angleRadians);

        // Return the degree rounded to 2 decimals.
        return Math.round(degreeAngle * 100.0) / 100.0;

    }


}
