
import java.util.Scanner;
public class Names {
    public static void main( String [] args )
    {
        Scanner nameScan = new Scanner(System.in);
        System.out.println("What is your name?");

        String firstName = nameScan.next();
        System.out.println("Hey there " + firstName);

        System.out.println("You have " + firstName.length());
                System.out.print(" letters in your name.");

    }
}
