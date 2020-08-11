// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #19 8/5/20
// Due 8/10/20
//
// This program takes an int and an array and uses the int to return the largest number nth(starts at zero and n is the int passed).

import java.util.Arrays;

public class ReturnLargest {

    // Main method
    public static void main(String[] args) {

        // Properties
        int[] array1 = {6, 8, 2, 3, 5, 12, 16, 1, 7, 4, 21, 19};
        int answer = kthLargest(0,array1);

        // Test the method
        System.out.println(answer);
        answer = kthLargest(1,array1);
        System.out.println(answer);
        answer = kthLargest(2,array1);
        System.out.println(answer);
        answer = kthLargest(10,array1);
        System.out.println(answer);
        answer = kthLargest(11,array1);
        System.out.println(answer);
        answer = kthLargest(-1,array1);
        System.out.println(answer);
        answer = kthLargest(20,array1);
        System.out.println(answer);

        // Ensure the array has not changed.
        System.out.println("Make sure the array didn't change as a side effect.");
        System.out.println(Arrays.toString(array1));

    }


    // This method will take an int and and an array as parameters then pass back the nth(or kth) largest number.
    public static int kthLargest(int x, int[] a) {

        // Properties
        int newArray[] = new int[a.length];
        int largestNumTemp;

        // Create a new array to make sure the passed in array is not changed and to sort.
        for(int i = 0; i < newArray.length; ++i) {

            newArray[i] = a[i];

        }

        // Get the largest int.
        for(int i = 0; i < newArray.length; i++) {

            for(int j = 0; j < newArray.length - 1; j++) {

                // Sort the new array from largest to smallest.
                if(newArray[j] < newArray[j + 1]) {

                    largestNumTemp = newArray[j];
                    newArray[j] = newArray[j + 1];
                    newArray[j + 1] = largestNumTemp;

                }
            }
        }
       
        // This will return the x(passed in int) largest number.
        if(x <= 0 || x > a.length) {

            return -9999;

        } else {

            // Since the array is in order from largest to smallest we can return the passed in value - 1, since arrays start at 0.
            return newArray[x - 1];


        }


    }

}
