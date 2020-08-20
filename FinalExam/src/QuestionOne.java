import java.util.Arrays;

/**
 * This program will evaluate arrays to return the number
 * of unique numbers.
 *
 * @author Lucas D. Dahl
 * @version 8/19/20
 */
public class QuestionOne {

    /**
     *  This is the main method to run the program.
     * @param args The arguments passed in.
     */
    public static void main(String[] args) {


        // Properties
        int[] testNum = {7, 5, 7, 40 , 22, 7, 8, 22, 31, 35, 35, 23, 40, 41, 40};
        int[] testNumTwo = {1, 2, 11, 17, 19, 20, 23, 24, 25, 26, 31, 34, 37, 40, 41};

        System.out.println(numUnique(testNum));
        System.out.println(numUnique(testNumTwo));


    }

    /**
     * This methods evaluates an array of ints to see
     * how many unique numbers are in it.
     *
     * @param numArray this is the array of ints to evaluate.
     * @return returns the total number of unique ints.
     */
    public static int numUnique(int[] numArray) {

        // Properties
        int[] newArray = Arrays.copyOf(numArray, numArray.length);
        int uniqueNum = 0;

        // Sort the array
        Arrays.sort(newArray);

        // Loop through the array
        for(int i = 0; i < numArray.length; i++) {

            // Increase i everytime a number is already in the array.
            // by comparing one index(i) with the one after in it(i + 1)
            while(i < newArray.length - 1 && newArray[i] == newArray[i + 1]) {
                i++;
            }

            // Increase the number of unique numbers.
            uniqueNum++;

        }


        // Return the uniqueNums.
        return uniqueNum;

    }

}
