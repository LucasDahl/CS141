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

        // Properties
        Scanner fileScanner = null;

        // Get the file name
        fileScanner = getFile();


        showData(fileScanner);


    }

    // Methods

    // This method gets the desired file based on user input
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

    //
    public static void showData(Scanner file) {

        // Properties
        String nameOne = "", nameTwo = "";
        int[] dataSetOne = new int[4], dataSetTwo = new int[4];
        
        int aTotal = 0, bTotal = 0, cTotal = 0, dTotal = 0;
        

        while (file.hasNext()) {

            // Loop properties
            String line = file.nextLine();
            Scanner lineScan = new Scanner(line);

            // Reset all the totals for the next set
            aTotal = bTotal = cTotal = dTotal = 0;
            // ADD if staments for the second set and compare

            if(line.contains(" ")) {

                nameOne = lineScan.nextLine();


                for(int i = 0; i < 2; i ++) {

                    line = file.nextLine();

                    for(int j = 0; j < line.length(); j ++) {

                        char toCheck = line.toLowerCase().charAt(j);

                        if(toCheck == 'a') {

                            aTotal++;

                        } else if(toCheck == 'b') {

                            bTotal++;

                        } else if(toCheck == 'c') {

                            cTotal++;

                        } else if(toCheck == 'd') {

                            dTotal++;

                        }

                    }

                }


            }

        }

        dataSetOne[0] = aTotal;
        dataSetOne[1] = bTotal;
        dataSetOne[2] = cTotal;
        dataSetOne[3] = dTotal;


        // Test data
        System.out.println(nameOne);
        for(int i = 0; i < 4; i++) {
            System.out.println(dataSetOne[i]);
        }


    }

    //
    public static int[] evaluateData(String data) {

        // Properties
        int[] dataArray = new int[5];



        // Loop though the sting to count each vowel and update the array
        for(int i = 0; i < data.length(); i++) {

            //
            char toCheck = data.toLowerCase().charAt(i);

            //
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


}
