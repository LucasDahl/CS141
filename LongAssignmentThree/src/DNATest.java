// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #19 8/5/20
// Due 8/10/20
//

import java.io.File;
import java.util.Scanner;

public class DNATest {

    // The main method
    public static void main(String[] args) {

        Scanner fileScanner = null;

        fileScanner = getFile();


        while (fileScanner.hasNext()) {

            // Properties
            String name = "";


            name = fileScanner.next();

            // Display the data to the user.
            System.out.print(name);

        }



    }

    // Methods
    public static Scanner getFile() {

        //Properties
        Scanner keyboard = new Scanner(System.in), fileScanner = null;
        String fileName;
        File dataFile = null;


        System.out.print("Please enter a file name you want to check the data of.");
        fileName = keyboard.next();


        dataFile = new File(fileName + ".txt");

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

}
