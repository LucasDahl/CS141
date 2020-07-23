import java.util.Random;

public class examOnePractice {

    // Key
    // 1 = Understood
    // 2 = Understood
    // 3 = Understood
    // 4 = Understood
    // 5 = Understood
    // 6 = understood
    // 7 = Understood
    // 8 = Understood
    // 9 = Understood
    // 10 =
    // 11 =

    public static void main(String[] args) {

         //Properties
        int num = 1;
        //double x = Math.random(); // DO NOT DO THIS!
        Random randObject = new Random(); // This is how you create random numbers.

        for(int i = 1; i <= 100; i++) {

            int numRan;
            numRan = randObject.nextInt();
            System.out.println(numRan);

            int x = randObject.nextInt(21) -10; // Is the same as randObject.nextInt(10 - (-10) +1) + (-10);


        }

        // Random mums
        //A random number between 1 and 47 inclusive
        //int random1 = randObject.nextInt(47) + 1;

        //A random number between 23 and 30 inclusive
        //int random2 = randObject.nextInt(8) + 23;

        //A random number between 4 and 12 inclusive
        //int random3 = randObject.nextInt(8) + 4;

        System.out.println();

        // Print the methods
        printStar();
        printStrings("abc", 5);

        // Make space
        System.out.println();

        // Question 4
        for(int i = 1; i < 11; i++) {

            System.out.print((i * i) + " ");

        }


        mystery(2);
        mystery(5);
        mystery(24);
        mystery(28);

        System.out.println("The abs is " + findAbs(7, -2, -11));
        System.out.println("The abs is " + findAbs(-4, 5, 2));
        System.out.println("The abs is " + findAbs(6, 4, -3));


    }

    // Question 6
//    public static void main(String[] args) {
//        int x = 1; int y = 2; int z = 3;
//        z = mystery(y, x, y);
//        System.out.println(x + " " + y + " " + z);
//        x = mystery(z, y, x);
//        System.out.println(x + " " + y + " " + z);
//        y = mystery(z, y, y);
//        System.out.println(x + " " + y + " " + z);
//    }
//    public static int mystery(int z, int x, int y) {
//        z--;
//        x = 2 * y + z;
//        y = x - 1;
//        System.out.println(y + " " + z);
//        return x;
//    }


    public static int findAbs(int num1, int num2, int num3) {

        int abs = 0;

        if (Math.abs(num1) > Math.abs(num2)) {

            if (Math.abs(num1) > Math.abs(num3)) {
                abs = Math.abs(num1);
            } else {
                abs = Math.abs(num3);
            }

        } else {

            if (Math.abs(num2) > Math.abs(num3)) {

                abs = Math.abs(num2);

            } else {

                abs = Math.abs(num3);

            }

        }

        return abs;

    }

    // Question 9
    public static void mystery(int n) {
        int x = 1;
        int y = 2;
        while (y < n) {
            if (n % y == 0) {
                n = n / y;
                x++;
            } else {
                y++;
            }
        }
        System.out.println(x + " " + n); }

//    public static final int NUMBER = 42;
//
    // Question 8
//    public static void main(String[] args) {
//        int answer = sum(4, NUMBER, 2);
//        answer = answer + 10;
//        System.out.println("The value of answer is " +
//                answer);
//    }
//
//    public static int sum(int a, int b, int c) {
//        int answer = a + b + c;
//        System.out.println("The value of answer is " + answer);
//        return answer;
//    }

    // Methods

    // Question 2
    public static void printStar() {

        String x = "*";

        for(int i = 0; i < 5; i++) {
            System.out.println(x);
            x += "*";
        }

    }

    // Question 3
    public static void printStrings(String stringToPrint, int numberOfTimes) {

        for(int i = 0; i < numberOfTimes; i++) {

            System.out.print(stringToPrint);

        }

    }


    // Question 7
    // Ones place  int digit = number % 10;
    // The right two digits int lastTwoDigit = number % 100;

    // If number = 12345
    //number % 10 = 5
    //number % 100 = 45
    //number % 1000 = 345
    //number % 10000 = 2345
    //number % 10000 = 12345

    //number / 10000 = 1
    //number / 1000 = 12
    //number / 100 = 123
    //number / 10 = 1234
    //number / 1 = 12345


    // Question 10

    // Question 11








}
