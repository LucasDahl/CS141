// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #7 7/9/20
// Due 7/4/20
//
// This program is used to find the area of a triangle.

public class AreaOfTriangle {

    // Main method
    public static void main(String[] args) {

        // Print the test data
        System.out.println("The area of a triangle with sides 5, 6, and 7 is " + triangleArea(5, 6, 7));
        System.out.println("The area of a triangle with sides 12, 13, and 14 is " + triangleArea(12, 13, 14));
        System.out.println("The area of a triangle with sides 300, 400, and 550 is " + triangleArea(300, 400, 550));


    }

    // Methods
    public static double triangleArea(double a, double b, double c) {

        // Properties
        double area, s = ((a + b + c) / 2);

        // Calculate the area
        area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Return the area
        return area;

    }

}
