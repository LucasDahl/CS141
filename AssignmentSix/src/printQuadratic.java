// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #5 7/8/20
// Due 7/13/20
//
// This program will use a method that takes parameters to print both roots.

public class printQuadratic {


    // Main method
    public static void main(String[] args) {

        // Call the method with both sets of data.
        printQuadratic(1, -7, 12);
        printQuadratic(2, 6, 4);

    }

    // Methods
    public static void printQuadratic(double a, double b, double c) {

        // Properties
        // For this example int could be used, but in reality it should be a double since you cannot tell if what each x will be.
        double x1 = 0, x2 = 0;

        // Make the calculations
        x1 =  (-b + Math.sqrt(b * b - (4 * a * c))) / (2 * a);
        x2 =  (-b - Math.sqrt(b * b - (4 * a * c))) / (2 * a);

        // Print the values of both x values
        System.out.println("X one is " + x1);
        System.out.println("X two is " + x2);

    }

}
