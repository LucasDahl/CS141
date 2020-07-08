// Lucas Dahl, CS 141, Summer 20, Section 2851
//
// Assignment #2 7/1/20
// Due 7/6/20
//
// This program is used to display mississippi using methods

public class SpellMississippi {

    // Letter helper methods

    // M
    public static void sideM() {

        System.out.println("M     M");

    }

    public static void inwardM() {

        System.out.println("MM   MM");

    }

    public static void mLine() {

        System.out.println("M M M M");

    }

    public static void mMiddle() {

        System.out.println("M  M  M");

    }

    // I
    public static void topBtmI() {

        System.out.println("IIIIIIII");

    }

    public static void stemI() {

        System.out.println("   I");

    }

    // S
    public static void sLine() {

        System.out.println(" SSSSSS");

    }

    public static void sDoubleLine() {

        System.out.println("S     S");

    }

    // P
    public static void topP() {

        System.out.println("PPPPP");

    }

    public static void downP() {

        System.out.println("P");

    }

    public static void pBlock() {

        System.out.println("P    P");


    }


    // These methods print the actual letters
    public static void letterM() {

        sideM();
        inwardM();
        mLine();
        mMiddle();
        sideM();
        sideM();
        sideM();

    }

    public static void letterI() {

        topBtmI();
        stemI();
        stemI();
        stemI();
        stemI();
        stemI();
        topBtmI();


    }

    public static void letterS() {

        sLine();
        sDoubleLine();
        System.out.println("S");
        sLine();
        System.out.println("      S");
        sDoubleLine();
        sLine();

    }

    public static void letterP() {

        topP();
        pBlock();
        pBlock();
        topP();
        downP();
        downP();
        downP();
        downP();

    }

    // The main Method
    public static void main(String[] args) {

        letterM();
        letterI();
        letterS();
        letterS();
        letterI();
        letterS();
        letterS();
        letterI();
        letterP();
        letterP();
        letterI();


    }

}
