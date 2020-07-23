// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Midterm 7/23/20
// Due 7/23/20

// Question Two


public class QuestionTwo {

    // The main method
    public static void main(String[] args) {

        // Test the method
        emptyBox(8, 5);

        // Make space and test again.
        System.out.println();

        emptyBox(4, 4);

    }


    // This method prints a box based off two parameters (height and width).
    public static void emptyBox(int boxHeight, int boxWidth) {


        for(int i = 0; i < boxHeight; i ++) {

            if (i == 0 || i == (boxHeight - 1)) {

                for(int k = 0; k < boxWidth; k++) {

                    System.out.print("*");

                }

            } else if(i > 0) {

                for(int j = 0; j < boxWidth; j ++) {

                    if(j == 0) {

                        System.out.print("*");

                    } else if(j == boxWidth - 1) {

                        System.out.print("*");

                    } else {

                        System.out.print(" ");

                    }

                }

            } else {

                System.out.println("Error making box section...");

            }

            System.out.println();

        }


    }

}
