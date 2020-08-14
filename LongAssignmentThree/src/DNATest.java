// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #19 8/5/20
// Due 8/10/20
//
/* This program reads from a file give by the user that contains DBA sequences.
The DNA test measures the various parts of the sequence and assigns them a letter.
While the letters could be anything from A to Z, the only letters that matter for
this test are the letters {A,B,C,D} all other letters can be ignored completely.
After the program evaluates the data it will wright the results to a new file that
the user is asked to name.
*/

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class DNATest {

    // The main method
    public static void main(String[] args) {

        // Properties
        Scanner fileScanner = null;
        PrintStream outStream = null;

        // Intro
        System.out.printf("This program processes a file of DNA structures for various biological%n" +
                "samples to determine if a mutation of a particular nature has occurred.");

        // Get the file name to evaluate.
        fileScanner = getFile();

        // Make the new file for after the data has been evaluated.
        outStream = makeFile();

        // Show the data
        showData(fileScanner, outStream);

        // Close the file
        outStream.close();

    }

    // Methods

    // This method gets the desired file based on user input
    public static Scanner getFile() {

        //Properties
        Scanner keyboard = new Scanner(System.in), fileScanner = null;
        String fileName;
        File dataFile = null;

        // Ask for the file name.
        System.out.println();
        System.out.println();
        System.out.print("input file name? ");
        fileName = keyboard.next();

        // Set the data file.
        dataFile = new File(fileName);

        // Try to open the file
        try {

            fileScanner = new Scanner(dataFile);

        } catch (Exception e) {

            // Couldn't open the file.
            System.out.print("Could not open the file correctly, closing the program.");
            System.exit(-1);

        }

        // Return the file scanner.
        return fileScanner;

    }

    // This method creates the file based on user input.
    public static PrintStream makeFile() {

        // Properties
        PrintStream out = null;
        Scanner keyboard = new Scanner(System.in);
        String fileName = "";

        // Ask the user for the name of the file they want to create.
        System.out.print("output file name? ");
        fileName = keyboard.next();

        // Create a new file
        try {

            out = new PrintStream(fileName);

        } catch (Exception e) {

            // Let the user know there was an error making the file.
            System.out.println("There was an error, " + e);
            System.out.println("Closing the program.");
            System.exit(-1);

        }

        // Return the PrintStream
        return out;

    }

    // This method will show all the data
    public static void showData(Scanner file, PrintStream outData) {

        // Properties
        String nameOne = "";
        int[] dataSetOne = new int[4], dataSetTwo = new int[4];

        // Two data sets are needed to compare, after that the can be reset for the next set.
        while (file.hasNext()) {

            // Loop properties
            String nameLine = file.nextLine(), dataLineOne, dataLineTwo;
            Scanner lineScan = new Scanner(nameLine);

            // Set the name of the sample
            nameOne = nameLine;

            // Get the line data to evaluate.
            dataLineOne = file.nextLine();
            dataLineTwo = file.nextLine();

            // Evaluate the data sets.
            dataSetOne = evaluateData(dataLineOne);
            dataSetTwo = evaluateData(dataLineTwo);

            // Compare the data
            compareData(dataSetOne, dataSetTwo, nameOne, outData);

            // Reset the properties for the next loop
            nameOne = "";

            for(int i = 0; i < 4; i++) {
                dataSetOne[i] = dataSetTwo[i] = 0;
            }
        }
    }

    // This method evaluates the data to take only the desired data.
    public static int[] evaluateData(String data) {

        // Properties
        int[] dataArray = new int[4];

        // Loop though the sting to count each vowel and update the array
        for(int i = 0; i < data.length(); i++) {

            // Get the letter and cast it as a lower case letter
            char toCheck = data.toLowerCase().charAt(i);

            // Add up all the A's, B's, C's, and D's
            if(toCheck == 'a') {

                dataArray[0]++;

            } else if(toCheck == 'b') {

                dataArray[1]++;

            } else if(toCheck == 'c') {

                dataArray[2]++;

            } else if(toCheck == 'd') {

                dataArray[3]++;

            }

        }

        // Return the array
        return dataArray;

    }

    // This method compares the sets of data
    public static void compareData(int[] setOne, int[] setTwo, String dataName, PrintStream out) {

        // Properties
        boolean isMatch = true;
        int[] dataPercentOne = new int[4], dataPercentTwo = new int[4];
        int totalOne = 0, totalTwo = 0;
        String match = "";

        // Get the totals
        for(int i = 0; i < 4; i++) {

            totalOne += setOne[i];
            totalTwo += setTwo[i];

        }

        // Convert the data sets into percentages to compare.
        for(int i = 0; i < 4; i++) {

            dataPercentOne[i] = Math.round((setOne[i] * 100) / totalOne);
            dataPercentTwo[i] = Math.round((setTwo[i] * 100) / totalTwo);

        }

        // See if the data matches
        for(int i = 0; i < 4; i++) {

            // Check if there is any percentage that's different.
            if(dataPercentOne[i] != dataPercentTwo[i]) {

                isMatch = false;

            }

        }

        // Set the match string
        if(isMatch == true) {

            match = "MATCH";

        } else {

            match = "DIFFERENT";

        }

        // Write the data to the file.
        out.println(dataName);
        out.printf("%10s  %2d -%2d -%2d -%3d %10s %d - %d - %d - %d%n","Before:", setOne[0], setOne[1], setOne[2], setOne[3],
                "After:", setTwo[0], setTwo[1], setTwo[2], setTwo[3]);
        out.printf("%10s %2d%%/%2d%%/%2d%%/%2d%%%-2s %9s%d%%/%d%%/%d%%/%d%%%n","Before:", dataPercentOne[0], dataPercentOne[1], dataPercentOne[2], dataPercentOne[3],
                "", "After:", dataPercentTwo[0], dataPercentTwo[1], dataPercentTwo[2], dataPercentTwo[3]);
        out.printf("%10s %s%n", " ", match);

    }
}

