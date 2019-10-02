import java.util.*;
import java.util.Scanner;
public class CodingPhrase {
    public static void main( String [] args ) {
        Scanner FirstCode = new Scanner(System.in);
        System.out.println("What is the word to be coded?");

        String FirstWord = FirstCode.nextLine();
        System.out.println("What is the key for the code?");

        int key = FirstCode.nextInt();

        Random randy = new Random(97 + 33);

        int longPhrase = FirstWord.length();
        String phrase2 = " ";

        for (int j = 1; j <= longPhrase; j++) {

            phrase2 += FirstWord.charAt(0);

            for (int i = 1; i <= key; i++) {
                int a = randy.nextInt(97) + 33;
                char c = (char) a;
                phrase2 += c;
            }
            FirstWord = FirstWord.substring(1);

        }
        System.out.println(phrase2);
    }
    }

