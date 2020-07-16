public class NotesOnStrings {

    public static void main(String[] args) {

        String s1 = "apple";
        String s2 = "apple1";


        if (s1.equals(s2)) { // This is the proper way to compare to objects.

            System.out.println("They are the same");

        } else {

            System.out.println("They are different");

        }

    }

}
