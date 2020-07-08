// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #3 7/6/20
// Due 7/9/20
//
// This program uses a for loop to portray Indian legend of Paal Paysam.


public class RiceLoop {


    public static void main(String[] args) {

        // Properties
        int riceTotal = 0;
        int riceDayAmount = 1;

        for(int i = 0; i < 30; i++) {

            // Add to the total of the rice from the previous day.
            riceTotal += riceDayAmount;

            // Print the rice for each day
            System.out.print("Day #");
            System.out.print(i + 1);
            System.out.print(" - ");
            System.out.print("Rice count = " + riceDayAmount);
            System.out.print(" - ");
            System.out.print(" Total Rice count = " + riceTotal);

            // Create a space for each loop
            System.out.println();

            // Double the amount of the rice from the previous dat.
            riceDayAmount *= 2;

        }

        // Create a space for each loop
        System.out.println();

        // Print the final rice amount
        System.out.println("Total Rice was = " + riceTotal);

    }


}
