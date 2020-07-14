// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #5 7/7/20
// Due 7/13/20
//
// This program will make method that prints a square of stars based on whatever width and height is needed.

public class squareDraw {


    // The main method
    public static void main(String[] args) {

        // Test data
        drawSquare(4,5);

        // Create space to see both squares
        System.out.println();

        drawSquare(7, 3);

        // Create space to see both squares
        System.out.println();

        drawSquare(5, 5);

        // Create space to see both squares
        System.out.println();

        drawSquare(12, 15);

        // Create space to see both squares
        System.out.println();

        drawSquare(10, 10);

        // Create space to see both squares
        System.out.println();

        drawSquare(8, 3);

    }


    // This method will print a square.
    public static void drawSquare(int width, int height) {

        // Prints the square
        for(int i = 0; i < height; i++) {

            // Prints the width
            for(int j = 0; j < width; j++) {

                System.out.print("*");

            }

            // Prints the height by going to the next line
            System.out.println();

        }

    }




}
