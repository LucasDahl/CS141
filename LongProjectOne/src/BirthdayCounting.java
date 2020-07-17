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
        int monthOne, dayOne, monthTwo, dayTwo, currentMonth, currentDay, birthdayOne, birthdayTwo, nextBirthdayOne, nextBirthdayTwo, currentDate, gapOne, gapTwo;
        String nameOne, nameTwo, dayRange;

        // Display the opening message
        display();

        // Gather Data
        System.out.printf("Today's Month (1-12) %9s", "? ");
        currentMonth = keyboard.nextInt();

        // Get the days range based off the month.
        dayRange = daysInMont(currentMonth);

        System.out.printf("Today's Day %s %11s", dayRange, "? ");
        currentDay = keyboard.nextInt();

        System.out.printf("Person 1's Name %14s", "? ");
        nameOne = keyboard.next();

        System.out.printf("Person 2's Name %14s", "? ");
        nameTwo = keyboard.next();

        System.out.printf("%s's Birthday Month (1-12) %2s", nameOne, "? ");
        monthOne = keyboard.nextInt();

        // Get the days range based off the month.
        dayRange = daysInMont(monthOne);

        System.out.printf("%s's Birthday Day %s %4s", nameOne, dayRange, "? ");
        dayOne = keyboard.nextInt();

        System.out.printf("%s's Birthday Month (1-12) %2s", nameTwo, "? ");
        monthTwo = keyboard.nextInt();

        // Get the days range based off the month.
        dayRange = daysInMont(monthTwo);

        System.out.printf("%s's Birthday Day %s %4s", nameTwo, dayRange, "? ");
        dayTwo = keyboard.nextInt();

        // Convert the given days into an int from 1 -365.
        birthdayOne = getAbsoluteDate(monthOne, dayOne);
        birthdayTwo = getAbsoluteDate(monthTwo, dayTwo);
        currentDate = getAbsoluteDate(currentMonth, currentDay);

        // Make the calculations.
        nextBirthdayOne = subtractAbsoluteDate(birthdayOne, currentDate);
        nextBirthdayTwo = subtractAbsoluteDate(birthdayTwo, currentDate);
        gapOne = subtractAbsoluteDate(birthdayTwo, birthdayOne);
        gapTwo = subtractAbsoluteDate(birthdayOne, birthdayTwo);


        // Display the results
        System.out.println();
        System.out.println("*** Calculating ***");
        System.out.printf("It is %d days until %s's next birthday.%n", nextBirthdayOne, nameOne);
        System.out.printf("It is %d days until %s's next birthday.%n", nextBirthdayTwo, nameTwo);
        System.out.printf("There is a %d day gap from %s's to %s's birthday.%n", gapOne, nameOne, nameTwo);
        System.out.printf("There is a %d day gap from %s's to %s's birthday.%n", gapTwo, nameTwo, nameOne);
        System.out.println();
        System.out.println("******************************************************");
        
    }


    // Methods

    // This method converts the date into a number in the year(1 - 365).
    public static int getAbsoluteDate(int month, int day) {

        // Properties
        int absoluteDate = day;

        for(int i = 1; i < month; i++) {

            if(i  == 2) {

                absoluteDate += 28;

            } else if (i == 4 || i == 6 || i == 9 || i == 11) {

                absoluteDate += 30;

            } else {

                absoluteDate += 31;

            }

        }


        // Return the date
        return absoluteDate;

    }

    //
    public static int subtractAbsoluteDate(int day1, int day2) {

        // Properties
        int date = 0;

        date = day1 - day2;

        if (date <= 0) {

            date += 365;

        }

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

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {

            dayRange = "(1-30)";

        } else {

            dayRange = "(1-31)";

        }



        // Return the string
        return dayRange;

    }

}
