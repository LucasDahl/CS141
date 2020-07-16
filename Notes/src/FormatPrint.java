public class FormatPrint {

    public static void main(String[] args) {

        double x = 987654321.123;

        System.out.printf("--$%.2f", 987.654);
        System.out.println();

        System.out.printf("The number is -- %,20.2f.", x);
        System.out.println();

        for(int i =1; i < 101; i++) {

            System.out.printf("%4d%n", i);

        }

    }

}
