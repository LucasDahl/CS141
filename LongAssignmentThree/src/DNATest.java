// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #19 8/5/20
// Due 8/10/20
//

import java.io.File;
import java.io.PrintStream;
import java.util.Scanner;

public class DNATest {

    // The main method
    public static void main(String[] args) {

        // Properties
        Scanner fileScanner = null;
        PrintStream outStream = null;

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


        System.out.print("Please enter the name and type of the file you want to read from. ");
        fileName = keyboard.next();


        dataFile = new File(fileName);

        // Try to open the file
        try {

            fileScanner = new Scanner(dataFile);

        } catch (Exception e) {

            // Couldn't open the file.
            System.out.print("Could not open the file correctly, closing the program.");
            System.exit(-1);

        }

        return fileScanner;

    }

    // This method creates the file based on user input.
    public static PrintStream makeFile() {

        // Properties
        PrintStream out = null;
        Scanner keyboard = new Scanner(System.in);
        String fileName = "";

        // Ask the user for the name of the file they want to create.
        System.out.print("What is the name of the file and type you want to create? ");
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
        int dataTotal;


        // Two data sets are needed to compare, after that the can be reset for the next set.
        while (file.hasNext()) {

            // Loop properties
            String line = file.nextLine();
            Scanner lineScan = new Scanner(line);

            if(line.contains(" ")) {

                nameOne = line;
                line = file.nextLine();
                dataSetOne = evaluateData(line);
                line = file.nextLine();
                dataSetTwo = evaluateData(line);

            }

            // Compare the data
            compareData(dataSetOne, dataSetTwo, nameOne, outData);


            // Reset the properties for the next loop
            nameOne = "";

            for(int i = 0; i < 4; i++) {
                dataSetOne[i] = dataSetTwo[i] = 0;
            }

        }
    }

    // THis method evaluates the data to take only the desired data.
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
        int[] dataPercOne = new int[4], dataPercTwo = new int[4];
        int totalOne = 0, totalTwo = 0;
        String match = "";

        // Get the totals
        for(int i = 0; i < 4; i++) {

            totalOne += setOne[i];
            totalTwo += setTwo[i];

        }

        // Convert the data sets into percentages to compare.
        for(int i = 0; i < 4; i++) {

            dataPercOne[i] = Math.round((setOne[i] * 100) / totalOne);
            dataPercTwo[i] = Math.round((setTwo[i] * 100) / totalTwo);

        }

        // See if the data matches
        for(int i = 0; i < 4; i++) {

            if(dataPercOne[i] != dataPercTwo[i]) {

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
        out.println("\tBefore:  " + setOne[0] + " - " + setOne[1] + " - " + setOne[2] + " - " + setOne[3] + " After:  " + setTwo[0] + " - " + setTwo[1] + " - " + setTwo[2] + " - " + setTwo[3]);
        out.println("\tBefore:  " + dataPercOne[0] + "%/" + dataPercOne[1] + "%/" + dataPercOne[2] + "%/" + dataPercOne[3] + "%" + " After:  " + dataPercTwo[0] + "%/" + dataPercTwo[1] + "%/" + dataPercTwo[2] + "%/" + dataPercTwo[3] + "%");
        out.println("\t\t" + match);


    }


}

