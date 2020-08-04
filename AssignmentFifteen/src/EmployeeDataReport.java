// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #15 7/30/20
// Due 8//320

// This program reads employee data from a file and takes the pay rate and multiples it by hours. After taking out taxes
// The program will print the results for the user.


import java.io.*;
import java.util.Scanner;

public class EmployeeDataReport {

    // Main method
    public static void main(String[] args) {

        // Call teh method.
        employeeData();


    }

    // This method reads data from a file and makes calculations of total pay and prints them for the user.
    public static void employeeData() {

        // Properties
        File employeeFile = new File("CS141 -EmployeeData.txt");
        Scanner fileScanner = null;


        // Try to open the file
        try {

            fileScanner = new Scanner(employeeFile);

        } catch (Exception e) {

            // Couldn't open the file.
            System.out.println("Could not open the file correctly, closing the program.");
            System.exit(-1);

        }

        // Loop takes the data and sets them to variable to allow the data to be printed to the user.
        while(fileScanner.hasNext()) {

            // Properties
            String line = fileScanner.nextLine();
            double payRate = 0.0, totalPay, netPay = 0.0;
            int totalHours = 0;
            String name = "", taxRate = "";

            // Trim the line to take out blank lines
            line = line.trim();

            if(line.length() > 0) {

                Scanner lineScan = new Scanner(line);

                // Properties to get the data
                name = lineScan.next();

                // Get the pay rate
                payRate = lineScan.nextDouble();

                // Get the hours
                while(lineScan.hasNextInt()) {

                    int hour = lineScan.nextInt();

                    // Add to the total hours.
                    totalHours += hour;

                }

            } else {

                // There was nothing on the line, so we skip this loop.
                continue;

            }

            // Make the calculations
            totalPay = totalHours * payRate;
            if(totalPay > 400) {

                netPay = totalPay * .67;
                taxRate = "33%";

            } else if(totalPay < 400) {

                netPay = totalPay * .75;
                taxRate = "25%";

            } else {

                // Couldn't get the net pay
                System.out.println("Could not get the net pay.");

            }

            // Display the data to the user.
            System.out.printf("%s worked for a total of: %d hours at $%.2f an hour for a gross pay of $%.2f.%nAfter %s taxes their total net pay should be $%.2f.%n", name, totalHours, payRate, totalPay, taxRate, netPay);


        }

    }

}
