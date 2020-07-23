// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Midterm 7/23/20
// Due 7/23/20

// Question Five

public class QuestionFive {

    // The main method
    public static void main(String[] args) {

        // Test data.
        System.out.println("The bill total with tip is $" + findTip(120.10, 5) +  ".");
        System.out.println("The bill total with tip is $" + findTip(48.0, 15) +  ".");
        System.out.println("The bill total with tip is $" + findTip(100, 20) +  ".");
        System.out.println("The bill total with tip is $" + findTip(68.94, 18) +  ".");

    }

    // This method
    public static double findTip(double billAmount, int tipAmount) {

        // Properties
        double billWithTip;

        // Make the calculations
        billWithTip = (billAmount * tipAmount) / 100 + billAmount;

        // Return the bill with tip amount
        return billWithTip;

    }

}
