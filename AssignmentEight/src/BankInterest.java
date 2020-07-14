// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #8 7/14/20
// Due 7/16/20
//
// This program will show the user their interest earned over the next 25 years.

import java.util.Scanner;

public class BankInterest {

    // Main method
    public static void main(String[] args) {

        // Properties
        Scanner keyboard = new Scanner(System.in);
        int startingAmount, depositAmount;

        // Ask the user for the initial amount in their bank account.
        System.out.println("How much money did your bank account start with? ");
        System.out.print("--> ");
        startingAmount = keyboard.nextInt();

        // Ask the user for their yearly bank deposit amount.
        System.out.println("How much money did you deposit each year? ");
        System.out.print("--> ");
        depositAmount = keyboard.nextInt();

        // Enter the data into the method
        interest(startingAmount, depositAmount);


    }


    // Calculates interest
    public static void interest(int initialAmount, int yearlyDeposit) {

        // Properties
        double interestRate = 1.065, yearStartAmount = initialAmount, total = 0, interest = 0;

        for(int i = 0; i < 25; i++) {

            // Make the calculations
            interest = yearStartAmount * interestRate;
            total = interest;


            // Print the data for each year
            System.out.println("Year " + (i +1) + " Starts = " + yearStartAmount + "  " + " Interest = " + interest + " Total = " + total);

            yearStartAmount = total + yearlyDeposit;

        }


    }

}
