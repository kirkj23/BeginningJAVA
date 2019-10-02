import java.util.Random;
import java.util.Scanner;
public class RandomNumberStuff {
    public static void main( String [] args ) {
        Scanner guess1 = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 20.");

        int inputNum1 = guess1.nextInt();

        Random randy = new Random();
        int randomNumber = randy.nextInt(20) + 1;
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
            System.out.println("Wrong! You suck at this!");
            System.out.println("You were " + decidingNum);
            System.out.print(" Off!");
        }

        }
        }









