// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #20 8/5/20
// Due 8/10/20
//
// This program takes an array and at integers in pairs and returns them. If the array is an odd number the last number is not altered.

import java.util.Arrays;

public class ArrayCollapse {

    // Main method
    public static void main(String[] args) {

        // Properties
        int[] array1 = {1, 4, 6, 8, 3, 4, 6, 7, 10, 1};
        int[] array2 = {8, 7, 6, 4, 9, 12, 12, 8, 11, 12, 20};
        int[] array1b, array2b;

        // Set the new arrays to the returned value of the collapse method.
        array1b = collapse(array1);
        array2b = collapse(array2);

        // Display the data
        System.out.println("Before : " + Arrays.toString(array1) );
        System.out.println("After : " + Arrays.toString(array1b) );
        System.out.println("******");
        System.out.println("Before : " + Arrays.toString(array2) );
        System.out.println("After : " + Arrays.toString(array2b) );


    }

    // This method will take an array and add two ints(will not add the same one twice) and return a new array.
    public static int[] collapse(int[] arrayToCollapse) {

        // Properties
        int[] newArray;
        int size, num = 0;

        // Get the size for the new array
        if(arrayToCollapse.length % 2 == 0) {

            // Set the loop length.
            size = arrayToCollapse.length / 2;

        } else {

            // Set the loop length.
            size = (arrayToCollapse.length / 2) + 1;

        }

        System.out.println(size);
        // The array to collapse is even.
        newArray = new int[size];

        for(int i = 0; i < arrayToCollapse.length / 2; i++) {

            // Set the current index of the new array to the next two elements of the passed in array.
            newArray[i] += arrayToCollapse[num] + arrayToCollapse[num + 1];

            num += 2;

        }

        if(arrayToCollapse.length % 2 == 1) {
            newArray[size - 1] = arrayToCollapse[arrayToCollapse.length - 1];
        }

        // Return the array
        return newArray;

    }


}
