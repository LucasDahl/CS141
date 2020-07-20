public class examOnePractice {

    // Key
    // 1 = Understood
    // 2 = Understood
    // 3 = Understood
    // 4 = Understood
    // 5 = Understood
    // 6 = understood
    // 7 =
    // 8 = Understood
    // 9 = Understood
    // 10 =
    // 11 =

    public static void main(String[] args) {

         //Properties
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


        mystery(2);
        mystery(5);
        mystery(24);
        mystery(28);

        System.out.println("The abs is " + findAbs(7, -2, -11));
        System.out.println("The abs is " + findAbs(-4, 5, 2));
        System.out.println("The abs is " + findAbs(6, 4, -3));


    }

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
