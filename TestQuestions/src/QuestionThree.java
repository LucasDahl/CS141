// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Midterm 7/23/20
// Due 7/23/20

// Question Three


public class QuestionThree {

    // The main method
    public static void main(String[] args) {

        // Test the data.

        // Returns false
        System.out.println(dominant(4, 9, 2));

        // Returns true
        System.out.println(dominant(5, 3, 7));

        // Returns true
        System.out.println(dominant(12, 55, 70));


    }


    // This method takes three integers and returns true if one is larger than the sum of the other two.
    public static boolean dominant(int numOne, int numTwo, int numThree) {

        // Properties
        boolean isLarger;

        if (numOne > (numTwo + numThree) || numTwo > (numOne + numThree) || numThree > (numOne + numTwo)) {

            // One integer is larger than the sum of the other two
            isLarger = true;

        } else {

            // No one integer is larger than the sum of the other two.
            isLarger = false;

        }


        // Return the bool
        return isLarger;

    }

}
