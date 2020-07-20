// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #5 7/16/20
// Due 7/21/20
//
// This program will use a method to compare string and display them in alphabetical order.


public class CompareStrings {

    // Main method
    public static void main(String[] args) {


        // Test the method at least 5 times
        inOrder("abc", "mmo", "xyz");
        inOrder("xyz", "mmo", "abc");
        inOrder("efg", "qrs", "hij");
        inOrder("nop", "klm", "qrs");
        inOrder("tuv", "qrs", "wxy");
        // One more to be safe
        inOrder("wxy", "qrs", "tuv");

    }


    // This method compares 3 strings and will arrange them in alphabetical order.
    public static void inOrder(String str1, String str2, String str3) {

        // Compare all the strings and put them in the right order.
        if (str1.compareTo(str2) <= 0 && str2.compareTo(str3) <= 0) {

            System.out.println(str1 + " -> " + str2 + " -> " + str3);

        } else if (str1.compareTo(str3) <= 0 && str3.compareTo(str2) <= 0) {

            System.out.println(str1 + " -> " + str3 + " -> " + str2);

        } else if (str2.compareTo(str1) <= 0 && str1.compareTo(str3) <= 0) {

            System.out.println(str2 + " -> " + str1 + " -> " + str3);

        } else if (str2.compareTo(str3) <= 0 && str3.compareTo(str1) <= 0) {

            System.out.println(str2 + " -> " + str3 + " -> " + str1);

        } else if (str3.compareTo(str1) <= 0 && str1.compareTo(str2) <= 0) {

            System.out.println(str3 + " -> " + str1 + " -> " + str2);

        } else if (str3.compareTo(str2) <= 0 && str2.compareTo(str1) <= 0) {

            System.out.println(str3 + " -> " + str2 + " -> " + str1);

        } else {

            // Something went wrong
            System.out.println("Error");

        }
    }



}
