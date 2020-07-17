// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #5 7/17/20
// Due 7/27/20


/* This program will ask the user to input the names and birthdays of two people,
along with the current date to display the following data.

The number of days until person 1's birthday from today
The number of days until person 2's birthday from today
The number of days between person 1's birthday and persons 2's
The number of days between person 2's birthday and persons 1's

For this program we assuming the year has 365 days(ignore leap year).

*/

import java.util.Scanner;

public class BirthdayCounting {


    // Main method
    public static void main(String[] args) {

        // Properties
        Scanner keyboard = new Scanner(System.in);
        int monthOne, dayOne, monthTwo, dayTwo, currentMonth, currentDay;
        String nameOne, nameTwo, dayRange;

        // Display the opening message
        display();

        // Gather Data
        System.out.printf("Today's Month (1-12) %15s", "? ");
        currentMonth = keyboard.nextInt();

        System.out.printf("Today's Day (1-31) %18s", "? ");
        currentDay = keyboard.nextInt();

        System.out.printf("Person 1's Name %11s", "? ");
        nameOne = keyboard.next();

        System.out.printf("Person 2's Name %11s", "? ");
        nameTwo = keyboard.next();

        System.out.printf("%s's Birthday Month (1-12) %2s", nameOne, "? ");
        monthOne = keyboard.nextInt();

        // Get the days range based off the month.
        dayRange = daysInMont(monthOne);

        System.out.printf("%s's Birthday Day %s %3s", nameOne, dayRange, "? ");
        dayOne = keyboard.nextInt();

        System.out.printf("%s's Birthday Month (1-12) %2s", nameTwo, "? ");
        monthTwo = keyboard.nextInt();

        // Get the days range based off the month.
        dayRange = daysInMont(monthTwo);

        System.out.printf("%s's Birthday Day %s %3s", nameTwo, dayRange, "? ");
        dayTwo = keyboard.nextInt();

        // Display the results
        System.out.println();
        System.out.println("*** Calculating ***");



    }


    // Methods

    // This method converts the date into a number in the year(1 -365).
    public static int getAbsoluteDate(int month, int day) {

        // Properties
        int absoluteDate = 0;


        // Return the date
        return absoluteDate;

    }

    //
    public static int subtractAbsoluteDate(int day1, int day2) {

        // Properties
        int date = 0;


        // Return the date
        return date;


    }


    //
    public static int getDaysInMonth(int month) {

        // Properties
        int numberOfDays = 0;


        // Return the number of days
        return numberOfDays;

    }

    // This method is used to make the display info to keep the main method clean.
    public static void display() {

        System.out.println("* Birthday Counting Program                          *");
        System.out.println("* Please type in the current date and the name       *");
        System.out.println("* and birthdays of two people                        *");
        System.out.println("******************************************************");
        System.out.println();

    }

    // This method returns a string for the correct day range to display.
    public static String daysInMont(int month) {

        // Properties
        String dayRange;

        if(month == 2) {

            dayRange = "(1-28)";

        } else if (month == 1 || month == 3 || month == 4 || month == 7 || month == 8 || month == 12) {

            dayRange = "(1-31)";

        } else {

            dayRange = "(1-30)";

        }



        // Return the string
        return dayRange;

    }

}
