import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

/**
 * This program will write a given string to a file.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 */
public class QuestionFour {

    /**
     *  This is the main method to run the program.
     * @param args The arguments passed in.
     */
    public static void main(String[] args) {

        // Properties
        String testString = "fun.   6    hello    3    <>    10    25    2    wow!    4";

        // Test a string
        printStrings(testString);

    }

    /**
     * This method will take in a string and
     * write the data to a file based on the string
     * each line will be one word/saying and printed "numOfTimes" amount of times.
     * "numOfTimes" in this sense is the number that follows.
     *
     * @param stringToWrite this is the string to write to thte file
     */
    public static void printStrings(String stringToWrite) {

        // Properties
        String fileName ="myOutput.data";
        PrintStream outStream = null;
        Scanner token = new Scanner(stringToWrite);

        // Create a new file
        try {

            outStream = new PrintStream(fileName);

        } catch (Exception e) {

            // Let the user know there was an error making the file.
            System.out.println("There was an error, " + e);
            System.out.println("Closing the program.");
            System.exit(-1);

        }

        while(token.hasNext()) {

            // Get the string to print and the number of times
            String textLine = token.next();
            int numOfTimes = token.nextInt();

            // Write the string the number of time of the current int.
            for(int i = 0; i < numOfTimes; i++) {
                outStream.print(textLine);
            }

            // On to the next line
            outStream.println();

        }


    }

}
