public class valueReturn {


    public static void main(String[] args) {

        int x = 10;
        int y;
        String word = "Fig Newton is a good cookie";
        String replaceWord;


        y = sendBack(x);
        replaceWord = censorWord(word);

        System.out.println(y);
        System.out.println(sendBack(x));
        System.out.println();
        System.out.println(word);
        System.out.println(replaceWord);




    }

    // Simply returns a number plus 10
    public static int sendBack(int num) {

        num += 10;

        return num;

    }

    public static String censorWord(String badword) {

        String newWord = "";
        for(int i = 1; i < badword.length(); i++) {

            newWord = newWord += "#";

        }

        return newWord;

    }


}
