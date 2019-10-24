import java.util.Random;
import java.util.Scanner;
public class Golf {
    public static void main(String[] args) {


        Scanner Scanny = new Scanner(System.in);
        System.out.println("What is your score?");

        int score = Scanny.nextInt();

        if (score > 72) {
            System.out.println("You suck. Over par.");
        }
        if (score == 72) {
            System.out.println("You're allright I guess.");
        } else {
            System.out.println("Way to go! Below par!");
        }
    }
}