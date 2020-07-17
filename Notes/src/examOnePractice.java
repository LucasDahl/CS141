public class examOnePractice {

    public static void main(String[] args) {

        // Properties
        int num = 1;

        System.out.println();

        // Print the methods
        printStar();
        printStrings("abc", 5);

        // Make space
        System.out.println();

        for(int i = 1; i < 11; i++) {

            System.out.print((i * i) + " ");

        }



    }

    // Methods
    public static void printStar() {

        String x = "*";

        for(int i = 0; i < 5; i++) {
            System.out.println(x);
            x += "*";
        }

    }

    public static void printStrings(String stringToPrint, int numberOfTimes) {

        for(int i = 0; i < numberOfTimes; i++) {

            System.out.print(stringToPrint);

        }

    }



}
