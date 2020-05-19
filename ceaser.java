import java.util.Scanner;
public class ceaser {
    final public static Scanner keyboard = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter word(s) you would like to cipher: ");
        String userWord = keyboard.nextLine();
        System.out.println("Enter cipher amount: ");
        int userAmt = keyboard.nextInt();
        System.out.println(encode(userWord,userAmt));
    }
    public static String encode(String word, int cipher) {
        String before = word.toLowerCase();
        String after = "";
        String afterWord = "";
        for(int i = 0; i < before.length(); i++) {
            char ltr = before.charAt(i);
            if(!after.isEmpty()) {
                after += "";
            }
            int pos = (int)ltr - (int)'a' + 1;
            if(pos == -64) {
                afterWord += " ";
                continue;
            } else {
                afterWord += getCharForNumber(pos + cipher);
            }
        }
        return afterWord.toLowerCase();
    }
    private static String getCharForNumber(int i) {
        return i > 0 && i < 27 ? String.valueOf((char)(i + 'A' - 1)) : null;
    }
}
