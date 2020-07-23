// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Midterm 7/23/20
// Due 7/23/20

// Question Four

public class QuestionFour {

    // The main method
    public static void main(String[] args) {

        // Test data
        System.out.println(starTheString("Hello", 5));
        System.out.println(starTheString("Goodbye", 3));
        System.out.println(starTheString("Drones are cool!", 10));

    }


    // This method returns a new string with a given number of "*" before and after the original string.
    public static String starTheString(String originalString, int num) {

        // Properties
        String newString = "";

        // This for loop will make the new string
        for(int i = 0; i < 2; i ++) {

            // This loop will add the stars before and after the new string.
            for(int j = 0; j < num; j++) {

                newString += "*";

            }

            // This will add the original string during the first loop, but not the second.
            if (i == 0) {

                newString += originalString;

            }



        }


        // Return the string
        return newString;

    }

}
