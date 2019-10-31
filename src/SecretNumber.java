import java.util.Random;
import java.util.Scanner;
public class SecretNumber {
    public static void main( String [] args ) {
        Scanner guess1 = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 50.");

        int inputNum1 = guess1.nextInt();

        Random randy = new Random();
        int randomNumber = randy.nextInt(50) + 1;
        if(randomNumber == inputNum1)
        {
            System.out.println("Thats right!");
        }
        else
        {
            System.out.println("Wrong! Guess again!");
        }
        Scanner guess2 = new Scanner(System.in);
        int inputNum2 = guess2.nextInt();
        if(randomNumber == inputNum2 )
        {
            System.out.println("Thats right!");
        }
        else
        {
            System.out.println("Wrong! One more try!");
        }
        Scanner guess3 = new Scanner(System.in);
        int inputNum3 = guess3.nextInt();
        int decidingNum = randomNumber - inputNum3;

        if(randomNumber == inputNum3 )
        {
            System.out.println("Thats right!");
        }
        else
        {
            System.out.println("Wrong!");
        }
        if ( randomNumber != inputNum3 && decidingNum>3)
            System.out.println("You missed by a mile!");
            if(randomNumber != inputNum3 && decidingNum < 3)
                System.out.println("You were close! Better luck next time!");

    }
}
