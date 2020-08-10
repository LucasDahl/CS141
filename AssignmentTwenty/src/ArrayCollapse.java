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

    // This method takes in an array and adds every 2 numbers together(doesn't add the same number twice) and makes a new array to return
    // If there is an an odd num,ber of elements the odd number will be added at the end.
    public static int[] collapse(int[] arrayToCollapse) {

        // Properties
        int[] newArray = new int[(arrayToCollapse.length / 2) + (arrayToCollapse.length % 2)];

        // Set each elements for the new array.
        for(int i = 0; i < arrayToCollapse.length / 2 ; i++) {

            // Set the current index of the new array to the next two elements of the passed in array.
            newArray[i] += arrayToCollapse[i * 2] + arrayToCollapse[(i * 2) + 1];

        }

        // Set the last element of the new array if the array passed in was odd.
        if(arrayToCollapse.length % 2 == 1) {

            newArray[newArray.length - 1] = arrayToCollapse[arrayToCollapse.length - 1];

        }

        // Return the array
        return newArray;

    }


}
