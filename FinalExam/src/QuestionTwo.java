/**
 * This program uses a method to return the sum of the numbers
 * until the passed in value is reached.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 */
public class QuestionTwo {

    /**
     *  This is the main method to run the program.
     * @param args The arguments passed in.
     */
    public static void main(String[] args) {

        // Properties
        double a, b, c, d;
        
        // Test data
        a = sequenceSum(2.0);
        System.out.println(a + " is returned.");

        b = sequenceSum(2.5);
        System.out.println(b + " is returned.");
        
        c = sequenceSum(4.0);
        System.out.println(c + " is returned.");
        
        d = sequenceSum(0.99);
        System.out.println(d + " is returned.");

    }

    /**
     * This program will take in a max value and add up their sum
     * to a given value.
     *
     * @param maxValue the max value passed in to determine the max.
     * @return will return the total(sum) of the numbers.
     */
    public static double sequenceSum(double maxValue) {

        // Properties
        double total = 0;
        int counter = 1;

        // Make sure the number is not below 1.
        if(maxValue < 1.0) {

            System.out.println("Error: must be larger than one");

            return -1.0;

        }

        // Print each step while adding to the total(final answer)
        while(total < maxValue) {

            // Print the division(the step currently on)
            System.out.print("1/" + counter + " ");

            // Add to the total
            total += 1 / (double) counter;

            // Increase for the next loop.
            counter++;

        }

        // Print the total(sum)
        System.out.println("= " + total);

        // Return the total
        return total;

    }

}
